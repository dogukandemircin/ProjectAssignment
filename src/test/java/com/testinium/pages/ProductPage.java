package com.testinium.pages;

import com.testinium.methods.Method;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ProductPage {

    Method method;

    Logger logger = LogManager.getLogger(ProductPage.class);

    public ProductPage(){
        method= new Method();
    }

    public void selectProduct() {
        method.sendKeys(By.id("search-input"),"Oyuncak");
        method.click(By.cssSelector(".common-sprite.button-search"));
        method.scrollWithAction(By.cssSelector("#product-493616"));

        //div.hover-menu > a:nth-child(3)

/*
        for (int i = 1 ; i <= 4 ; i++){
            method.findElements(By.cssSelector(".add-to-favorites>.fa.fa-heart")).get(i).click();
            String element = method.findElement(By.id("swal2-title")).getText();
            Assert.assertEquals("Ürün başarılı bir şekilde favorilerinize eklendi!",element);
            method.findElement(By.cssSelector("#swal-toast>div>div>div.swal2-header>button")).click();
            logger.info( i +". Ürün başarıyla favorilere eklendi.");
        }
*/

        method.click(By.cssSelector("#product-407471>div.grid_2.alpha.omega.relative>div.hover-menu>a.add-to-favorites>.fa.fa-heart"));
        Assert.assertTrue("Ürün favorilere eklenmedi",method.isElementVisible(By.cssSelector("#product-407471>div.grid_2.alpha.omega.relative>div.hover-menu>a.in-favorites>.fa.fa-heart.red")));
        logger.info("Ürün başarıyla favorilere eklendi.");
        method.click(By.cssSelector("#product-497984>div.grid_2.alpha.omega.relative>div.hover-menu>a.add-to-favorites>.fa.fa-heart"));
        Assert.assertTrue("Ürün favorilere eklenmedi",method.isElementVisible(By.cssSelector("#product-497984>div.grid_2.alpha.omega.relative>div.hover-menu>a.in-favorites>.fa.fa-heart.red")));
        logger.info("Ürün başarıyla favorilere eklendi.");
        method.click(By.cssSelector("#product-451574>div.grid_2.alpha.omega.relative>div.hover-menu>a.add-to-favorites>.fa.fa-heart"));
        Assert.assertTrue("Ürün favorilere eklenmedi",method.isElementVisible(By.cssSelector("#product-451574>div.grid_2.alpha.omega.relative>div.hover-menu>a.in-favorites>.fa.fa-heart.red")));
        logger.info("Ürün başarıyla favorilere eklendi.");
        method.click(By.cssSelector("#product-440988>div.grid_2.alpha.omega.relative>div.hover-menu>a.add-to-favorites>.fa.fa-heart"));
        Assert.assertTrue("Ürün favorilere eklenmedi",method.isElementVisible(By.cssSelector("#product-440988>div.grid_2.alpha.omega.relative>div.hover-menu>a.in-favorites>.fa.fa-heart.red")));
        logger.info("Ürün başarıyla favorilere eklendi.");

        method.click(By.cssSelector(".logo-icon"));

    }

    public void selectProductForFav(){
        method.sendKeys(By.id("search-input"),"Oyuncak");
        method.click(By.cssSelector(".common-sprite.button-search"));
        method.scrollWithAction(By.cssSelector("#product-493616"));

        method.click(By.cssSelector("#product-494424>div.grid_2.alpha.omega.relative>div.hover-menu>a.add-to-favorites>.fa.fa-heart"));
        Assert.assertTrue("Ürün favorilere eklenmedi",method.isElementVisible(By.cssSelector("#product-494424>div.grid_2.alpha.omega.relative>div.hover-menu>a.in-favorites>.fa.fa-heart.red")));
        logger.info("Ürün başarıyla favorilere eklendi.");
        method.click(By.cssSelector("#product-133053>div.grid_2.alpha.omega.relative>div.hover-menu>a.add-to-favorites>.fa.fa-heart"));
        Assert.assertTrue("Ürün favorilere eklenmedi",method.isElementVisible(By.cssSelector("#product-133053>div.grid_2.alpha.omega.relative>div.hover-menu>a.in-favorites>.fa.fa-heart.red")));
        logger.info("Ürün başarıyla favorilere eklendi.");
        method.click(By.cssSelector("#product-497991>div.grid_2.alpha.omega.relative>div.hover-menu>a.add-to-favorites>.fa.fa-heart"));
        Assert.assertTrue("Ürün favorilere eklenmedi",method.isElementVisible(By.cssSelector("#product-497991>div.grid_2.alpha.omega.relative>div.hover-menu>a.in-favorites>.fa.fa-heart.red")));
        logger.info("Ürün başarıyla favorilere eklendi.");
        method.click(By.cssSelector("#product-495681>div.grid_2.alpha.omega.relative>div.hover-menu>a.add-to-favorites>.fa.fa-heart"));
        Assert.assertTrue("Ürün favorilere eklenmedi",method.isElementVisible(By.cssSelector("#product-495681>div.grid_2.alpha.omega.relative>div.hover-menu>a.in-favorites>.fa.fa-heart.red")));
        logger.info("Ürün başarıyla favorilere eklendi.");

    }



}
