package day_01_c;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ControlThread extends Thread{
	private Stopable r = new Stopable();
	private Thread t = new Thread(r);
	public BufferedReader br;
	public String condition;
	
	public void startThread(){
		t.start();
	}
	
	public void stopThread() {
		r.stopRunning();
	}
	
	public void run() {
		try {
			int i = 0;
			while(true) {
				condition = br.readLine();
				if(condition.equals("quit")){
					System.out.println("������� ��û���� �����带 �����մϴ�.");
					stopThread();
					break;
				}
				i++;
				if(i == 5) {
					System.out.println("5ȸ�� �Է� �Ѱ�� �����մϴ�.");
					stopThread();
					break;
				}
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		ControlThread ct = new ControlThread();
		
		ct.br = new BufferedReader(new InputStreamReader(System.in));
		
		ct.condition = null;
		ct.start();
		ct.startThread();
	}

	
}
