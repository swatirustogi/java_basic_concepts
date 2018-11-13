package practice;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class TreesetEx {
	public static void main(String args[])
	{
		String str[]= {"Hello","world","Hi", "Good","Girl","Boy"};
		Set S = new TreeSet();
		for(int i = str.length-1;i>-1;i--)
		{
			S.add(str[i]);
		}
		System.out.println(S.toString());
		System.out.println(((TreeSet)S).comparator());//no comparator used so natural ordering
		
		Set S1 = new TreeSet(Collections.reverseOrder());
		
		for(int i = str.length-1;i>-1;i--)
		{
			S1.add(str[i]);
		}
		System.out.println(S1.toString());
		System.out.println(((TreeSet)S1).comparator());//no comparator used so natural ordering

		System.out.println(((TreeSet)S1).first());
		System.out.println(((TreeSet)S1).last());
		
	}

}
