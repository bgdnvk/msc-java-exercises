import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import java.io.IOException;
import java.util.ArrayList;

public class ModifyExcel {
    public static ArrayList<String> insertCell(ArrayList<String> arrayList) throws IOException, InvalidFormatException {
        //iterate through the arraylist
        //to insert into the 3rd cell after "Resumen"
        for (int i = 0; i < arrayList.size(); i++){
//            System.out.println(i);
//            System.out.println(arrayList.get(i));
            if (arrayList.get(i).equals("Resumen")){
                String resumeString = ExcelReader.getLink(arrayList.get(i+3));
                arrayList.set(i+1, resumeString);
            }
            //System.out.println(arrayList.get(i+1));
        }
        //arrayList.forEach(cell -> System.out.println(cell));

        return arrayList;
    }
}
