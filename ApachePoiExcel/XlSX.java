package ApachePoiExcel;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class XlSX {
    public static void main(String[] args) throws IOException {
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("sheet1");
        Row row = sheet.createRow(0);//cтрока
        Cell cell = sheet.createRow(0).createCell(0);//ячейка

        FileOutputStream fileOutputStream =
                new FileOutputStream("C:\\Users\\12" +
                        "\\IdeaProjects\\TrainingJava" +
                        "\\ApachePoiExcel\\example.xlsx");
        workbook.write(fileOutputStream);
        fileOutputStream.close();
    }
}
