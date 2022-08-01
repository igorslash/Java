package Jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class UpdateHtml {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\12\\IdeaProjects\\TrainingJava\\src\\Jsoup\\index.html");
        Document doc = Jsoup.parse(file, "utf-8");
        Element tagElementMeta = new Element(Tag.valueOf("meta"), "");
        tagElementMeta.attr("charset", "utf-8");
        doc.head().appendChild(tagElementMeta);

        Element tagPDescription = new Element(Tag.valueOf("p"), "");
        tagPDescription.text("Jsoup learning");
        doc.body().appendChild(tagPDescription);
        tagPDescription.before("<p>Author: Igor Scherbakov</p>");

        Element tagAuthor = doc.body().select("p:contains(Author)").first();
        assert tagAuthor != null;
        tagAuthor.attr("align", "center");
        doc.body().addClass("content");

        FileWriter fileWriter = new FileWriter("update.html");
        fileWriter.write(doc.toString());
        fileWriter.close();
    }
}
