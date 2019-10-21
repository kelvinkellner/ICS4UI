import java.util.*;

class Account {
	String name;
	int money;
	
	Account(String n, int m)
	{
		name = n;
		money = m;
	}
	
	int Money()
	{
		return money;
	}
	
	String Name()
	{
		return name;
	}
}

public class LinkedListPractice {

	public static void main(String[] args) {
		ArrayList<String> line = new ArrayList<String>();
		ArrayList<Object> accs = new ArrayList<Object>();
		
		String[] names = {"Cameron","Noah","Lauren","Marco","Ela","Sara","Jacob","Brian","Soy","Kelvin","Aden","Homer","Talha"};
		
		Random random = new Random();
		
		for(int i=0;i<8;i++)
		{
			int num = random.nextInt(names.length-1);
			System.out.println(names[num] + " has entered the line");
			line.add(names[num]);
			accs.add(new Account(names[random.nextInt(names.length-1)], 100));
		}
		
		System.out.println();
		
		for(int i=0;i<2;i++)
		{
			System.out.println(line.get(line.size()-1) + " has left the line");
			line.remove(line.size()-1);
			
			System.out.println(((Account) accs.get(i)).Name());
		}
		
		
	}

}
