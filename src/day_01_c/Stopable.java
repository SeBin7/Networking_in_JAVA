package day_01_c;

public class Stopable implements Runnable{
	
	private boolean timeToQuit = false;
	
	public void run() {
		while(!timeToQuit) {
			System.out.println("계속 작업중입니다.");
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}

	public void stopRunning() {
		timeToQuit = true;
	}
}
