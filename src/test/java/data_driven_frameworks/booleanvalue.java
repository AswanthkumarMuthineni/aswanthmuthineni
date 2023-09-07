package data_driven_frameworks;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class booleanvalue {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
FileInputStream fis=new FileInputStream("C:\\Users\\aswanth\\Desktop\\New folder\\Book2.xlsx");
Workbook wb = WorkbookFactory.create(fis);
boolean data = wb.getSheet("sheet1").getRow(0).getCell(0).getBooleanCellValue();
System.out.print(data);
	}

}
