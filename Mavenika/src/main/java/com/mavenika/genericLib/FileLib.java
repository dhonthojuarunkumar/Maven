package com.mavenika.genericLib;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {


	public String readPropertyData(String path, String key) throws Throwable
	{
		FileInputStream fis = new FileInputStream(path);
		Properties prop = new Properties();
		prop.load(fis);
		String propValue = prop.getProperty(key, "Incorrect Key");
		return propValue;
	}
	
	public String readExcelData(String path, String sheet, int row, int cell) throws Throwable
	{
		FileInputStream fis=new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		String ecxelValue = wb.getSheet(sheet).getRow(row).getCell(cell).toString();
		return ecxelValue;
	}
	
	public void writeExcelData(String path, String sheet, int row, int cell, String data) throws Throwable
	{
		FileInputStream fis=new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet(sheet).getRow(row).createCell(cell).setCellValue(data);
		
		FileOutputStream fos=new FileOutputStream(path);
		wb.write(fos);
		
	}

}
