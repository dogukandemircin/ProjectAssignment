package com.testinium.pages;

import com.testinium.methods.Method;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FavoritePage {

    Method method;

    Logger logger = LogManager.getLogger(ProductPage.class);

    public FavoritePage(){
        method= new Method();
    }

    public void favorite(){

    method.click(By.cssSelector("#header-top>div>div.top-menu.fr>ul>li:nth-child(1)>div>ul>li>a"));
    method.click(By.cssSelector("#header-top>div>div.top-menu.fr>ul>li:nth-child(1)>div>ul>li>div>ul>li:nth-child(1)>a"));

    }
}
