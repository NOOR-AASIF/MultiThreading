package ThreadCreation;

public class SleepMethod extends Thread{
	
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			try
			{
				Thread.sleep(2000);
			}
			catch (InterruptedException e) 
			{
				System.out.println(e);
			}
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		SleepMethod obj=new SleepMethod();
		SleepMethod obj2=new SleepMethod();
		obj.start();
		obj2.start();
		
	}

}
