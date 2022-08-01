package Jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class HtmlJsoup {
    public static void main(String[] args) throws IOException {

        Document doc = Jsoup.connect("https://tilda.cc/ru/").get();
        String title = doc.text();

        Elements elements = doc.select("a[href]");
        for (
                Element link : elements) {
            System.out.println(link.attr("href"));
        }
        Elements img = doc.getElementsByTag("img");
        for (Element src : img) {
            System.out.println(src.attr("img"));
        }
    }
}