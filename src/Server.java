import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServerSocket sev = null;
		try {
			sev = new ServerSocket(555);
			System.out.println("�����������ɹ���");
			Socket socket=sev.accept();
			System.out.println("�����ͻ����ӣ�");
			InputStream is = socket.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			String string = br.readLine();
			System.out.println("���Կͻ��˵����ݣ�"+string);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(sev!=null){
				try {
					sev.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		

	}

}
