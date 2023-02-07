package com.orangehram.testbase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.orangehram.propertyreader.PropertyReader;
import com.orangehram.utility.Utility;


public class TestBase extends Utility {

    String browser = PropertyReader.getInstance().getProperty("browser");

    @BeforeMethod
    public void setUp(){
        selectBrowser(browser);
    }

    @AfterMethod
    public void tearDown(){
        closeBrowser();
    }
}
