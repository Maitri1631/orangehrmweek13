package com.orangehram.pages;

import com.orangehram.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class DashboardPage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public DashboardPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//div[@class='oxd-topbar-header']/div/span/h6")
    WebElement  DashboardText;
    //By DashboardText=By.xpath("//div[@class='oxd-topbar-header']/div/span/h6");
    public String DashboardLink(){
        return getTextFromElement(DashboardText);
    }
}
