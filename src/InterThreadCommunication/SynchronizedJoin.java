package InterThreadCommunication;

class CakeCounter
{
	int cakeCount=0;
	
	synchronized public void increment()
	{
		cakeCount++;
	}
}

class Team implements Runnable
{
	CakeCounter cakecounter;
	
	Team(CakeCounter cakecounter)
	{
		this.cakecounter=cakecounter;
	}
	
	public void run()
	{
		for(int i=0;i<1000;i++)
		{
			cakecounter.increment();
		}
	}
}
public class SynchronizedJoin {
	
	public static void main(String[] args) {
		
		CakeCounter counter=new CakeCounter();
		Thread team1=new Thread(new Team(counter));
		Thread team2=new Thread(new Team(counter));
		
		team1.start();
		team2.start();
		
		try {
			team1.join();
			team2.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println(counter.cakeCount);
		
	}

}
