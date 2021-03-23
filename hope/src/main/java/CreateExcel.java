import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Hyperlink;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateExcel {

    //create rows given a list of hyperlinks
    public static void createLinkExcel(List<Hyperlink> hyperlinkList) throws IOException{
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Java Data");
        //rows start
        int rows = 0;

        for (Hyperlink hyperlink: hyperlinkList){
            //creates a new row every time for the loop
            Row row = sheet.createRow(++rows);
            //display what site you are scrapping
            System.out.println("calling "+hyperlink.getAddress());
            //get text from the website
            String scrappedText = AbstractScrapper.getAbstractId(
                    hyperlink.getAddress());
            //make a new cell with the scrapped info
            setCell(row, scrappedText);
        }

        //TODO change the path?
        //make the excel
        try (FileOutputStream outputStream = new FileOutputStream("GeneratedExcel.xlsx")) {
            workbook.write(outputStream);
        }
    }
    //create an excel that spreads data into two cells per row
    public static void createStringExcel(ArrayList<String> arrayList) throws IOException{
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Java Data");
        //to start from 0 since it updates in the loop
        int rows = -1;

        //System.out.println(arrayList.size());
        //the input has continous rows, we need to break it
        //every row has 2 cells, so we increase by 2 and make 2 cells per row
        for (int i = 0; i < arrayList.size(); i+=2){
            //check i
            //System.out.println("i is: "+i);

            //make a new row every time the loop is called
            Row row = sheet.createRow(++rows);
            //make the two cells
            Cell cell0 = row.createCell(0);
            Cell cell1 = row.createCell(1);
            //add data to the two cells, then continue
            cell0.setCellValue(arrayList.get(i));
            cell1.setCellValue(arrayList.get(i+1));

        }

        //TODO change the path?
        //make the excel
        try (FileOutputStream outputStream = new FileOutputStream("fromArrayList.xlsx")) {
            workbook.write(outputStream);
        }
    }

    //put data into the row's cell
    public static void setCell(Row row, String data){
        //put data always in the first row
        Cell cellInRow = row.createCell(0);
        cellInRow.setCellValue(data);
    }

}