package test03;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		Map<String, Long> map = new HashMap<>();
		
		map.put("Makarand", 9876543210L);
		map.put("Test", 98076542310L);
		
		Set<Entry<String, Long>> entries =  map.entrySet();
		
		for(Entry<String, Long> entry : entries) {
			System.out.println(entry.getKey()+" = "+entry.getValue());
		}
	}
}
