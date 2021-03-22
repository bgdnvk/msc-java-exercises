import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
//https://www.callicoder.com/java-read-excel-file-apache-poi/

public class ExcelReader {
    //TODO change path? and use the proper xls
    public static final String xlsTest = "src/hope_resumen_test.xls";


    public static Workbook getWorkbook(String xlsx) throws IOException, InvalidFormatException {
        Workbook workbook = WorkbookFactory.create(new File(xlsx));
        return workbook;
    }


    public static List<Hyperlink> getExcelLinks() throws IOException, InvalidFormatException{
        Workbook workbook = getWorkbook(xlsTest);
        //get the first and only one sheet
        Sheet sheet = workbook.getSheetAt(0);
        //list to store all hyperlinks, return it later maybe
        List<Hyperlink> hyperlinkList = new ArrayList<>();

        // Create a DataFormatter to format and get each cell's value as String
        DataFormatter dataFormatter = new DataFormatter();

        //iterate through the sheet
        sheet.forEach(row -> {
            row.forEach(cell -> {
                // --- get specific cell value
//                System.out.println(" ---data---");
//                String cellValue = dataFormatter.formatCellValue(cell);
//                System.out.println(cellValue);
//                System.out.println(" --data---");
//                //check specific value
//                if(cellValue.equals("")){
//                    System.out.println("empty");
//                }
//                if(cellValue.equals("medical_history:")){
//                    System.out.print("inside IF: >"+cellValue + "\n");
//                }
                // ---

                //get the hyperlink inside the cell
                Hyperlink hyperlink = cell.getHyperlink();
                if (hyperlink != null){
                    System.out.println(hyperlink.getLabel() +" agregando link "+ hyperlink.getAddress());
                    hyperlinkList.add(hyperlink);
                    //TODO make new excel, insert from here if not using hyperlinklist?
                }

            });
        });
        workbook.close();
        return hyperlinkList;
    }

    public static ArrayList<String> getExcelCells() throws IOException, InvalidFormatException {
        Workbook workbook = getWorkbook(xlsTest);
        //get the first and only one sheet
        Sheet sheet = workbook.getSheetAt(0);
        //list to store all hyperlinks, return it later maybe
        ArrayList<String> arrayList = new ArrayList<>();

        // Create a DataFormatter to format and get each cell's value as String
        DataFormatter dataFormatter = new DataFormatter();
        //iterate through the sheet
        sheet.forEach(row -> {
            row.forEach(cell -> {
                String cellValue = dataFormatter.formatCellValue(cell);

                // -- tests
                // --- get specific cell value
//                System.out.println(" ---data---");
//                System.out.println(cellValue);
//                System.out.println(" --data---");
//                //check specific value
//                if(cellValue.equals("")){
//                    System.out.println("empty");
//                }
//                if(cellValue.equals("medical_history:")){
//                    System.out.print("inside IF: >"+cellValue + "\n");
//                }
                //-- tests

                if (cellValue.equals("Articulo")){
                    Hyperlink hyperlink = cell.getHyperlink();
                    System.out.println(hyperlink.getLabel() +" agregando link "+ hyperlink.getAddress());
                    arrayList.add(hyperlink.getAddress());
                    //do something w/ link
                } else {
                    arrayList.add(cellValue);
                }
            });
        });
        workbook.close();
        return arrayList;
    }
    //get the data from a link as a String
    public static String getLink(String url) throws IOException {
        return AbstractScrapper.getAbstractId(url);
    }

}