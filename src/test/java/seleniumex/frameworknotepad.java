package seleniumex;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class frameworknotepad {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
FileInputStream fis=new FileInputStream("C:\\Users\\aswanth\\Desktop\\practice\\cerdentials.properties");
Properties p=new Properties();
p.load(fis);

String s=p.getProperty("pwd");
System.out.println(s);
	}

}
