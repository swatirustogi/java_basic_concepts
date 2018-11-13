package practice;

import java.util.StringTokenizer;

public class StringTokenizerexample {
	public static void main(String args[])
	{
		StringTokenizer st=new StringTokenizer("Sara is a cute girl");
		while(st.hasMoreTokens())
			System.out.println(st.nextToken());
	}
}
