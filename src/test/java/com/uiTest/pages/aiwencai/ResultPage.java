package com.uiTest.pages.aiwencai;

import com.uiTest.utils.BasePage;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.List;

public class ResultPage extends BasePage {
    public WebDriver driver;

    public ResultPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getResult() {
        return wait_until_ElementIs_Visible(driver, By.id("boxTitle"));
    }

    public ResultPage displayMoreInOnePage(String pages) {
        WebElement pageSelect = wait_until_ElementIs_Present(driver, By.xpath("//div[@id='showPerpage']/select"));
        selectFromDropdownByValue(pageSelect,pages);
        waitForPageToLoad(driver);
        return new ResultPage(driver);
    }

    public void exportStockToSpreadsheet() {
        // Export aiwencai data into spreadsheet
        List<WebElement> stockNumbers = wait_until_ElementsAre_Visible(driver, By.xpath("//div[@id='tableWrap']/div[2]/div/div[2]/div/table/tbody/tr/td[3]/div"));
        List<WebElement> stockNames = wait_until_ElementsAre_Visible(driver, By.xpath("//div[@id='tableWrap']/div[2]/div/div[2]/div/table/tbody/tr/td[4]/div/a"));
        List<WebElement> industry = wait_until_ElementsAre_Visible(driver, By.xpath("//*[@id='tableWrap']/div[2]/div/div[1]/div/div/div[2]/table/tbody/tr/td[12]/div"));
        List<WebElement> currentPrice = wait_until_ElementsAre_Visible(driver,By.xpath("//*[@id='tableWrap']/div[2]/div/div[1]/div/div/div[2]/table/tbody/tr/td[1]/div"));

        log.info("Starting to export data to spreadsheet...");

        try {
            FileOutputStream fos = new FileOutputStream("src/test/resources/aiwencai/aiwencai.xlsx" );

            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet sheet = workbook.createSheet("aiwencai");

            log.info("Set spreadsheet header...");
            setSpreadsheetHeader(sheet, "股票代码", "股票简称", "所属同花顺行业", "现价(元)");

            log.info("Set spreadsheet content...");
            setSpreadsheetContent(sheet, stockNumbers, stockNames, industry, currentPrice);

            fos.flush();
            workbook.write(fos);

            fos.close();
            log.info("Finished to export data to spreadsheet.");

        } catch (FileNotFoundException e) {
            log.error("File not found exception: " + e.getMessage());
        } catch (IOException e) {
            log.error("IO Exception exception: " + e.getMessage());
        }

    }

    private static void setSpreadsheetHeader(Sheet sheet, String... headerNames) {
        Row header = sheet.createRow(0);
        for(int i = 0; i < headerNames.length; i++) {
            Cell headerC = header.createCell(i);
            headerC.setCellType(XSSFCell.CELL_TYPE_STRING);
            headerC.setCellValue(headerNames[i]);
        }
    }

    private static void setSpreadsheetContent(Sheet sheet, List<WebElement>... columns) {
        int size = columns[0].size();

        for(int i = 0; i < size; i++ ) {
            Row row = sheet.createRow(i + 1);
            for (int j = 0; j < columns.length; j++) {
                String value = columns[j].get(i).getText().trim();

                Cell cell = row.createCell(j);
                cell.setCellType(XSSFCell.CELL_TYPE_STRING);
                cell.setCellValue(value);
            }
        }
    }
}
