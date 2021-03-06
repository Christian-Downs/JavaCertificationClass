package Assignment;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Iterator;

public class HashMapDemo {
	public static void main(String[] args)
	{
		Map<Integer,String> hm = new HashMap<Integer,String>();
		
		hm.put(100, "Java");
		hm.put(100, "openjdk"); 
		hm.put(199, "Java");
		hm.put(300, "Java");
		hm.put(900, null);
		hm.put(1000, null);
		hm.put(22, "Java");
		hm.put(99, "driver");
		hm.put(45, null);
		hm.put(800, "Jee");
		hm.put(500, "Jse");
		hm.put(400, "Jee");
		System.out.println("Map before deletion");
		System.out.println("hm = "+hm);

//		for(Entry<Integer, String> e : hm.entrySet()) {
//			if(e.getValue()==null || e.getKey()%10==0) {
//				hm.remove(e.getKey());
//			}
//		}
		
		Iterator<Entry<Integer,String>> i = hm.entrySet().iterator();
		while(i.hasNext())
		{
			Entry<Integer,String> e = i.next();
			if(e.getValue()==null||e.getKey()%10==0)
			{
				i.remove();
			}
		}
		
		
		System.out.println(hm);
	}
}
