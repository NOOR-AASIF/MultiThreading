package ThreadCreation;

public class Threadcreat extends Thread
{
	
	 public void run()
	 {
		 System.out.println("This is a Run method....");
	 }
	 
	 
	 public static void main(String[] args) 
	 {
//		 Threadcreat obj=new Threadcreat();
//		 obj.run();
		 
		 Threadcreat obj=new Threadcreat();
		 obj.start();
		
		 
		 System.out.println(obj.getName());
		 obj.setName("Vasanth");
		 System.out.println(obj.getName());
	 }
	

}
