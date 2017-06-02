package day_01_d;

class SyncTest {
	synchronized void a() {
		for(int i=0; i<30; i++) {
			try {
				System.out.print("a");
				Thread.sleep(50);
			} catch (Exception e) {	}
		}
		System.out.println();
	}
	
	synchronized void b() {
		for(int i=0; i<30; i++) {
			try {
				System.out.print("b");
				Thread.sleep(50);
			} catch (Exception e) {	}
		}
		System.out.println();
	}
	
	synchronized void c() {
		for(int i=0; i<30; i++) {
			try {
				System.out.print("c");
				Thread.sleep(50);
			} catch (Exception e) {	}
		}
		System.out.println();
	}
	
	synchronized void d() {
		for(int i=0; i<30; i++) {
			try {
				System.out.print("d");
				Thread.sleep(50);
			} catch (Exception e) {	}
		}
		System.out.println();
	}
}

public class SynchronizedTest extends Thread{
	int num;
	SyncTest s;
	
	SynchronizedTest(int i, SyncTest s) {
		num = i;
		this.s = s;
	}

	public static void main(String[] args) {
		SyncTest s = new SyncTest();
		SynchronizedTest s1 = new SynchronizedTest(1, s);
		SynchronizedTest s2 = new SynchronizedTest(2, s);
		SynchronizedTest s3 = new SynchronizedTest(3, s);
		SynchronizedTest s4 = new SynchronizedTest(4, s);
		
		s1.start();
		s2.start();
		s3.start();
		s4.start();
	}

	public void run() {
		if(num == 1)
			s.a();
		else if(num == 2)
			s.b();
		else if(num == 3)
			s.c();
		else if(num == 4)
			s.d();
	}
}
