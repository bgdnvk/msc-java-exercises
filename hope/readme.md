**Práctica HOPE**

Se coge un archivo .xlss existente, se leen los links y se inserta el abstracto en la celda después del "Resumen".
El resultado final esta en /files/out/resFinal.xlsx

La imagen esta también subida a Docker: https://hub.docker.com/repository/docker/tekbog/repo1

--  
Get all the data from a .xlsx file with the ExcelReader.getCells 
(alternatively if you only want the data from the websites without anything else just use .getExcelLinks,
you can find the output of this in /files/out/abstractData).  
ExcelReader.getCells returns an ArrayList with all stored data
and modifying the URLs into strings for future parsing, this data is from:  /files/in/hope_resumen.xls.


Afterwards we feed this arrayList to ModifyExcel which calls ExcelReader.getLink. 
This method itself calls AbstractScrapper to get the data from the website.
You can change what information to grab modifying L7 "String cssSelect = "div[class=abstract] p";".


ModifyExcel modifies our current arrayList and inserts the scrapped data
from the websites into our current arrayList in the "Resumen" cell.

Finally with all the data formatted and modified in the arrayList, with the website information
scrapped we put everything using CreateExcel and passing our arrayList: CreateExcel.createStringExcel(arrayList). 

If you with to only make an excel of hyperlinks then use the createLinkExcel method
but this one needs a List of HyperLinks.

In order to modify the output of the name you can change L66 in CreateExcel. 
The output file lands in /files/out.

Everything is called through Controller.java. And there are some tests in Tests.Java with Junit.

The docker image can be found above.
