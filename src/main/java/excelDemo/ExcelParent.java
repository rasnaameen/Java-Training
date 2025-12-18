package excelDemo;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelParent 
{
	
	static FileInputStream f;  //its an inbuild class to read the details from the file.
	static XSSFWorkbook wb;    //its an inbuild class to read the details from the workbook.
	static XSSFSheet sh;       //its an inbuild class to read the details from the sheet.
	
	public static String getStringData(int a,int b) throws IOException
	{
		f=new FileInputStream("C:\\Users\\rasna\\Documents\\workspace\\ExcelMaven.XLSX ");
		wb=new XSSFWorkbook(f);
		sh=wb.getSheet("sheet1");   //getSheet is a method used to get the details from the sheet.
		XSSFRow r= sh.getRow(a);    //its an inbuild class to get the details from the row.getRow is a method to get the details from the row.
		XSSFCell c=r.getCell(b);     //xssfcell is a class to get the details from the cell.getCell is a method to get the details from the cell.
		return c.getStringCellValue();   //getStringCellValue-to get the string details from the cell.
		
	}
	
	public static String getIntegerData(int a,int b) throws IOException
	{
		f=new FileInputStream("C:\\Users\\rasna\\Documents\\workspace\\ExcelMaven.XLSX ");
	    wb=new XSSFWorkbook(f);
	    sh=wb.getSheet("sheet1");
	    XSSFRow r=sh.getRow(a);
	    XSSFCell c=r.getCell(b);
	    int i=(int)c.getNumericCellValue();//used to convert one data type to another data type is called typecasting ie is mentioned in the bracket.getNumericCell value is a method to get gthe numeric value
		
	    
	    return String.valueOf(i);//to convert a any data type into string.
	   
	}
	
	public static String getFloatData(int a,int b) throws IOException
	{
		f=new FileInputStream("C:\\Users\\rasna\\Documents\\workspace\\ExcelMaven.XLSX ");
		wb=new XSSFWorkbook(f);
		sh=wb.getSheet("sheet1");
		XSSFRow r=sh.getRow(a);
		XSSFCell c=r.getCell(b);
		float f=(float)c.getNumericCellValue();
		
		
		return String.valueOf(f);
		
	}
}

