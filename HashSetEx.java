package practice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set S = new HashSet();
		Set S1 = new HashSet(10);
		S.add(1);
		S.add(2);
		S.add(3);
		
		System.out.println(S.toString());
		Iterator itr = S.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());

	}

}
