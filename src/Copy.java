import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("D://a.txt");
			fos = new FileOutputStream("D://aa.txt");
			byte[] zi = new byte[512];
			int hasRead = -1;
			StringBuffer stringBuffer = new StringBuffer();
			try {
				while((hasRead=fis.read(zi))!=-1){
					String wen = new String(zi,0,hasRead);
					fos.write(zi, 0, hasRead);
					fos.flush();
					stringBuffer.append(wen);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("文件中的数据为："+stringBuffer.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(fis!=null){
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

}
