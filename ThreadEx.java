package practice;



public class ThreadEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0;i<10;i++)
		{
			System.out.println("Main Thread " + i);
		}
		
		Thread1 obj = new Thread1();
		obj.start();
		
		Thread th = new Thread(new Thread2());
		th.setPriority(Thread.MAX_PRIORITY);
		th.start();
	}

}

class Thread1 extends Thread
{
	public void run()
	{
		for(int i = 0;i<20;i++)
		{
			System.out.println(i);
			if(i==10)
			{	
				System.out.println("Thread yield");
				Thread.yield();
			}
		}
	}
}

class Thread2 implements Runnable
{
	public void run()
	{
		for(int i = 0;i<10;i++)
		{
			System.out.println("Interface " + i);
		}
		
	}
}
