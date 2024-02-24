package arraypac;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Collections {

	
	public static void main(String[] args) {
		
		
		
		
		Map<Integer,String > hm = new LinkedHashMap<Integer, String>() ; 
		

  hm.put(1, "raij");
  hm.put(2, "ranjith");
  hm.put(3, "ravi");
  hm.put(4, "tharum");
  hm.put(5, "raj");
  System.out.println(hm);
  
  Set<Integer> keySet = hm.keySet();
  System.out.println(keySet);
  
 
  
  Collection<String> values = hm.values();
  System.out.println(values);
  
  Set<Entry<Integer, String>> entrySet = hm.entrySet();
  
  for (Entry<Integer, String> entry : entrySet) {
	String value = entry.getValue();
	System.out.print(value);
	Integer key = entry.getKey();
	System.out.println(key);
	  System.out.println(entry);
	
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
