package practice;

public class NestedClassEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NestedClassEx1 obj = new NestedClassEx1();
		NestedClassEx1.NestedClassEx2 obj1 = obj.new NestedClassEx2();
		obj1.display();
		
	}

}

class NestedClassEx1
{
	private int a = 10;
	public void display()
	{
		System.out.println("outer clas " + a);
	}
	class NestedClassEx2
	{
		int b = 20;
		public void display()
		{
			System.out.println(a);
		}
		
	}
}
