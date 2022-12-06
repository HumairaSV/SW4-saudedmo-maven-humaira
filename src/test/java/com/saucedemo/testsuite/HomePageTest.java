package com.saucedemo.testsuite;

import com.saucedemo.pages.HomePage;
import com.saucedemo.testbase.BaseTest;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {
    HomePage homePage = new HomePage();

    @Test
    public void verifyElementsOnHomePage(){
        homePage.getPageTitle();
        homePage.getTheCurrentUrl();
        homePage.printThePageSource();
        homePage.enterUsername("standard_user");
        homePage.enterPassword("secret_sauce");
    }
}
