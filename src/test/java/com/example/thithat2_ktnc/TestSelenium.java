package com.example.thithat2_ktnc;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium {

    ChromeDriver chromeDriver;

    @BeforeEach
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        chromeDriver = new ChromeDriver();
//        chromeDriver.get("https://www.bestprice.vn/ve-may-bay?gad_source=1&gclid=Cj0KCQiA_Yq-BhC9ARIsAA6fbAiwlx4VvjfloklcdqBONK7K3Qd1-OS41ZY44KeNMK_cXdd06hFT-zsaAtM3EALw_wcB");
        chromeDriver.get("https://www.etrip4u.com/ve-may-bay?gad_source=1&gclid=Cj0KCQiA_Yq-BhC9ARIsAA6fbAhUKZGl4Co55U2kWurMpePvak0oQv8pSpJ56SXPfpFF9VWPAiSBNmIaAnTvEALw_wcB");
    }

    @Test
    public void testSearchFlight() {

        WebElement clickDiemDi = chromeDriver.findElement(By.xpath("//input[@id='DepartureCity-Holder']"));
        clickDiemDi.click();

        WebElement inputDiemDi = chromeDriver.findElement(By.xpath("//a[@class='location-link'][contains(text(),'Đà Nẵng')]"));
        inputDiemDi.click();

        WebElement clickDiemDen = chromeDriver.findElement(By.xpath("//input[@id='ArrivalCity-Holder']"));
        clickDiemDen.click();

        WebElement inputDiemDen = chromeDriver.findElement(By.xpath("//a[contains(text(),'Huế')]"));
        inputDiemDen.click();


//        WebElement clickNgayDi = chromeDriver.findElement(By.xpath("//div[@class='ui-datepicker-row-break']"));
//        clickNgayDi.click();
//
//        WebElement clickNgayDen = chromeDriver.findElement(By.xpath("//li[@class='col-xs-6 col-sm-3 li-item-des des-chd flight_from_3']"));
//        clickNgayDen.click();

        WebElement timChuyen = chromeDriver.findElement(By.xpath("//input[@id='btnSearchFlight']"));
        timChuyen.click();



    }


    @AfterEach
    public void tearDown() {
        chromeDriver.quit();
    }

}
