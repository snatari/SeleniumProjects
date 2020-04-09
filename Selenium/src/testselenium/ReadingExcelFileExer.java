package testselenium;

import java.io.File;

import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ReadingExcelFileExer {

	public static void main(String[] args) throws BiffException, IOException {

		// one way of doing .
		Workbook wb = Workbook.getWorkbook(new File("C:\\Users\\swath\\Documents\\Credentials.xls"));
		Sheet sh = wb.getSheet("data");// data is sheet name;

		// or u can do like this in two steps .
		// ==================================================================
		// File file =new File("C:\\Users\\swath\\Documents\\Credentials.xls");
		// Workbook wb1 = Workbook.getWorkbook(file);
		// Sheet sh1 = wb1.getSheet("data");//data is sheet name;
		// ===================================================================
		// to read data from excel file using forloop.
		for (int i = 0; i < sh.getRows(); i++) {
			System.out.println("Username : " + sh.getCell(0, i).getContents());
			System.out.println("Password: " + sh.getCell(1, i).getContents());
		}

	}
}