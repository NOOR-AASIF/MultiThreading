package ThreadCreation;

public class Runcreate implements Runnable{
	
	public void run()
	{
		System.out.println("this is a run method....");
	}
	
	public static void main(String[] args) 
	{
		
		Runcreate obj=new Runcreate();
		Thread os=new Thread(obj);
		os.start();
	
		
	}

}
