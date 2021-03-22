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
    public static void createStringExcel(ArrayList<String> arrayList) throws IOException{
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Java Data");
        //to start from 0 since it updates in the loop
        int rows = -1;

//        for (String dataString: arrayList){
//            //creates a new row every time for the loop
//            Row row = sheet.createRow(++rows);
//            //display what site you are scrapping
//            System.out.println("cell is"+ dataString);
//
//            //make a new cell with the scrapped info
//            setCell(row, dataString);
//        }
        for (int i = 0; i < arrayList.size(); i++){

            Row row;

//            if(i%2 != 0){
//                System.out.println("I is: "+i);
//                row = sheet.createRow(rows);
//                Cell cell = row.createCell(1);
//                System.out.println(arrayList.get(i));
//
//                cell.setCellValue(arrayList.get(i));
//            } else {
//                System.out.println("does it ever get here?????????????");
//                row = sheet.createRow(++rows);
//                System.out.println("rows is "+rows);
//                //setCell(row, arrayList.get(i));
//                Cell cell = row.createCell(0);
//                System.out.println(arrayList.get(i));
//                cell.setCellValue(arrayList.get(i));
//            }

            //TODO fix this awful thing
            int cellId;
            if (i%2 != 0){

                cellId = 1;

            } else {
                cellId = 0;
                rows = ++rows;
            }

            row = sheet.createRow(rows);
            System.out.println("rows is "+rows);
            //setCell(row, arrayList.get(i));
            Cell cell = row.createCell(cellId);
            System.out.println(arrayList.get(i));
            cell.setCellValue(arrayList.get(i));



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