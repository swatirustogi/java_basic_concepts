package practice;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashtableEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable hm = new Hashtable();
		hm.put("1", 1);
		hm.put("2", 2);
		hm.put("3", 3);
		
		Enumeration en = hm.keys();
		String key;
		while(en.hasMoreElements())
		{	
			key = (String)en.nextElement();
			System.out.println(hm.get(key));
		}	
		
		Set s = hm.entrySet();
		Iterator itr = s.iterator();
		while(itr.hasNext())
		{
			Map.Entry entry = (Map.Entry)itr.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
			
	}

}
