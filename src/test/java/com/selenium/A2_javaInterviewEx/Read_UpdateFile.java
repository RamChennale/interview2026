package com.selenium.A2_javaInterviewEx;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.Properties;

public class Read_UpdateFile {
    public static void main(String[] args) throws IOException, FileNotFoundException {

        //**Reading a text file:**
        BufferedReader bufferedReader = new BufferedReader(new FileReader("data.txt"));
        String line ;
        while ((line = bufferedReader.readLine())!=null){
            System.out.println(line);
        }

//**Writing/updating a text file:**
        FileWriter fileWriter = new FileWriter("data.txts", true);
        fileWriter.write("new txt added to file ");
        fileWriter.close();

//**Reading Excel (Apache POI)** — common in data-driven frameworks:

        FileInputStream fileInputStream = new FileInputStream("Testdata.xlsx");
        Workbook workbook = new XSSFWorkbook(fileInputStream);
        Sheet sheet = workbook.getSheetAt(0);
        Row row = sheet.getRow(1);
        String value = row.getCell(0).getStringCellValue();
        workbook.close();



//**Reading Properties file (for config):**

        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream("config.properties");
        prop.load(fis);
        String url = prop.getProperty("baseURL");
























    }
}
