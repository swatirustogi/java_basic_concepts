package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputfromUser {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char c = 'z';
		while(c!='q')
		{	
			c=(char)br.read();
			System.out.println(c);
		}
	}

}
