package testsuite;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class LoginTest extends Utility {

    String baseUrl = "https://www.saucedemo.com/";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){

        // enter username
        sendTextOnElement(By.id("user-name"), "standard_user");
        sendTextOnElement(By.id("password"), "secret_sauce");

        // Click on log in button
        clickOnElement(By.id("login-button"));

        // Verify the product text
        String expectedText = "Products";

        Assert.assertEquals("Product text is not match", expectedText, getTextFromElement(By.xpath("//span[@class='title']")));

    }

    @Test
    public void verifyThatSixProductsAreDisplayedOnPage(){

        // enter username
        sendTextOnElement(By.id("user-name"), "standard_user");
        sendTextOnElement(By.id("password"), "secret_sauce");

        // Click on log in button
        clickOnElement(By.id("login-button"));

        // Verify the product text
        int expectedText = 6;

        Assert.assertEquals("Product text is not match",
                expectedText, getWebElements(By.xpath("//div[@class = 'inventory_item']")).size());
    }


    public void tearDown(){
        closeBrowser();
    }

}
