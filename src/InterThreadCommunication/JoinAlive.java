package InterThreadCommunication;

class MyThread extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() + " - " + i);
			try {
				Thread.sleep(500); // Simulate work
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class JoinAlive {

	public static void main(String[] args) {

		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		MyThread t3 = new MyThread();

		

	        t1.start();
	     
	        try {
	            t1.join();  // Main thread waits for t1 to finish
	          
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        
	        t2.start();
	        
	        try {
				t2.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		t3.start();
		
		System.out.println("Success.....");
	}

}
