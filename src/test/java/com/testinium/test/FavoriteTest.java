package com.testinium.test;

import com.testinium.driver.BaseTest;
import com.testinium.pages.FavoritePage;
import com.testinium.pages.LoginPage;
import com.testinium.pages.ProductPage;
import org.junit.Test;

public class FavoriteTest  extends BaseTest {


    @Test
    public void favorite() {
        FavoritePage favoritePage= new FavoritePage();
        ProductPage productPage=new ProductPage();
        LoginPage loginPage=new LoginPage();
        loginPage.login();
        productPage.selectProductForFav();
        favoritePage.favorite();



    }


}