import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class AbstractScrapper {

    public static void getAbstractConsola(String url) throws IOException {
        String id = "enc-abstract";

        Document document = Jsoup.connect(url).get();
        Element abstractDiv = document.getElementById(id);
        Elements paragraphs = document.getElementsByTag("p");

        //System.out.println(abstractDiv);
        for (Element paragraph : paragraphs) {
            System.out.println(paragraph.text());
        }
    }
}