import java.io.IOException;

public class JsoupTester {
    public static void main(String[] args) throws IOException {

        String url = "https://pubmed.ncbi.nlm.nih.gov/32378726/";
        String url2 = "https://pubmed.ncbi.nlm.nih.gov/32198393/";
        String url3 = "https://pubmed.ncbi.nlm.nih.gov/31618111/";

        AbstractScrapper.getAbstractConsola(url);
        AbstractScrapper.getAbstractConsola(url2);
        //get rid of keywords?
        AbstractScrapper.getAbstractConsola(url3);

    }
}