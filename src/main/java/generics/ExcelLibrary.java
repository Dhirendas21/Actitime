package generics;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelLibrary implements AutoConstant{
		 public static String excelFileDataFetch(String path,String name,int row,int cell) throws IOException
		 {
		 FileInputStream fis =new FileInputStream(sheet_path);
		 XSSFWorkbook wb=new XSSFWorkbook(fis);
		 String cell_value=wb.getSheet(name).getRow(row).getCell(cell).toString();
		 return cell_value;
		 }
}
