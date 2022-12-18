package com.testinium.pages;

import com.testinium.methods.Method;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;



public class LoginPage {

    Method method;

    Logger logger = LogManager.getLogger(LoginPage.class);
    public LoginPage(){
        method=new Method();
    }

    public void login(){

        method.click(By.cssSelector(".menu-top-button.login>a"));
        method.waitBySeconds(5);
        method.sendKeys(By.id("login-email"),"dogukandemircin3393@gmail.com");
        // method.sendKeys(By.cssSelector("#login-email"),"nese.aydin@testinium.com");
        method.waitBySeconds(3);
        method.sendKeys(By.id("login-password"),"DDdd1234");
        method.waitBySeconds(3);
        method.click(By.cssSelector(".ky-btn.ky-btn-orange.w-100.ky-login-btn"));
        method.waitBySeconds(3);
        Assert.assertTrue(method.isElementVisible(By.cssSelector(".section")));
        method.waitBySeconds(3);
        logger.info("Sayfaya başarıyla login olundu.");
        method.waitBySeconds(3);

    }

}
