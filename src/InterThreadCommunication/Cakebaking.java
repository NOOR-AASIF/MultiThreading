package InterThreadCommunication;

class Cake extends Thread
{
	 public void run()
	{
		System.out.println("Mixing for cake "+Thread.currentThread().getId());
		System.out.println("Baking cake "+Thread.currentThread().getId());
		System.out.println("Decorating Cake "+Thread.currentThread().getId());
	}
}

public class Cakebaking {
	
	public static void main(String[] args) {
		
		for(int i=1;i<=3;i++)
		{
			Cake cake=new Cake();
			cake.start();
			
			
		}
	}

}
