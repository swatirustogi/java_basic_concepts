package practice;

class Q
{
	boolean valueset;
	int n;
	synchronized public int get()
	{
		if(!valueset)
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		System.out.println("Value get " + n);
		valueset = false;
		notify();
		return n;
	}
	
	synchronized public void set(int x)
	{
		if(valueset)
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		System.out.println("Value set " + n);
		this.n= x;
		valueset = true;
		notify();
	}
}

class Producer implements Runnable
{
	Q q;
	Producer(Q q)
	{
		this.q = q;
	}
	public void run()
	{
		int i = 1;
		while(true)
			q.set(i++);
	}
	
}

class Consumer implements Runnable
{
	Q q;
	Consumer(Q q)
	{
		this.q = q;
	}
	public void run()
	{
		int i = 0;
		while(true)
		{
			i = q.get();
		
		}
		
	}
	
	
}

public class ThreadCommunicationEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q q = new Q();
		Producer p = new Producer(q);
		Thread t1 = new Thread(p);
		t1.start();
		Consumer c = new Consumer(q);
		Thread t2 = new Thread(c);
		t2.start();
		
	}

}
