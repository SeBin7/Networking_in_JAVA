package day_01_a;

class ThreadExam extends Thread {
	public void run() {
		System.out.println(getName() + "¾²·¹µå");
	}
}

public class ThreadExamA {

	public static void main(String[] args) {
		ThreadExam aa, bb;
		
		aa = new ThreadExam();
		bb = new ThreadExam();
		
		aa.run();
		bb.run();
	}

}
