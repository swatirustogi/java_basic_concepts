package practice;

import java.util.Iterator;

public class arrayex {
	public static void main(String[] args)  {
		int a[]=new int[2];
		int b[]= {1,2,3,4};
		int c[];
		c=new int[2];
		c[0]=10;
		c[1]=20;
		int[][] x = new int [2][2];
		int[][] x1 = new int[4][];
		for(int i = 0;i<4;i++)
			x1[i]= new int[2];
		int x2[][] = {{2,3},{4,5}};
		
		//print 2d array
		System.out.println("Print 2d array");
		
		for(int num[]:x2)
			for(int i:num)
				System.out.println(i);
			
		
		int[] arr = function1(c);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println("double size of arr array");
		
		int[] newarr = new int[4];
		System.arraycopy(arr, 0, newarr, 0, arr.length);
		for (int i:newarr)
			System.out.println(i);
		
		int[] clonearr=arr.clone();
		
	}
	
	static int[] function1(int[] x)
	{
		int[] arr;
		for(int i=0;i<x.length;i++)
			x[i] = x[i] + 10;
		
			arr=x;
			return arr;
	}
}
