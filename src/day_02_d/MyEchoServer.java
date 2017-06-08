package day_02_d;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MyEchoServer {

	public static void main(String[] args) {
		if(args.length != 1) {
			System.out.println("»ç¿ë¹ý: Java MyEchoServer Port");
			System.exit(0);
		}
		
		try {
			ServerSocket ss = new ServerSocket(Integer.parseInt(args[0]));
			Socket s = ss.accept();
			InputStream in = s.getInputStream();
			OutputStream out = s.getOutputStream();
			
			int b;
			
			while(true) {
				b = in.read();
				if(b == 1) break;
				out.write(b);
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
