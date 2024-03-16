package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

public class ExamineElements {

    public static boolean IsElementDisplayed(By elementlocator)
    {
        try {
            WebElement element = GetElements.GetVisibleElement(elementlocator);
            return  element.isDisplayed();
        }
        catch (NoSuchElementException e)
        {
            return false;
        }
    }
}
