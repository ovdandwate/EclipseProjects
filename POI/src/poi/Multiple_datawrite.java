package poi;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Multiple_datawrite {

	public static void main(String[] args) throws IOException {
		// Multiple data write exel
		File src= new File("C:\\Users\\user\\Documents\\WRITEdata.xlsx\\");
		FileOutputStream fio=new FileOutputStream(src);
		
		XSSFWorkbook wb= new XSSFWorkbook();
		XSSFSheet sheet=wb.createSheet("TABLE");
		
		for (int i = 0; i < 1; i++) {
			XSSFRow row=sheet.createRow(i);
			for (int j = 0; j < 1; j++) {
				row.createCell(j).setCellValue("aarti");
				System.out.println("write data");		
			}
			}
		for (int k = 1; k < 1; k++) {
			XSSFRow row1=sheet.createRow(k);
			for (int l = 0; l < 1; l++) {
				row1.createCell(l).setCellValue("priti");
				System.out.println("write data2");
			}
			
		}
		for (int m = 2; m < 1; m++) {
			XSSFRow row2=sheet.createRow(m);
			for (int n = 0; n < 1; n++) {
				row2.createCell(n).setCellValue("pooja");
				System.out.println("write data3");
			}
			
		}
		
		wb.write(fio);
		fio.close();
		System.out.println("write exel");
		

		

	}

}
