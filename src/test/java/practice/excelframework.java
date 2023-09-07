package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excelframework {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
//create object of fis class
		FileInputStream fis=new FileInputStream("C:\\Users\\aswanth\\Desktop\\New folder\\exterion.xlsx");
		//open the workbook using create method
	Workbook wb=WorkbookFactory.create(fis);
	//navigate to sheet
Sheet	sh=wb.getSheet("sheet1");
String data=sh.getRow(0).getCell(1).getStringCellValue();
System.out.println(data);
	}

}
