package ThreadCreation;

public class MultipleTask {
	
	public static void main(String[] args) {
		
		Thread thread1=new Thread()
		{
			public void run()
			{
				System.out.println("Task one");
			}
		};
		Thread thread2=new Thread()
		{
			public void run()
			{
				System.out.println("Task two");
			}
		};
		
		thread1.start();
		thread2.start();
	}

}
