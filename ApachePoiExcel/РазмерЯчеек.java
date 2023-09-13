package ApachePoiExcel;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellRangeAddress;

import java.io.FileOutputStream;
import java.io.IOException;

public class РазмерЯчеек {
    public static void main(String[] args) throws IOException {
        Workbook workbook = new HSSFWorkbook();
        Sheet sheet = workbook.createSheet("sheet1");
        Row row = sheet.createRow(0);//cтрока
        Cell cell = sheet.createRow(0).createCell(0);//ячейка
        cell.setCellValue("New Cell");//новая ячейка
        row.setHeight((short) 300);//высота
        sheet.setColumnWidth(0, 5000);//ширина
        sheet.autoSizeColumn(0);//ширина содержимого ячейки
        sheet.addMergedRegion(
                new CellRangeAddress(0, 5, 0, 1));
        //объединение ячеек

        FileOutputStream fileOutputStream =
                new FileOutputStream("C:\\Users\\12" +
                        "\\IdeaProjects\\TrainingJava" +
                        "\\ApachePoiExcel\\example.xls");
        workbook.write(fileOutputStream);
        fileOutputStream.close();
    }
}
