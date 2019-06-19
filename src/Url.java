import java.awt.image.BufferedImageFilter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;


public class Url {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		URL url;
		try {
			url=new URL("http://www.baidu.com");
			try {
				HttpURLConnection con = (HttpURLConnection)url.openConnection();
				con.connect();
				if(con.getResponseCode()==200){
					InputStream inputStream = con.getInputStream();
					BufferedReader bReader = new BufferedReader(new InputStreamReader(inputStream));
					String string = null;
					while((string=bReader.readLine())!=null){
						System.out.println(string);
					}
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
