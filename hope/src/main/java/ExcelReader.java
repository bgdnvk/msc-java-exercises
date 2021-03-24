import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
//https://www.callicoder.com/java-read-excel-file-apache-poi/

public class ExcelReader {

    //TODO change path? and use the proper xls
    //set the file to read
    //private static String excelPath = "src/hope_resumen_test2.xls";
    private static String excelPath = "files/in/hope_resumen_test2.xls";

    public static void setExcelPath(String path){
        ExcelReader.excelPath = path;
    }
    public static String getExcelPath(){
        return excelPath;
    }

    //get the workbook
    public static Workbook getWorkbook(String xlsx) throws IOException, InvalidFormatException {
        Workbook workbook = WorkbookFactory.create(new File(xlsx));
        return workbook;
    }

    //get all the hyperlinks from the excel
    public static List<Hyperlink> getExcelLinks() throws IOException, InvalidFormatException{
        Workbook workbook = getWorkbook(excelPath);
        //get the first and only one sheet
        Sheet sheet = workbook.getSheetAt(0);
        //list to store all hyperlinks, return it later maybe
        List<Hyperlink> hyperlinkList = new ArrayList<>();

        // Create a DataFormatter to format and get each cell's value as String
        DataFormatter dataFormatter = new DataFormatter();

        //iterate through the sheet
        sheet.forEach(row -> {
            row.forEach(cell -> {
                //get hyperlink from the cell
                Hyperlink hyperlink = cell.getHyperlink();
                //if hyperlink exists then add it to the list
                if (hyperlink != null){
                    //System.out.println(hyperlink.getLabel() +" agregando link "+ hyperlink.getAddress());
                    hyperlinkList.add(hyperlink);
                    //TODO make new excel, insert from here if not using hyperlinklist?
                }

            });
        });
        workbook.close();
        return hyperlinkList;
    }
    //get all the cells from the excel
    public static ArrayList<String> getExcelCells() throws IOException, InvalidFormatException {
        Workbook workbook = getWorkbook(excelPath);
        //get the first and only one sheet
        Sheet sheet = workbook.getSheetAt(0);
        //list to store all hyperlinks, return it later maybe
        ArrayList<String> arrayList = new ArrayList<>();
        // Create a DataFormatter to format and get each cell's value as String
        DataFormatter dataFormatter = new DataFormatter();
        //iterate through the sheet
        sheet.forEach(row -> {
            row.forEach(cell -> {
                //get cell value formatted
                String cellValue = dataFormatter.formatCellValue(cell);
                //add the hyperlink to the arraylist from the cell w/ "articulo" names
                if (cellValue.equals("Articulo")){
                    Hyperlink hyperlink = cell.getHyperlink();
                    System.out.println(hyperlink.getLabel() +" agregando link "+ hyperlink.getAddress());
                    arrayList.add(hyperlink.getAddress());
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