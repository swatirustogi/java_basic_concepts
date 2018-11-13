package practice;

public class inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj = new B(10,20);
		obj.display();
		A objA = new B();
		
		objA.display();
		
	}

}

class A
{
	int x1;
	A()
	{
		
	}
	A(int x1)
	{
		this.x1 = x1;
	}
	public void display()
	{
		System.out.println(x1);
	}
}

class B extends A
{
	int x1;
	B()
	{
		
	}
	B(int x1, int x2)
	{
		super(x1);
		this.x1=x2;
	}
	public void display()
	{
		System.out.println("super x " + super.x1);
		System.out.println(x1);		
	}
	
}