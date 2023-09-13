package ApachePoiExcel;

import org.apache.poi.hssf.usermodel.HSSFClientAnchor;
import org.apache.poi.hssf.usermodel.HSSFPatriarch;
import org.apache.poi.hssf.usermodel.HSSFSimpleShape;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class РисованиеDraw {
    public static void main(String[] args) throws IOException {
        Workbook workbook = new HSSFWorkbook();
        Sheet sheet = workbook.createSheet("slide");
        HSSFPatriarch patriarch = (HSSFPatriarch)
                sheet.createDrawingPatriarch();//добавляем патриарх художника
        HSSFClientAnchor anchor = new HSSFClientAnchor();//создаем поле рисования
        anchor.setCol1(2);//столбец
        anchor.setRow1(2);//строка
        anchor.setCol2(10);//столбец
        anchor.setRow2(10);//строка
        HSSFSimpleShape shape = patriarch.createSimpleShape(anchor);//создаем фигуру
        shape.setShapeType(HSSFSimpleShape.OBJECT_TYPE_LINE);//тип фигуры
        shape.setLineStyleColor(255, 0, 0);//цвет линии
        shape.setLineWidth(3);//толщина линии
        shape.setLineStyle(HSSFSimpleShape.LINESTYLE_DASHDOTGEL);//тип линии
        shape.setShapeType(HSSFSimpleShape.OBJECT_TYPE_RECTANGLE);//тип фигуры
        shape.setFillColor(0, 0, 255);//цвет заливки
        FileOutputStream fileOutputStream =
                new FileOutputStream("C:\\Users\\12" +
                        "\\IdeaProjects\\TrainingJava" +
                        "\\ApachePoiExcel\\example.xls");
        workbook.write(fileOutputStream);
        fileOutputStream.close();
    }
}
