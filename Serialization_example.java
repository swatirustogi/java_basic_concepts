package practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serialization_example {

	public static void main(String[] args)  {
		Demo d = new Demo(2,"hello");
		FileOutputStream fout=null;
		ObjectOutputStream ostream=null;
		FileInputStream fin=null;
		ObjectInputStream istream=null;
		try
		{
		 fout = new FileOutputStream("f1");
		 ostream = new ObjectOutputStream(fout);
		ostream.writeObject(d);
		 fin = new FileInputStream("f1");
		 istream = new ObjectInputStream(fin);
		Demo d1 = (Demo)istream.readObject();
		System.out.println(d1.a);
		System.out.println(d1.b);
		fin.close();
		fout.close();
		
		
		}
		catch(IOException e)
		{
			
		}
		catch(ClassNotFoundException e)
		{
			
		}
		finally
		{
			
		}
	}

}

class Demo implements Serializable
{
	int a;
	String b;
	Demo(int a, String b)
	{
		this.a = a;
		this.b = b;
	}
}
