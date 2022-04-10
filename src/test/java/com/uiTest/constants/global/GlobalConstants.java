package com.uiTest.constants.global;

public class GlobalConstants {

    public static final int TIMEOUT = 15;
    // ****** DRIVER EXECUTABLE FILE PATHS *******************************

    // Mac Chrome driver location
    public static final String MAC_CHROME_DRIVER_PATH =
            System.getProperty("user.dir") + "/src/test/resources/chromedriver";

    // ****** FIREFOX ******

    // Mac Firefox Gecko driver location
    public static final String MAC_FIREFOX_GECKO_DRIVER_PATH =
            System.getProperty("user.dir") + "/src/test/resources/geckodriver"; // Not download yet

    // ****** MICROSOFT WEB DRIVER ******

    public static final String MICROSOFT_WEB_DRIVER_DRIVER_PATH =
            System.getProperty("user.dir") + "/src/main/resources/MicrosoftWebDriver.exe";
}
