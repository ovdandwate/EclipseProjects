package poi;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WRite_data1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File src = new File("C:\\Users\\user\\Documents\\WRITEdata.xlsx\\");
		FileOutputStream fio=new FileOutputStream(src);
		
		XSSFWorkbook wb=new XSSFWorkbook();
		XSSFSheet sheet= wb.createSheet("data");
		
		XSSFRow row= sheet.createRow(3);
		row.createCell(3).setCellValue("ARATI");
		System.out.println("write data");
		wb.write(fio);
		fio.close();
		System.out.println("write exel done");
		
}
	

}
