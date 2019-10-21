import java.io.*;

public class SrProblem2
{
  public static void main(String[] args) throws IOException
  {
    FileReader file = new FileReader("DATA2.txt");
    BufferedReader read = new BufferedReader(file);
    
    int j = Integer.parseInt(read.readLine());
    int a = Integer.parseInt(read.readLine());
    
    int[] stock = new int[j];
    
    for(int i = 0; i<j;i++)
    {
      String size = read.readLine();
      int value;
      if(size.equals("S"))
        value = 0;
      else if(size.equals("M"))
        value = 1;
      else
        value = 2;
      
      stock[i] = value;
    }
    
    int[][] ath = new int[a][2];
    
    for(int i = 0; i<a; i++)
    {
      String[] split = read.readLine().split(" ");
      
      if(split[0].equals("S"))
        ath[i][0] = 0;
      else if(split[0].equals("M"))
        ath[i][0] = 1;
      else
        ath[i][0] = 2;
      
      ath[i][1] = Integer.parseInt(split[1]);
    }
    
    int sat = 0;
    
    for(int i = 0; i<stock.length; i++)
    {
      for(int k=0; k<ath.length; k++)
      {
        if(ath[k][1] == i && ath[k][0] == stock[i])
        {
          stock[i]=3;
          sat++;
        }
      }
    }
    
    for(int i = 0; i<stock.length; i++)
    {
      for(int k=0; k<ath.length; k++)
      {
        if(ath[k][1] == i && ath[k][0] <= stock[i] && stock[i]!=3)
        {
          stock[i]=3;
          sat++;
        }
      }
    }
    
    System.out.println(sat);
    file.close();
  }
}