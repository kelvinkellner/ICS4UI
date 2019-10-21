import java.util.*;

public class NailedItATTEMPT4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		scan.nextLine();
		String line = scan.nextLine();
		String[] split = line.split(" ");
		
		ArrayList<Integer> wood = new ArrayList<Integer>();
		ArrayList<Integer> used = new ArrayList<Integer>();
		
		for(int i=0;i<split.length;i++)
		{
			wood.add(Integer.parseInt(split[i]));
		}
		
		Collections.sort(wood);
		
		int length=0;
		int maxLength=0;
		int maxWays=0;
		
		for(int i=2;i<4000;i++)
		{
			length=0;
			
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
