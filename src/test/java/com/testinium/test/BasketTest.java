package com.testinium.test;

import com.testinium.driver.BaseTest;
import com.testinium.pages.BasketPage;
import com.testinium.pages.CategoryPage;
import com.testinium.pages.LoginPage;
import org.junit.Test;

public class BasketTest extends BaseTest {
    @Test
    public void basketTest()  {
    LoginPage loginPage = new LoginPage();
    CategoryPage categoryPage=new CategoryPage();
    BasketPage basketPage = new BasketPage();

    loginPage.login();
    categoryPage.category();

}
}
