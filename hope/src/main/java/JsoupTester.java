import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Hyperlink;

import java.io.IOException;
import java.util.List;

public class JsoupTester {
    public static void main(String[] args) throws IOException, InvalidFormatException {

        //-------TESTS------------
//        String url = "https://pubmed.ncbi.nlm.nih.gov/32378726/";
//
//        String scrappedTextList = AbstractScrapper.getAbstractConsola(url);
//        System.out.println(scrappedTextList);

//        String url2 = "https://pubmed.ncbi.nlm.nih.gov/32198393/";
//        String url3 = "https://pubmed.ncbi.nlm.nih.gov/31618111/";


        //check that it works through console
        //ExcelReader.getExcelLinks();

        //check func works
//        CreateExcel.createRows(0);
        //-------TESTS------------

        //get hyperlink List from Excel Reader class
        List<Hyperlink> hyperlinkList = ExcelReader.getExcelLinks();
        //make excel from the hyperlinks
        CreateExcel.createRows(hyperlinkList);
    }
}