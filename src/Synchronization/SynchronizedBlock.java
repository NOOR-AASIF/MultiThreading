package Synchronization;

class Vasant
{
	public void table(int a) 
	{
		synchronized(this)
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

class Melwy extends Thread
{
	Vasant obj;
	Melwy(Vasant obj)
	{
		this.obj=obj;
	}
	public void run()
	{
		obj.table(5);
	}
}
class Aasi extends Thread
{
	Vasant obj;
	
	Aasi(Vasant obj)
	{
		this.obj=obj;
	}
	public void run()
	{
		obj.table(10);
	}
}
public class SynchronizedBlock {
	
	public static void main(String[] args) {
		
		Vasant vasant=new Vasant();
		Melwy melwy=new Melwy(vasant);
		Aasi aasi=new Aasi(vasant);
		
		melwy.start();
		aasi.start();
	}

}
