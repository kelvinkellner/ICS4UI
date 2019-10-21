import java.util.*;
import java.util.Map.Entry;

class Person {
	String name = "";
	
	Person(String n)
	{
		name = n;
	}
	
	String Name()
	{
		return name;
	}
}

public class TreeMapPractice2 {

	public static void main(String[] args) {
		TreeMap<Integer, Object> map = new TreeMap<Integer, Object>();
		
		map.put(5000, new Person("Kelvin"));
		map.put(2000, new Person("Noah"));
		map.put(100, new Person("John"));
		map.put(3000, new Person("Mark"));
		
		System.out.println(map.get(5000));
		System.out.println(map.get(100));
		
		for(Entry<Integer, Object> entry : map.entrySet())
		{
			System.out.println(((Person) entry.getValue()).Name() + " - $" + entry.getKey());
		}
	}

}