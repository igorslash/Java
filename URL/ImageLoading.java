package URL;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ImageLoading {
    public static void main(String[] args) throws IOException {
        String image = "https://costume-prokat.ru/newyear";
        URL url = new URL(image);
        InputStream inputStream = url.openStream();
        Path path = Paths.get("C:\\Users\\12\\IdeaProjects\\TrainingJava\\" +
                "src\\URL\\HappyNewYear.png", url.getAuthority(), url.getPath());
        Files.copy(inputStream, path);
        inputStream.close();
    }
}
