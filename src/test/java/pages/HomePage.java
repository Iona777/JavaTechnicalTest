package pages;

import org.openqa.selenium.By;
import utils.Driver;

public class HomePage {

    private static final By FinancialServicesLocator
            = By.cssSelector(".score-button.btn-clickable-area[href='https://risk.lexisnexis.co.uk/financial-services']");

    private static final By CookiesPopupLocator
            = By.cssSelector("[id='onetrust-accept-btn-handler']");

    public void GotoHomePage()
    {
        Driver.navigateTo(Driver.rootURL);
    }

    public By GetFinancialServicesLocator()
    {
        return FinancialServicesLocator;
    }

    public By GetPopupLocator()
    {
        return CookiesPopupLocator;
    }
}
