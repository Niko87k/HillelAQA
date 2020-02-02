package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    public static void login(WebDriver driver) {

        String xpathUserName = "//input[@id='login-form-username']";
        WebElement inputField = driver.findElement(By.xpath(xpathUserName));
        inputField.sendKeys(ConfigManager.getInstance().getUserName());
        String xpathPassword = "//input[@id='login-form-password']";
        WebElement inputField2 = driver.findElement(By.xpath(xpathPassword));
        inputField2.sendKeys(ConfigManager.getInstance().getUserPwd());
        String xpathLogIn = "//input[@id='login-form-submit']";
        driver.findElement(By.xpath(xpathLogIn)).click();
    }
}
