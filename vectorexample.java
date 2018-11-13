package practice;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;

public class vectorexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector v = new Vector();
		v.add(1);
		System.out.println(v.capacity() + "  " + v.size());
		Vector v1 = new Vector(20);
		System.out.println(v1.capacity() + "  " + v1.size());
		int x[]= {2,3,4};
		v.addAll(Arrays.asList(x));
		v.insertElementAt(1, 0);
		System.out.println(v.toString());
		
		v1.add(1);
		v1.add(2);
		Vector v2 = new Vector();
		v2.add(1);
		v1.retainAll(v2);
		System.out.println(v1.toString());
		
		//iterator
		Iterator itr = v1.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		//Vector of vectors
		Vector<Vector> varr = new Vector<Vector>();
		varr.add(v1);
		varr.add(v2);
		for(int i =0; i<varr.size();i++)
		{
			System.out.println(varr.get(i).toString());
		}
		

	}

}
