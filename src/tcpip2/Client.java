package tcpip2;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	public static void main(String[] args) {
		String ip = "70.12.111.141";
		int port = 7777;
		Socket socket = null;
		OutputStream outs = null;
		OutputStreamWriter ousw= null;
		
		try {
			System.out.println("Start Client");
			socket = new Socket(ip, port);
			System.out.println("Connected OK");
			
			//send data
			 outs = socket.getOutputStream();
			 ousw = new OutputStreamWriter(outs);
			ousw.write("±×·¡ ");
			System.out.println("send completed");
			
		} catch (UnknownHostException e) {
			System.out.println("unknownHostException");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("IOException");
			e.printStackTrace();
		}finally	 {
			try {
				ousw.close();
				ousw.close();
				socket.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
