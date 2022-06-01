package poi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xdgf.usermodel.section.geometry.GeometryRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class READdata {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File src = new File("C:\\Users\\user\\Documents\\WRITEdata.xlsx\\");
		FileInputStream fis= new FileInputStream(src);
		System.out.println("read data");
		
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		System.out.println("read wb");
		int row= sheet.getLastRowNum();
		System.out.println("rowcount is"+row+1);
		
		for (int i = 0; i < row ; i++) {
			String data=sheet.getRow(i).getCell(0).getStringCellValue();
			System.out.println(" get data  " +data);
			 
		}
		for (int i = 1; i < row; i++) {
			String data1=sheet.getRow(i).getCell(0).getStringCellValue();
			System.out.println(" get data  " +data1);
			
		}
		for (int i = 2; i < row ; i++) {
			String a=sheet.getRow(i).getCell(0).getStringCellValue();
			System.out.println(" get data  " +a);
		}
		for (int i = 0; i < row ; i++) {
			String data3=sheet.getRow(i).getCell(1).getStringCellValue();
			System.out.println(" get data  " +data3);
			
		}
		for (int i = 1; i < row ; i++) {
			String data4=sheet.getRow(i).getCell(1).getStringCellValue();
			System.out.println(" get data  " +data4);
			 
	}
		for (int i = 2; i < row ; i++) {
			String data5=sheet.getRow(i).getCell(1).getStringCellValue();
			System.out.println(" get data  " +data5);
			 
		}
	}}
			 
		
		
		
		
		
		
		

	


