package Synchronization;

class Vasan
{
	synchronized static public void table(int a) 
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

class Melw extends Thread
{
	public void run()
	{
		Vasan.table(5);
	}
}
class Aas extends Thread
{
	public void run()
	{
		Vasan.table(10);
	}
}
public class SynchronizedStatic {
	
	public static void main(String[] args) {
		
		Melw melw=new Melw();
		Aas aas=new Aas();
		
		melw.start();
		aas.start();
	}
	

}
