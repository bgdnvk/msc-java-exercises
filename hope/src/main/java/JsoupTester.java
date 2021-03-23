import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Hyperlink;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JsoupTester {
    public static void main(String[] args) throws IOException, InvalidFormatException {

        //-------TESTS------------
//        String url = "https://pubmed.ncbi.nlm.nih.gov/32378726/";
//
//        String scrappedTextList = AbstractScrapper.getAbstractId(url);
//        System.out.println(scrappedTextList);

//        String url2 = "https://pubmed.ncbi.nlm.nih.gov/32198393/";
//        String url3 = "https://pubmed.ncbi.nlm.nih.gov/31618111/";


        //check that it works through console
        //ExcelReader.getExcelLinks();

        //check func works
//        CreateExcel.createRows(0);
        //-------TESTS------------

        //get hyperlink List from Excel Reader class
        //List<Hyperlink> hyperlinkList = ExcelLinkReader.getExcelLinks();

//        ArrayList<String> arrayList = ExcelReader.getExcelCells();
//
//        System.out.println("test start");
//        System.out.println(arrayList.size());
//        System.out.println(arrayList.get(10));
//        System.out.println(arrayList.get(11));
//        System.out.println(arrayList.get(12));
//        System.out.println(arrayList.get(13));
//        System.out.println("test finish");
//
//        //check insert
//        //--TESTS
//        for (int i = 0; i < arrayList.size(); i++){
//            System.out.println(i);
//            System.out.println(arrayList.get(i));
//            if (arrayList.get(i).equals("Resumen")){
//                String resumenString = ExcelReader.getLink(arrayList.get(i+3));
//                arrayList.set(i+1, resumenString);
//            }
//            //System.out.println(arrayList.get(i+1));
//        }
//        arrayList.forEach(cell -> System.out.println(cell));
//        //--TESTS
//
//
//        //make excel from the hyperlinks
//        //CreateExcel.createRows(hyperlinkList);
//        CreateExcel.createStringExcel(arrayList);

    }
}