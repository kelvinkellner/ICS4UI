import java.io.*;

public class SrProblem3
{
  public static void main(String[] args) throws IOException
  {
    FileReader file = new FileReader("DATA3.txt");
    @SuppressWarnings("resource")
	BufferedReader read = new BufferedReader(file);
    
    int g = Integer.parseInt(read.readLine());
    int p = Integer.parseInt(read.readLine());
    
    int[] planes = new int[p];
    int[] fill = new int[g];
    
    for(int i=0;i<g;i++)
      fill[i]=0;
    
    int count = 0;
    
    for(int i=0;i<p;i++)
    {
      planes[i] = Integer.parseInt(read.readLine());
      boolean check = false;
      for(int j=fill.length-1;j>=0;j--)
      {
        if(fill[j]==0)
        {
          fill[j]=1;
          count++;
          check=true;
          j=0;
        }
      }
      if(check==false)
        i=p;
    }
    
    System.out.println(count);
  }
}