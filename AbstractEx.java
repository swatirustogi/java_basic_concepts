package practice;

public abstract class AbstractEx {
	abstract void method1();
	
}

class C extends AbstractEx
{

	@Override
	void method1() {
		// TODO Auto-generated method stub
		System.out.println("method1");
	}
	
	
}

class test
{
	public static void main(String args[])
	{
		C obj = new C();
		obj.method1();
	}
}