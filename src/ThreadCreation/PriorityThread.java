package ThreadCreation;

public class PriorityThread extends Thread{
	
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		PriorityThread t1=new PriorityThread();
		PriorityThread t2=new PriorityThread();
		PriorityThread t3=new PriorityThread();
		
		t1.setName("Vasanth");
		t2.setName("Melwyn");
		t3.setName("Aasif");
		
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		System.out.println(t3.getPriority());
		
		t1.setPriority(1);
		t2.setPriority(3);
		t3.setPriority(8);
		
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		System.out.println(t3.getPriority());
		
		
		t1.start();
		t2.start();
		t3.start();
		
	}

}
