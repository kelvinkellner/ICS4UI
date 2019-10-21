import java.util.*;
import java.util.Map.Entry;

public class Q2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//Prove N = (A + B)/2
		
		int t = scan.nextInt();
		int[] n = new int[t];
		
		for(int i = 0; i<t; i++)
			n[i] = scan.nextInt();
		
		LinkedHashMap<Integer, Boolean> primes = new LinkedHashMap<Integer, Boolean>();
		
		for(int i=0;i<3*n[n.length-1];i++)
		{
			primes.put(i, checkPrime(primes, i));
		}
		
		int[] prime = new int[primes.size()];
		
		int count = 0;
		for(Entry<Integer, Boolean> entry : primes.entrySet())
		{
			if(entry.getValue().equals(true)&&entry.getKey()>2)
			{
				prime[count] = entry.getKey();
				System.out.println("Prime: " + prime[count]);
				count++;
			}
		}
		
		for(int k=0;k<n.length;k++)
		{
			for(int i=0;i<=n[k];i++)
			{
				for(int j=i;j<=n[k];j++)
				{
					if((double)(prime[i]+prime[j])/2.0==(double)n[k])
					{
						System.out.println(prime[j] + " " + prime[i]);
						j=prime.length;
						i=prime.length;
					}
				}
			}
		}
		scan.close();
	}
	
	public static boolean checkPrime(HashMap<Integer, Boolean> primes, int i)
	{
		if(!primes.containsKey(i))
		{
			for (int j=2;j<i/2;j++)
			{
				if((double)(i)/(double)(j)%1==0)
				{
					return false;
				}
			}
			return true;
		}
		else
		{
			return primes.get(i);
		}
	}

}
