package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GetElements {

    /**
     * Waits for, then returns a visible web element
     * @param elementLocator Used to locate the element, e.g. By.Id("xyz")
     * @return WebElement
     */
    public  static WebElement GetVisibleElement(By elementLocator)
    {
        WebDriverWait wait = new WebDriverWait(Driver.driver, Driver.DEFAULT_TIMEOUT);

        return wait.until(ExpectedConditions.visibilityOfElementLocated(elementLocator));
    }

    /**
     * Waits for, then returns a clickable web element
     * @param elementLocator Used to locate the element, e.g. By.Id("xyz")
     * @return WebElement
     */
    public  static WebElement GetClickableElement(By elementLocator)
    {
        WebDriverWait wait = new WebDriverWait(Driver.driver, Driver.DEFAULT_TIMEOUT);

        return wait.until(ExpectedConditions.elementToBeClickable(elementLocator));
    }
}
