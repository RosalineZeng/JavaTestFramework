package com.uiTest;

import com.uiTest.utils.TestBase;
import org.openqa.selenium.WebDriver;

public class FirstWebTest extends TestBase {
    public static void main(String[] args) {
        // Chrome driver download: https://registry.npmmirror.com/binary.html?path=chromedriver/
//        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
//        ChromeDriver driver = new ChromeDriver();
//        driver.get("http://www.baidu.com/");
//        log.info("Open Baidu");

        WebDriver driver = openURL("http://www.baidu.com");


    }
}
