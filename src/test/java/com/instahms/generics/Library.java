package com.instahms.generics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class Library implements IAutoConstant {
	public static Workbook wb;
	public static String getProperty(String CONFIG_PATH,String key)
	{
		String property = "";
		Properties pr = new Properties();
		try {
			pr.load(new FileInputStream(CONFIG_PATH));
		} catch (FileNotFoundException e) {
			
		} catch (IOException e) {
			
		}
		property = pr.getProperty(key);
		return property;
	}
	public static int getRowCount(String EXCEL_PATH,String Sheet){
		int rowCount = 0;
		try {
			wb = WorkbookFactory.create(new FileInputStream(EXCEL_PATH));
			rowCount = wb.getSheet(Sheet).getLastRowNum();
		} 
		catch (Exception e) {
			
		}
		return rowCount;
	}
	public static String getCellValue(String EXCEL_PATH,String Sheet,int row,int Column) throws IOException{
		FileInputStream fileInputStream = new FileInputStream(EXCEL_PATH);
		 String value="";
		 try {
		   
		   wb = WorkbookFactory.create(fileInputStream);
		   value = wb.getSheet(Sheet).getRow(row).getCell(Column).getStringCellValue();
		  // return value;
		   
		 } catch (Exception e) {
		  
		 }
		 wb.close();
		 fileInputStream.close();
		return value;
	}
}
