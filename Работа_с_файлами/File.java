package Работа_с_файлами;

import java.io.File;
import java.io.IOException;

class FileEx {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\12\\IdeaProjects\\TrainingJava\\src" +
                "\\Ввод_Вывод\\target.txt");
        System.out.println(file.getAbsolutePath());//полный путь к файлу
        System.out.println(file.isAbsolute());//абсолютный или нет
        System.out.println(file.isDirectory());//пака это или нет
        System.out.println(file.exists());//существует файл или нет
        System.out.println(file.mkdirs());//Создает каталог, названный этим абстрактным путем
        System.out.println(file.createNewFile());
        System.out.println(file.delete());
        System.out.println(file.isHidden());//скрыт этот файл или нет
        System.out.println(file.canWrite());//можно ли записать файл canRead



    }
}
