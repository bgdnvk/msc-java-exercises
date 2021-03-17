import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Hyperlink;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateExcel {

//    public static void main(String[] args) throws IOException {
//        XSSFWorkbook workbook = new XSSFWorkbook();
//        XSSFSheet sheet = workbook.createSheet("Java Data");
//
//
//        Row row = sheet.createRow(0);
//        Cell cell = row.createCell(0);
//        cell.setCellValue("cell0");
//        Cell cell2 = row.createCell(2);
//        cell2.setCellValue("cell2");
//
//        Row row2 = sheet.createRow(1);
//        Cell cellInRow2 = row2.createCell(0);
//        cellInRow2.setCellValue("cell in row2");
//
//        Row row3 = sheet.createRow(2);
//        Cell cellInRow3 = row3.createCell(0);
//        cellInRow3.setCellValue("row3");
//
//
//        try (FileOutputStream outputStream = new FileOutputStream("GeneratedExcel.xlsx")) {
//            workbook.write(outputStream);
//        }
//    }

    //Hyperlink hyperlink
    public static void createRows (List<Hyperlink> hyperlinkList) throws IOException{
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Java Data");



        //setCell(row, "data0");
        int rows = 0;

        for (Hyperlink hyperlink: hyperlinkList){
            //creates a new row every time for the loop
            Row row = sheet.createRow(++rows);

            System.out.println("calling "+hyperlink.getAddress());
            //TODO return a string from scrapper
            String scrapperInfo = AbstractScrapper.getAbstractConsola(hyperlink.getAddress());

            //make a new cell with the scrapped info
            setCell(row, scrapperInfo);
        }


        try (FileOutputStream outputStream = new FileOutputStream("GeneratedExcel.xlsx")) {
            workbook.write(outputStream);
        }
    }

    public static void setCell(Row row, String data){
        //put data always in the first row
        Cell cellInRow = row.createCell(0);
        cellInRow.setCellValue(data);
    }

}