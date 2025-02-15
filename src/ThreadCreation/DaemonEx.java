package ThreadCreation;

public class DaemonEx extends Thread
{
	
	public void run()
	{
		if(Thread.currentThread().isDaemon())
		{
			System.out.println("This is a Deamon Thread");
		}
		else
		{
			System.out.println("This is not a deamon Thread");
		}
	}
	
	public static void main(String[] args) 
	{
		
		DaemonEx thread1=new DaemonEx();
		DaemonEx thread2=new DaemonEx();
		DaemonEx thread3=new DaemonEx();
		
		thread1.setDaemon(true); //set thread as a deamon thread
		thread1.start();
		thread2.start();
		thread3.start();
	}

}
