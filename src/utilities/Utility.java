package utilities;

import browserfactory.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Utility extends BaseTest {

    // This method wil get web element
    public WebElement getWebElement(By by){
        return driver.findElement(by);
    }

    // This method will get list of web elements
    public List<WebElement> getWebElements(By by){
        return driver.findElements(by);
    }

    // This method will click on web element
    public void clickOnElement(By by){
        driver.findElement(by).click();
    }

    // This method will get text from element
    public String getTextFromElement(By by){
        return driver.findElement(by).getText();
    }

    // This method will send text to element
    public void sendTextOnElement(By by, String text){
        driver.findElement(by).sendKeys(text);
    }

}
