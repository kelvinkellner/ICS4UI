 
import java.io.*;
public class HelpEla
{
  public static void main (String[]args) throws IOException
  {
	
 FileReader myInputFile = new FileReader("text1.txt");
 BufferedReader myInput = new BufferedReader(myInputFile);
	
	
 FileWriter myOutputFile = new FileWriter("output.txt");
 PrintWriter writer = new PrintWriter(myOutputFile);
	
	
 try
 {
   String input = myInput.readLine();
  
   int [] years = new int[4];
   boolean repeatsDigit = true; // EDIT: try to make your variable names specific whenever you can. "truefalse" oesn't really describe the booleans purpose. Something like "repeatsDigit" may be a lot more useful when someone else looks at your code for the first time (especially Ms. Cooper)
  
   for(int i =0; i<4; i++) // file is 4 lines long
   {
	 input = myInput.readLine();
	 years[i] = Integer.parseInt(input);  // fill array with each line of file and convert to integers
   }
  
   for (int i=0; i<years.length; i++) // loop the length of the array
   {
	 do
	 {
    	 repeatsDigit=false; // Reset back to false so that we can try again every time we add one or anything
    	 years[i]++; // add one year
    	 
          	 String line = years[i] + ""; // change year in the array to a string
          	 int length = line.length(); // check length of the year
         	 
          	 char []  individual = new char [length];
         	 
          	 for(int n=0; n<length;n++) // loop as long as the year is minus 1 (if it's 1987, loop 3 times)
          	 {
            	 char ch = line.charAt(n); // make ch equal to the first number
           	 
            	 individual [n] = ch; // fill array with each number
          	 }
          	 for(int n=0; n<length;n++) // loop as long as the year is minus 1 (if it's 1987, loop 3 times)
          	 {
          	  for(int o=n+1; o<length; o++)
          	  {
          	   if(individual[n]==individual[o]) // if the character of the array is equal to the next character of the array, set boolean to false
          	   {
          	    repeatsDigit = true;
          	   } // EDIT: deleted else. cuz otherwise we may overwrite the fact that a previous digit repeated. If any digit is repeated we want to permanently change repeatsDigit to true. For example, before, if the year was 2215, it would compare 2 and 2, which is true, but then it would compare 2 and 1 which is false, overwriting the previous change. We only care if the value is true. If it is false, we do nothing.
          	  }
        	 }
    	 } while(repeatsDigit==true);
	 }
   
   for (int i=0; i<years.length; i++)
    {
     writer.println(years[i]);
    }
    writer.println();
   }
 catch (FileNotFoundException error) // catch error if file not found
 {
   System.out.println("File not found");
 }
 catch (IOException error) // catch error if there is a problem with reading the file
 {
   System.out.println("There was a problem reading the file");
 }
 
 writer.close();
 myInput.close();
  }
}

