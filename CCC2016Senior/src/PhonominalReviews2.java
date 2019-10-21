import java.util.*;
import java.io.*;

class Node<T>
{
	T val = null;
	List<Node<T>> connects = new ArrayList<>();
	
	public Node(T val)
	{
		this.val = val;
	}
	
	public Node(T val, Node<T> newLink)
	{
		this.val = val;
		newLink.connects.add(this);
		connects.add(newLink);
	}
	
	public int distance(Node<T> destination)
	{
		if(this.connects.isEmpty())
			return -1;
		else if(this.equals(destination))
			return 0;
		else
		{
			int amount = 0;
			for(int i=0;i<connects.size();i++)
				amount+= 1 + connects.get(i).distance(destination);
			return amount;
		}
	}
	
	public void connect(Node<T> connect)
	{
		this.connects.add(connect);
	}
}

public class PhonominalReviews2 {
	public static void main(String[] args) throws IOException
	{
		FileReader file = new FileReader("Pho.txt");
		BufferedReader read = new BufferedReader(file);
		
		String line = read.readLine();
		int n = Integer.parseInt(line.split(" ")[0]);
		int m = Integer.parseInt(line.split(" ")[1]);
		
		String[] in = read.readLine().split(" ");
		int[] phos = new int[m];
		for(int i=0;i<phos.length;i++)
			phos[i]=Integer.parseInt(in[i]);
		
		List<Node<Integer>> r = new ArrayList<Node<Integer>>();
		boolean[] used = new boolean[100000];
		for(int i=0;i<used.length;i++)
			used[i]=false;
		
		for(int i=0;i<n;i++)
		{
			line = read.readLine();
			int n1 = Integer.parseInt(line.split(" ")[0]);
			int n2 = Integer.parseInt(line.split(" ")[1]);
			if(!used[n1] && !used[n2])
			{
				used[n1]=true;
				used[n2]=true;
				Node<Integer> node1 = new Node<Integer>(n1);
				Node<Integer> node2 = new Node<Integer>(n2, node1);
				node1.connect(node2);
			}
			else if(used[n1] && used[n2])
			{
				int first = -1;
				int second = -1;
				for(int j=0;j<r.size();j++)
				{
					if(first>=0 && second >=0)
						j=r.size();
					else
					{
						if(r.get(j).val.equals(n1))
							first = j;
						if(r.get(j).val.equals(n2))
							second = j;
					}
				}
				r.get(first).connect(r.get(second));
				r.get(second).connect(r.get(first));
			}
			else if(used[n1] && !used[n2])
			{
				for(int j=0;j<r.size();j++)
				{
					if(r.get(j).val.equals(n1));
					{
						used[n2]=true;
						Node<Integer> node2 = new Node<Integer>(n2,r.get(j));
						r.get(j).connect(node2);
					}
				}
			}
			else if(!used[n1] && used[n2])
			{
				for(int j=0;j<r.size();j++)
				{
					if(r.get(j).val.equals(n2));
					{
						used[n1]=true;
						Node<Integer> node1 = new Node<Integer>(n1,r.get(j));
						r.get(j).connect(node1);
					}
				}
			}
		}
	}
}
