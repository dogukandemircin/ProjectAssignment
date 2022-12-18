package com.testinium.pages;

import com.testinium.methods.Method;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

public class PointsCatalogPage {

    Method method;

    Logger logger = LogManager.getLogger(ProductPage.class);

    public PointsCatalogPage(){
        method= new Method();
    }

    public void pointCatolog(){
        method.click(By.cssSelector(".lvl1catalog"));
        method.waitBySeconds(3);
        method.click(By.xpath("//*[@id='landing-point']/div[4]/a[2]/img"));
        method.selectByText(By.cssSelector(".sort>select"),"Yüksek Oylama");

    }
}
