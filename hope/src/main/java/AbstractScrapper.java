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

    public static String getAbstractId(String url) throws IOException {
        //id get the website's element id
        String cssSelect = "div[class=abstract] p";

        Document document = Jsoup.connect(url).get();
        Elements paragraphs = document.select(cssSelect);

        List<String> textList = new ArrayList<String>();

        //get the data from paragraphs and put it into the list
        for (Element paragraph : paragraphs) {
            //System.out.println(paragraph.text());
            textList.add(paragraph.text());
        }
        //check the data
        //textList.forEach(System.out::println);

        //format the list and return it as a string
        String textString = Stream.of(textList)
                .map(Object::toString)
                .collect(Collectors.joining("\t"));

        //System.out.println(textString);

        //TODO refactor string builder?
        return textString;
    }
}