package com.uiTest.pages.aiwencai;

import com.uiTest.utils.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    public WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(id = "auto")
    private WebElement wencaiInput;

    @FindBy(id = "qs-enter")
    private WebElement wencaiBtn;

    public ResultPage searchInAiwencai(String queryText) {

        wencaiInput.clear();
        wencaiInput.sendKeys(generateQueryString(queryText));

        wencaiBtn.click();
        return new ResultPage(driver);
    }

    /**
     * 生成i问财搜索条件。 Date format yyyyMMdd
     * @param date
     * @return
     */
    private static String generateQueryString(String date) {
        if (date == null || date.equalsIgnoreCase("")) {
            return null;
        }

        int year = Integer.valueOf(date.substring(0, 4));
        int month = Integer.valueOf(date.substring(4, 6));

        String result = roeCal(year, month) + roeRange(year, month) + marketTime(year, month)
                + revenueNetCal(year, month) + revenueYear(year, month) + "年营业收入、年应收账款、存货、流动比率";

        return result;
    }

    // 计算ROE>=15% 的年份 "2014年到2020年ROE大于等于15%"
    private static String roeCal(int year, int month) {
        int roeStartYear, roeEndYear;
        if (month < 5) {
            roeStartYear = year - 8;
        } else {
            roeStartYear = year - 7;
        }
        roeEndYear = roeStartYear + 6;
        return roeStartYear + "年到" + roeEndYear + "年ROE大于等于15%，";
    }

    // 2021年9月30日ROE大于等于11.25%
    // &IF(MONTH(C4)<5,YEAR(C4)-1,YEAR(C4))&"年"&IF(OR(MONTH(C4)<5,MONTH(C4)>10),"9月30日ROE大于等于11.25%",
    // IF(MONTH(C4)<9,"3月31日ROE大于等于3.75%","6月30日ROE大于等于7.5%"))
    private static String roeRange(int year, int month) {
        String result = "";
        if(month < 5) {
            year --;
            result = year + "年9月30日ROE大于等于11.25%，";
        } else if (month < 9) {
            result = year + "年3月31日ROE大于等于3.75%，";
        } else if (month < 13) {
            result = year + "年6月30日ROE大于等于7.5%，";
        } else {
            result = "Error";
        }
        return result;
    }

    //上市时间"&IF(C4=TODAY(),"大于5年","早于"&YEAR(C4)-5&"年"&MONTH(C4)&"月")&"，
    private static String marketTime(int year, int month) {
        year -= 5;
        return "上市时间早于" + year + "年" + month + "月，行业，";
    }

    // "&IF(MONTH(C4)<5,YEAR(C4)-2,YEAR(C4)-1)&"年营收增长率，
    //     * "&IF(MONTH(C4)<5,YEAR(C4)-1,YEAR(C4))&"年"&IF(OR(MONTH(C4)<5,MONTH(C4)>10),
    //     * "9月30日",IF(MONTH(C4)<9,"3月31日","6月30日"))&"营收增长率，
    private static String revenueNetCal(int year, int month) {
        String revenue = "";
        String net = "";
        int revenueYear;
        if(month < 5) {
            revenueYear = year - 2;
        }else {
            revenueYear = year - 1;
        }
        revenue += revenueYear + "年营收增长率，";
        net += revenueYear + "年净利润增长率，";

        if(month < 5) {
            year --;
        }
        revenue += year + "年";
        net += year + "年";

        if(month < 5 || month > 10) {
            revenue += "9月30日营收增长率，";
            net += "9月30日净利润增长率，";
        } else if(month < 9) {
            revenue += "3月31日营收增长率，";
            net += "3月31日净利润增长率，";
        } else  {
            revenue += "6月30日营收增长率，";
            net += "6月30日净利润增长率，";
        }

        return revenue + net;
    }

    // "&IF(MONTH(C4)<5,YEAR(C4)-5,YEAR(C4)-4)&"年到"&IF(MONTH(C4)<5,YEAR(C4)-2,YEAR(C4)-1)&
    private static String revenueYear(int year, int month) {
        int startYear, endYear;
        if (month < 5) {
            startYear = year - 5;
            endYear = year - 2;
        } else {
            startYear = year - 4;
            endYear = year -1;
        }
        return startYear + "年到" + endYear ;
    }
}