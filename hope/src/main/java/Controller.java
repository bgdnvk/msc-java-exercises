import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import java.io.IOException;
import java.util.ArrayList;

public class Controller {
    public static void main(String[] args) throws IOException, InvalidFormatException {
        //get arrayList from the provided Excel that's missing information
        ArrayList<String> arrayListFromCells = ExcelReader.getExcelCells();
        //insert the scrapped information from the website into the excel
        ArrayList<String> arrayList = ModifyExcel.insertCell(arrayListFromCells);
        //make the excel with the completed information
        CreateExcel.createStringExcel(arrayList);
    }
}
