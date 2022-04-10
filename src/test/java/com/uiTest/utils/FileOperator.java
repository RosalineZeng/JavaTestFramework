package com.uiTest.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.WebElement;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileOperator {

    public static Logger log = LogManager.getLogger();

    public void writingToCSV(String filePath, String content) {
        try {
            FileWriter writecsv = new FileWriter(filePath);
            writecsv.write(content);

            writecsv.close();
        } catch (IOException e) {
            log.error("FileOperator error: " + e.getMessage());
        } finally {
            log.info("writing to csv done.");
        }
    }

    public void webTableToSpreadsheet(String filePath, String sheetName, List<WebElement> elements) {
        log.info("Starting to export data to spreadsheet...");

        try {
            FileOutputStream fos = new FileOutputStream(filePath);

            Workbook workbook = new HSSFWorkbook();
            Sheet sheet = workbook.createSheet(sheetName);


        } catch (FileNotFoundException e) {
            log.error("Error in export spreadsheet: " + e.getMessage());
        }

    }
}
