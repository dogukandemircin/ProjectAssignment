package com.testinium.pages;

import com.testinium.methods.Method;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

public class CategoryPage {

    Method method;

    Logger logger = LogManager.getLogger(LoginPage.class);
    public CategoryPage(){
        method=new Method();
    }

    public void category() {
        // method.click(By.cssSelector(".mainNav>nav-content>ul>book.has-menu.active>lvl2.js-bookCr>ul>has-open-menu>mn-strong common-sprite"));
        method.scrollWithAction(By.cssSelector("div.lvl2.js-bookCr>ul>li:nth-child(3)"));
        method.waitBySeconds(3);
        method.click(By.cssSelector("div>ul:nth-child(3)>li:nth-child(14)>a"));
        List<WebElement> bookList = method.findElements(By.cssSelector("#content>div>div:nth-child(2)>div>div:nth-child(2)>ul>li"));
        Random random = new Random();
        bookList.get(random.nextInt(bookList.size())).click();
        method.click(By.id("button-cart"));
    }
}
