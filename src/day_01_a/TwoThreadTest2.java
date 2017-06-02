package day_01_a;

public abstract class TwoThreadTest2 {

	public static void main(String[] args) {
		Thread t1 = new Thread(new RunnableThread("One"));
		Thread t2 = new Thread(new RunnableThread("Two"));		
		
		t1.start();
		t2.start();
		
		System.out.println("======== Main End ========");
	}

}

class RunnableThread implements Runnable{
	String str;
	
	RunnableThread() {}
	
	RunnableThread(String str) {
		this.str = str;
	}
	
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println(i + " " + str);
			try {
				Thread.sleep((int)(Math.random() * 1000));
			} catch (InterruptedException e) { }			
		}
		System.out.println("DONE" + " " + str);
	}
}