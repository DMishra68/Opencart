package com.opencart.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.*;

public class ExcelTestData {
	String path=".\\Resources\\TestData.xlsx";
	FileInputStream fis;
	FileOutputStream fos;
	XSSFWorkbook workbook;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	File file;
	
	public String readData(String sheet_name,int row_num,int cell_num) throws Exception {
		file=new File(path);
		fis=new FileInputStream(file);
		workbook=new XSSFWorkbook(fis);
		sheet=workbook.getSheet(sheet_name);
		cell= sheet.getRow(row_num).getCell(cell_num);
		DataFormatter df=new DataFormatter();
		String data=df.formatCellValue(cell);
		return data;
	}
	
	public void writeData(String sheet_name,int row_num,int cell_num,String data) {
		try{
			System.out.println("Data writing started");
			
			file=new File(path);
			FileInputStream fis=new FileInputStream(file);
			XSSFWorkbook workbook =new XSSFWorkbook(fis);
			XSSFSheet sheet=workbook.getSheet(sheet_name);
			sheet.getRow(row_num).createCell(cell_num).setCellValue(data);
			
			FileOutputStream fos=new FileOutputStream(new File(path));
			workbook.write(fos);
			workbook.close();
			fos.close();
			System.out.println("Data writing completed");
		}
		catch(IOException io)
		{
			
		}
		}
		//	public void writeData(String sheet_name,int row_num,int cell_num,String data) throws Exception {
		//	fis=new FileInputStream(path);
		//	workbook=new XSSFWorkbook(fis);
		//	sheet=workbook.getSheet(sheet_name);
		//	sheet.getRow(row_num);
		//	cell=row.createCell(cell_num);
		//	cell.setCellValue(data);
		//	
		//	fos=new  FileOutputStream(path);
		//	workbook.write(fos);
		//	workbook.close();
		//	
		//}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
