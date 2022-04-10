package com.uiTest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class BaiduPage {
    public WebDriver driver;

    @FindBy(id = "kw")
    private WebElement searchInput;

    @FindBy(id = "su")
    private WebElement submitBtn;

    public BaiduPage(WebDriver driver) {
        this.driver = driver;
    }

    public void searchInBaidu(String search) throws InterruptedException {
        searchInput.clear();
        searchInput.sendKeys(search);

        submitBtn.click();
        Thread.sleep(3000);
    }
}
