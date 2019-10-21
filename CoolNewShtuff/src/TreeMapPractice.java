import java.util.*;

public class TreeMapPractice {

	public static void main(String[] args) {
		TreeMap<String, Integer> map = new TreeMap<String, Integer>();
		
		map.put("Kelvin", 5000);
		map.put("Noah", 2000);
		map.put("John", 100);
		map.put("Mark", 3000);
		
		System.out.println(map.get("Kelvin"));
		System.out.println(map.get("Noah"));
		
		/*
		for(Entry<String, Integer> entry : map.entrySet())
		{
			entry.setValue(50);
			System.out.println(entry.getKey() + " - $" + entry.getValue());
		}
		*/
	}

}