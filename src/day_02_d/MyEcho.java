package day_02_d;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class MyEcho {

	public static void main(String[] args) {
		if(args.length != 2) {
			System.out.println("사용법: Java MyEchoServer Port");
			System.exit(0);
		}
		
		try {
			String host = args[0];
			int port = Integer.parseInt(args[1]);
			Socket s = new Socket(host, port);
			
			BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
			
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			String txMsg = "", recMsg = "";
			while(true) {
				System.out.println("Data 입력 : ");
				txMsg = in.readLine();
				if(txMsg.length() == 0) break;
				bw.write(txMsg, 0, txMsg.length());
				bw.newLine();
				bw.flush();
				recMsg = br.readLine();
				System.out.println("되돌아온 Data : " + recMsg);		
			}
			s.close();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
