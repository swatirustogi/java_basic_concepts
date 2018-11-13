package practice;

class PrintClass
{

	synchronized public void print(String s) throws InterruptedException
	{
		System.out.print("[" + s);
		Thread.sleep(1000);
		System.out.println("]");
		
	}
}

class UsePrint implements Runnable
{
	PrintClass p;
	String s;
	UsePrint(PrintClass p, String s)
	{
		this.p= p;
		this.s = s;
	}
	public void run()
	{
		try
		{
			p.print(s);
		}
		catch(InterruptedException e)
		{
			
		}
	}
		
}

public class SynchronizationEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintClass pobj  =new PrintClass();
		UsePrint useobj1 = new UsePrint(pobj,"Hello");
		UsePrint useobj2 = new UsePrint(pobj,"World");
		Thread t1 = new Thread(useobj1);
		t1.start();
		Thread t2 = new Thread(useobj2);
		t2.start();
		
	}

}
