package com.genericUtils;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
public class ExcelUtility {
	
	/**
	 * Author @shaibaz
	 * apchepoi is mandatory
	 */
	
	/**
	 * This method used to read data from excel from by specifying sheet name, row number, and cell number
	 * @param sheetName
	 * @param rownum
	 * @param cellnum
	 * @return
	 * @throws Throwable 
	 */
	public String getExelData(String sheetName,int rownum,int cellnum) throws Throwable
	{
		FileInputStream file = new FileInputStream(IPathConstant.EXCELPATH);
		Workbook wb = WorkbookFactory.create(file);
		Sheet sheet = wb.getSheet(sheetName);
		Row row = sheet.getRow(rownum);
		Cell cell= row.getCell(cellnum);
		return cell.getStringCellValue();
		
		
		
		
	}

}