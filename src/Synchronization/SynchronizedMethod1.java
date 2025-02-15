package Synchronization;


class Account 
{
	int balance =1000;
	
	synchronized public void withdraw(String name,int amount)
	{
		if(amount<=balance)
		{
			try 
			{
				Thread.sleep(1000);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
			balance= balance-amount;
			System.out.println(name+" Your balance is : "+balance);
		}
		else
		{
			System.out.println(name+" insufficient balance");
		}
	}
}

class Customer extends Thread
{
	Account account;
	String name;
	int amount;
	
	public Customer(Account account,String name,int amount)
	{
		this.account=account;
		this.name=name;
		this.amount=amount;
	}
	
	public void run()
	{
		account.withdraw(name, amount);
	}
}
public class SynchronizedMethod1 {
	
	public static void main(String[] args) {
		
		Account account=new Account();
		Customer melwyn=new Customer(account,"Melwyn",600);
		Customer vasanth=new Customer(account,"vasanth",401);
		
		melwyn.start();
		vasanth.start();
	}
	


}
