package InterThreadCommunication;

class Q
{
	int num;
	boolean valueset=false;
	
	synchronized public void put(int num)
	{
		while(valueset)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Put : "+num);
			this.num=num;
			valueset=true;
			notify();
		}
	}
	
	synchronized public void get()
	{
		while(!valueset)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Get : "+num);
		valueset=false;
		notify();
	}
}

class Producer implements Runnable
{
	Q q;
	
	public Producer(Q q)
	{
		this.q=q;
		Thread t=new Thread(this,"Producer");
		t.start();
	}
	
	public void run()
	{
		int i=0;
		while(true)
		{
			q.put(i++);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Consumer implements Runnable
{
	Q q;
	
	public Consumer(Q q)
	{
		this.q=q;
		Thread t=new Thread(this,"Consumer");
		t.start();
	}
	
	public void run()
	{
		while(true)
		{
			q.get();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class InterThread {
	
	public static void main(String[] args) {
		
		Q q=new Q();
		new Producer(q);
		new Consumer(q);
				System.out.println("Success...");
	}

}
