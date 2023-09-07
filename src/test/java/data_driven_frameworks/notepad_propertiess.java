package data_driven_frameworks;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class notepad_propertiess {
public static void main(String[] args) throws Exception {
	FileInputStream fis=new FileInputStream("C:\\Users\\aswanth\\Desktop\\practice\\cerdentials.properties");
	Properties p=new Properties();
	p.load(fis);
	String username=p.getProperty("un");
	System.out.println(username);
}

}
