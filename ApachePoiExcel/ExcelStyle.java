package ApachePoiExcel;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelStyle {
    public static void main(String[] args) throws IOException {
        Workbook workbook = new HSSFWorkbook();
        Sheet sheet = workbook.createSheet("sheet1");
        Row row = sheet.createRow(0);//cтрока
        Cell cell = sheet.createRow(0).createCell(0);//ячейка
        //----------------------------------------------------
        //Color Style
        CellStyle cellStyle = workbook.createCellStyle();
        cellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);//заливка
        cellStyle.setFillForegroundColor(IndexedColors.RED.getIndex());
        cell.setCellStyle(cellStyle);
        cellStyle.setAlignment
                (HorizontalAlignment.CENTER);//горизонтальное выравнивание
        cellStyle.setBorderBottom(BorderStyle.THIN);//граница снизу
        cellStyle.setBottomBorderColor
                (IndexedColors.BLACK.getIndex());//цвет границы снизу
        //----------------------------------------------------
        //Font Style
        Font font = workbook.createFont();
        font.setFontName("Times New Roman");//iмя шрифта
        font.setBold(true);//жирный
        font.setFontHeightInPoints((short) 14);//размер шрифта
        font.setStrikeout(true);//подчеркивание
        font.setUnderline(Font.U_SINGLE);//подчеркивание с одной стороны
        font.setColor(IndexedColors.BLACK.getIndex());//цвет шрифта
        cellStyle.setFont(font);//устанавливаем шрифт

        FileOutputStream fileOutputStream =
                new FileOutputStream("C:\\Users\\12" +
                        "\\IdeaProjects\\TrainingJava" +
                        "\\ApachePoiExcel\\example.xls");
        workbook.write(fileOutputStream);
        fileOutputStream.close();
    }
}
