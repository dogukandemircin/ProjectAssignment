package com.testinium.methods;

import com.testinium.driver.BaseTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class Method {

    WebDriver driver;
    FluentWait<WebDriver> wait;
    JavascriptExecutor jsdriver;


    Logger logger = LogManager.getLogger(Method.class);
    public Method(){
        driver = BaseTest.driver;
        wait = new FluentWait<>(driver);
        wait.withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofMillis(300))
                .ignoring(NoSuchElementException.class);
        jsdriver = (JavascriptExecutor) driver;
    }

    public WebElement findElement(By by){

        return  wait.until(ExpectedConditions.presenceOfElementLocated(by));

    }

    public List<WebElement> findElements(By by){
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
        return driver.findElements(by);
    }

    public void click(By by){

        findElement(by).click();

    }

    //Sayfayı istediğimiz kadar bekletiyor.Ama kullanmak iyi değil (görmek için kullandık)
    public void waitBySeconds(long seconds){
        try{
            Thread.sleep(seconds*1000);
        }catch (Exception e){
            e.printStackTrace();

        }

    }

    public void sendKeys(By by,String text){
        findElement(by).sendKeys(text);


    }

    public boolean isElementVisible(By by){
        try{
            wait.until(ExpectedConditions.visibilityOfElementLocated(by));
            logger.info("true");
            return true;
        }catch (Exception e){
            logger.info("false" + e.getMessage());
            return false;
        }
    }

    public void scrollWithAction(By by){
        Actions actions = new Actions(driver);
        actions.moveToElement(findElement(by)).build().perform();
    }

    public void scrollWithJavaS(By by){
        jsdriver.executeScript("arguments[0].scrollIntoView();",findElement(by));

    }

    public Select getSelect(By by){
        return new Select(findElement(by));
    }

    public void selectByText(By by,String text){
        getSelect(by).selectByVisibleText(text);
    }

    public String getAttribute(By by,String attributeName){
        return findElement(by).getAttribute(attributeName);

    }

    public String getText(By by){
        return findElement(by).getText();
    }

    public String getValue(By by){
        return jsdriver.executeScript("return arguments[0].value;",findElement(by)).toString();
    }
    


}
