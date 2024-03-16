package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GetElements {

    public  static WebElement GetVisibleElement(By elementLocator)
    {
        WebDriverWait wait = new WebDriverWait(Driver.driver, Driver.DEFAULT_TIMEOUT);

        return wait.until(ExpectedConditions.visibilityOfElementLocated(elementLocator));
    }


    public  static WebElement GetClickableElement(By elementLocator)
    {
        WebDriverWait wait = new WebDriverWait(Driver.driver, Driver.DEFAULT_TIMEOUT);

        return wait.until(ExpectedConditions.elementToBeClickable(elementLocator));
    }
}
