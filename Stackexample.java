package practice;

import java.util.Stack;

public class Stackexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack stk = new Stack();
		stk.push(1);
		stk.push(2);
		stk.push(3);
		stk.push(4);
		stk.push(5);
		int position = stk.search(3);
		for(int i =stk.size();i>=position;i--)
			System.out.println(stk.pop());
		
	}

}
