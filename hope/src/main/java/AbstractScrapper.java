import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AbstractScrapper {

    public static String getAbstractConsola(String url) throws IOException {
        String id = "enc-abstract";

        Document document = Jsoup.connect(url).get();
        Element abstractDiv = document.getElementById(id);
        Elements paragraphs = document.getElementsByTag("p");

        List<String> textList = new ArrayList<String>();

        //System.out.println(abstractDiv);
        for (Element paragraph : paragraphs) {
            //System.out.println(paragraph.text());
            textList.add(paragraph.text());
        }
        //loop through list with data to check the data
        //textList.forEach(System.out::println);
        String textString = Stream.of(textList)
                .map(Object::toString)
                .collect(Collectors.joining("\t"));

        //System.out.println(textString);

        //TODO refactor string builder?
        return textString;
    }
}