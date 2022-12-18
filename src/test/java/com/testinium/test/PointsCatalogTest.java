package com.testinium.test;

import com.testinium.driver.BaseTest;
import com.testinium.pages.PointsCatalogPage;
import com.testinium.pages.ProductPage;
import org.junit.Test;

public class PointsCatalogTest extends BaseTest {

    @Test
    public void pointCatolog(){
       PointsCatalogPage pointsCatalogPage = new PointsCatalogPage();
        pointsCatalogPage.pointCatolog();
    }
}
