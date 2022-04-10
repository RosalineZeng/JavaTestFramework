package com.uiTest.testCases;

import com.uiTest.pages.BaiduPage;
import com.uiTest.utils.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaiduTest extends TestBase {
    private WebDriver driver = null;

    @BeforeMethod
    public void openBaidu() {
        driver = openURL("http://www.baidu.com");
    }

    @Test
    public void SearchInBaidu() throws InterruptedException {
        log.info("Open Baidu and do search test");
        BaiduPage baidu = PageFactory.initElements(driver, BaiduPage.class);
        baidu.searchInBaidu("TestNG");
    }

    @AfterMethod
    public void closeAll() {
        log.info("Selenium webdriver session terminated");
        driver.quit();
    }
}
