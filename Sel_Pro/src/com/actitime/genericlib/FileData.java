package com.actitime.genericlib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileData 
{
   public Properties getPropertyObj() throws Throwable
   {
	   FileInputStream fis = new FileInputStream("./TestData/CommonData.properties");
	   Properties pobj = new Properties();
	   pobj.load(fis);
	   return pobj;
   }
   
   public String getExcelData(String sheetName,int rowNum,int cellNum) throws Throwable
   {
	   FileInputStream fis = new FileInputStream("./TestData/testData.xlsx");
	   Workbook wb = WorkbookFactory.create(fis);
	   Sheet sh = wb.getSheet(sheetName);
	   Row rw= sh.getRow(rowNum);
	   String data=rw.getCell(cellNum).getStringCellValue();
	   return data;
   }
}







