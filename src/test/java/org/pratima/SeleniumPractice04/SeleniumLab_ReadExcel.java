package org.pratima.SeleniumPractice04;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class SeleniumLab_ReadExcel
{
    @Test
    public void readExcel() {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("src/test/java/org/pratima/DataDriven/Amit_Sharma_SMART_Goals_Setting_2025.xlsx");
        } catch (FileNotFoundException e) {
            System.out.println("Unable to read Excel: ");
            e.printStackTrace();
        }

        Workbook workbook;
        try {
            workbook = new XSSFWorkbook(fis);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Sheet sheet = workbook.getSheetAt(1);

        Row row = sheet.getRow(0);
        System.out.println(row.getCell(0).getStringCellValue());


    }

}
