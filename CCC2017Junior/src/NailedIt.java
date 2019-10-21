import java.util.*;
import java.util.Map.Entry;

public class NailedIt {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		scan.nextLine();
		String line = scan.nextLine();
		String[] split = line.split(" ");
		
		TreeMap<Integer,Integer> wood = new TreeMap<Integer,Integer>();
		TreeMap<Integer,Integer> used = new TreeMap<Integer,Integer>();
		
		for(int i=0;i<split.length;i++)
			wood.put(Integer.parseInt(split[i]), 0);
		
		int count = 0;
		
		for(Entry<Integer, Integer> entry : wood.entrySet())
		{
			entry.setValue(count);
			count++;
		}
		
		int length=0;
		int maxLength=0;
		int maxWays=0;
		
		for(int i=2;i<4000;i++)
		{
			length=0;
			
			count = 0;
			
			for(Entry<Integer, Integer> entry : wood.entrySet())
			{
				for(Entry<Integer, Integer> e2 : wood.entrySet())
				{
					if(entry.equals(wood.get(e2)))
						length++;
				}
			}
			
			wood.addAll(used);
			used.clear();
			Collections.sort(wood);
			
			for(int j=0;j<wood.size();j++)
			{
				if(wood.get(j)<i)
				{
					for(int k=j+1;k<wood.size();k++)
					{
						if(wood.get(j)+wood.get(k)==i && wood.get(j)!=0 && wood.get(k)!=0)
						{
							length++;
							//System.out.println(i + "," + wood.get(j) + "," + wood.get(k) + "," + length);
							used.add(wood.get(j));
							used.add(wood.get(k));
							wood.remove(j);
							wood.remove(k-1);
							k--;
						}
					}
				}
			}
			if(length>maxLength)
			{
				maxLength=length;
				maxWays=1;
			}
			else if(length==maxLength)
				maxWays++;
		}
		
		System.out.println(maxLength + " " + maxWays);
		
		scan.close();
	}

}
