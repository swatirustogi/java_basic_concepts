package practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;


public class ArrayListex {
	public static void main(String args[])
	{
		List l = new ArrayList();
		l.add(1);
		l.add(null);
		l.add(3);
		System.out.println(l.toString());
		l.set(1, 2);
		System.out.println(l.toString());
		Object[] obj =  l.toArray();
		for(int i =0;i<obj.length;i++)
			System.out.println((Integer)obj[i]);
		
		
		
		//LINKEDLIST
		System.out.println("linkedlist");
		
		List l1 = new LinkedList();
		LinkedList<LinkedList<Integer>> n;
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		
		//For reverse iterator
		ListIterator itr = ((LinkedList)l1).listIterator(l1.size());
		while(itr.hasPrevious())
			System.out.println(itr.previous());
	}
}
