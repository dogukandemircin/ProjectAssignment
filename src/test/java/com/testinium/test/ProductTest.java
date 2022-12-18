package com.testinium.test;

import com.testinium.driver.BaseTest;
import com.testinium.pages.LoginPage;
import com.testinium.pages.ProductPage;
import org.junit.Test;
import org.openqa.selenium.By;

public class ProductTest extends BaseTest {


    @Test
    public void productTest()  {
        LoginPage loginPage = new LoginPage();
        ProductPage productPage = new ProductPage();
        loginPage.login();
        productPage.selectProduct();


    }


}
