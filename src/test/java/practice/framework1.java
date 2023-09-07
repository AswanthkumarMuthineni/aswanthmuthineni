package practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class framework1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("C:\\Users\\aswanth\\Desktop\\practice\\cerdentials.properties");
		Properties p=new Properties();
		p.load(fis);
		String username=p.getProperty("un");
		System.out.println(username);

	}

}
