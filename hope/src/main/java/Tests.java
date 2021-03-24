import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Tests {
    @BeforeEach
    public void setUp(){
        System.out.println("before each test");
    }
    @Test
    @DisplayName("check if path is not null")
    public void checkExcelPath(){
        assertNotNull(ExcelReader.getExcelPath(), () -> "shouldn't be null");
    }
    @Test
    @DisplayName("check path is a string")
    public void checkExcelPathIsString(){
        //assertTrue(ExcelReader.getExcelPath().getClass().equals("class java.lang.String"));
        assertTrue(ExcelReader.getExcelPath() instanceof String);
    }


}
