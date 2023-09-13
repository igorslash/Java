package ApachePoiExcel;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import java.io.FileOutputStream;
import java.io.IOException;

public class Excel {
    public static void main(String[] args) throws IOException {
        Workbook workbook = new HSSFWorkbook();
        Sheet sheet = workbook.createSheet("sheet1");
        Row row = sheet.createRow(0);//cтрока
        Cell cell = sheet.createRow(0).createCell(0);//ячейка
        cell.setCellFormula("SUM(A1:B1");//сумма в ячейке
        FileOutputStream fileOutputStream =
                new FileOutputStream("C:\\Users\\12" +
                        "\\IdeaProjects\\TrainingJava" +
                        "\\ApachePoiExcel\\example.xls");
        workbook.write(fileOutputStream);
        fileOutputStream.close();
    }
}
