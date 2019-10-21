import java.util.ArrayList;

class Node
{
	Node parent;
	ArrayList<Node> kids = new ArrayList<Node>();
	
	int num;
	boolean pho;
	
	Node(int n, boolean isPho)
	{
		num=n;
		pho=isPho;
	}
	
	Node(int n, Node p, boolean isPho)
	{
		num=n;
		parent=p;
		p.kids.add(this);
		pho=isPho;
	}
	
	int distance(Node n)
	{
		return calculateDistance(n);
	}
	
	int calculateDistance(Node n)
	{
		if(this.equals(n))
			return 0;
		else if(this.kids.contains(n))
			return 1;
		else if(n.parent!=null)
			return 1 + distance(n.parent);
		else if(this.parent!=null)
			return 1 + this.parent.distance(n);
		else
			return -1;
	}
}

public class PhonominalReviews {
	
	public static void main(String[] args)
	{
		Node[] n = new Node[8];
		n[0] = new Node(0,true);
		n[1] = new Node(1,n[0],false);
		n[2] = new Node(2,n[0],false);
		n[3] = new Node(3,n[2],true);
		n[4] = new Node(4,n[3],true);
		n[5] = new Node(5,n[1],false);
		n[6] = new Node(6,n[1],true);
		n[7] = new Node(7,n[3],true);
		
		int farthest = 0;
		Node start = null;
		
		for(int i=0;i<n.length;i++)
		{
			if(n[i].pho)
			{
				for(int j=0;j<n.length;j++)
				{
					if(!n[i].equals(n[j]) && n[j].pho)
					{
						int distance = n[i].distance(n[j]);
						if(distance>farthest)
						{
							farthest=distance;
							start=n[j];
						}
					}
				}
			}
		}
		
		//int total = 0;
		for(int i=0;i<start.kids.size();i++)
		{
				
		}
		
		System.out.println(start.num + " " + farthest);
	}
	
}