package practice;

public class StaticEx {
	
	static int a = 10;
	
	static
	{
		a = 20;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticEx2.display();
	}

}

class StaticEx2
{
	static int a = 10;
	
	static
	{
		a = 20;
	}

	static void display(int ...v)
	{
		System.out.println(a);
	}
}
