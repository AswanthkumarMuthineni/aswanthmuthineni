package data_driven_frameworks;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class string_value_using {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
FileInputStream fis=new FileInputStream("C:\\Users\\aswanth\\Desktop\\New folder\\Book3.xlsx");
Workbook wb = WorkbookFactory.create(fis);
//fetch string value data
String data = wb.getSheet("sheet2").getRow(0).getCell(0).getStringCellValue();
System.out.println(data);
//fetch numerical value data
double data1 = wb.getSheet("sheet2").getRow(1).getCell(1).getNumericCellValue();
System.out.println(data1);
//numerical to string
String data3 = wb.getSheet("sheet2").getRow(3).getCell(0).getStringCellValue();

System.out.println(data3);

	}

}
