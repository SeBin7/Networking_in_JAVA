package day_01_a;

public abstract class TwoThreadTest1 {

	public static void main(String[] args) {
		SimpleThread a, b, c;
		a = new SimpleThread("One");
		b = new SimpleThread("Two");
		c = new SimpleThread("Three");
		
		a.start();
		b.start();
		c.start();
		
		System.out.println("======== Main End ========");
	}

}

class SimpleThread extends Thread {
	String str;
	
	SimpleThread() {}
	SimpleThread(String str) {
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