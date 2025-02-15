package InterThreadCommunication;

class Demo extends Thread {
	public void run() {
		synchronized (this) {
			for (int i = 0; i <= 5; i++) {
				System.out.println("Thread Running ..." + i);
			}
			this.notify();
		}
	}
}

public class InterThread2 {

	public static void main(String[] args) {

		System.out.println("Main Thread...");

		Demo demo = new Demo();
		demo.start();

		synchronized (demo) {
			try {
				demo.wait(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Again main method..");
		}
	}

}
