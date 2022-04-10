package com.uiTest.utils;

import org.openqa.selenium.WebDriver;

public class TestBase extends BaseUtil {

    /**
     * This is the base file that performs set-up and tear-down operations like –  browser configurations,
     * implicit and explicit waits handling, cookies deletion, etc. Each test class must extend this class.
     */
    public static WebDriver openURL(String url) {
        return new BaseUtil().createDriver(url, "chrome");
    }

}
