import java.util.*;
import java.util.Map.Entry;

public class HashMapPractice {

	public static void main(String[] args) {
		LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
		
		map.put("Kelvin", 5000);
		map.put("Noah", 2000);
		map.put("Abby", 1000);
		
		System.out.println(map.get("Kelvin"));
		System.out.println(map.get("Noah"));
		
		for(Entry<String, Integer> entry : map.entrySet())
			System.out.println(entry.getValue());
	}

}