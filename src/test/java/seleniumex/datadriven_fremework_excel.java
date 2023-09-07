package seleniumex;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class datadriven_fremework_excel {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
FileInputStream fis=new FileInputStream("C:\\Users\\aswanth\\Desktop\\New folder\\exterion.xlsx");
Workbook sh = WorkbookFactory.create(fis);
Sheet s = sh.getSheet("sheet1");
String data = s.getRow(0).getCell(0).getStringCellValue();
System.out.println(data);
	}

}
