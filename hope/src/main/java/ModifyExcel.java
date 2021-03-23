import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import java.io.IOException;
import java.util.ArrayList;

public class ModifyExcel {
    public static ArrayList<String> insertCell(ArrayList<String> arrayList) throws IOException, InvalidFormatException {

//        ArrayList<String> arrayList = ExcelReader.getExcelCells();
        for (int i = 0; i < arrayList.size(); i++){
            System.out.println(i);
            System.out.println(arrayList.get(i));
            if (arrayList.get(i).equals("Resumen")){
                String resumenString = ExcelReader.getLink(arrayList.get(i+3));
                arrayList.set(i+1, resumenString);
            }
            //System.out.println(arrayList.get(i+1));
        }
        arrayList.forEach(cell -> System.out.println(cell));
        //--TESTS

        return arrayList;
    }
}
