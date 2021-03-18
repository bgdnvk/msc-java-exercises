import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Hyperlink;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateExcel {

    //create rows given a list of hyperlinks
    public static void createRows (List<Hyperlink> hyperlinkList) throws IOException{
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Java Data");

        int rows = 0;

        for (Hyperlink hyperlink: hyperlinkList){
            //creates a new row every time for the loop
            Row row = sheet.createRow(++rows);
            //display what site you are scrapping
            System.out.println("calling "+hyperlink.getAddress());
            //get text from the website
            String scrappedText = AbstractScrapper.getAbstractConsola(
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

    //put data into the row's cell
    public static void setCell(Row row, String data){
        //put data always in the first row
        Cell cellInRow = row.createCell(0);
        cellInRow.setCellValue(data);
    }

}