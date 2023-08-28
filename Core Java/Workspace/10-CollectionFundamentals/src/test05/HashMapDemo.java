package test05;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("Mahendra", 41);
		map.put("Sachin", 50);
		map.put("Virat", 34);
		map.put("Rohit", 36);
		map.put("Yuvraj", 40);
		
		//System.out.println(map);
		
		Set<String> set = map.keySet();
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			String key = itr.next();
			int value = map.get(key);
			System.out.println("Key = "+key+", Value = "+value);
		}
	}
}






