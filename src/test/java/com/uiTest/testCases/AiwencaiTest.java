package com.uiTest.testCases;

import com.uiTest.pages.aiwencai.HomePage;
import com.uiTest.pages.aiwencai.ResultPage;
import com.uiTest.utils.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AiwencaiTest extends TestBase {
    private WebDriver driver = null;

    @BeforeMethod
    public void openAiwencai() {
        driver = openURL("https://www.iwencai.com/");
    }

    @Test(enabled = false)
    public void SearchInAiwencai() {
        log.info("Open Aiwencai and do search test");
        HomePage aiwencai = PageFactory.initElements(driver, HomePage.class);
        ResultPage result = aiwencai.searchInAiwencai("20220320");
        String expectedResult = "选出 股票数： 62";
        String actual = result.getResult().getText();
        Assert.assertEquals(actual.trim(), expectedResult.trim());
    }

    @Test
    public void ExportDataFromAiwencai() {
        log.info("Open Aiwencai and export data");
        HomePage aiwencai = PageFactory.initElements(driver, HomePage.class);
        ResultPage result = aiwencai.searchInAiwencai("20220320");

        result = result.displayMoreInOnePage("70");
        result.exportStockToSpreadsheet();
    }

    @AfterMethod
    public void closeAll() {
        log.info("Selenium webdriver session terminated");
        driver.quit();
    }
}
