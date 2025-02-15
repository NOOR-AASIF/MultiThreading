package Synchronization;

class Vasanth
{
	synchronized public void table(int a) 
	{
		for(int i=1;i<=5;i++)
		{
			try
			{
				Thread.sleep(1000);
			} 
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println(i*a);
		}
	}
}

class Melwyn extends Thread
{
	Vasanth obj;
	Melwyn(Vasanth obj)
	{
		this.obj=obj;
	}
	public void run()
	{
		obj.table(5);
	}
}
class Aasif extends Thread
{
	Vasanth obj;
	
	Aasif(Vasanth obj)
	{
		this.obj=obj;
	}
	public void run()
	{
		obj.table(10);
	}
}
public class SynchronizedMethod 
{
	
	public static void main(String[] args) 
	{
		Vasanth vasanth=new Vasanth();
		Melwyn melwyn=new Melwyn(vasanth);
		Aasif aasif=new Aasif(vasanth);
		
		melwyn.start();
		aasif.start();
	}

}
