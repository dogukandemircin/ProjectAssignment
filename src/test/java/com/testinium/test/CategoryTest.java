package com.testinium.test;

import com.testinium.driver.BaseTest;
import com.testinium.pages.CategoryPage;
import com.testinium.pages.LoginPage;
import org.junit.Test;

public class CategoryTest extends BaseTest {

    @Test
    public void selectAllBook() {
       // LoginPage loginPage = new LoginPage();
        CategoryPage categoryPage=new CategoryPage();
        //loginPage.login();
        categoryPage.category();
    }

}
