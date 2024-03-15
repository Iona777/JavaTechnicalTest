package stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HomePage;
import utils.ExamineElements;
import utils.GetElements;

public class HomePageSteps {

    private HomePage theHomePage;

    public HomePageSteps()
    {
        theHomePage = new HomePage();
    }

    @Given("I have navigated to the Homepage")
    public void i_have_navigated_to_the_homepage() throws InterruptedException {
        theHomePage.GotoHomePage();
    }

    @And("I accept the cookies popup if present")
    public void i_accept_the_cookies_popup_if_present() throws InterruptedException {
        if (ExamineElements.IsElementDisplayed(theHomePage.GetPopupLocator()))
        {
            GetElements.GetClickableElement(theHomePage.GetPopupLocator()).click();
        }
    }


    @Given("the Financial Services element is displayed")
    public void the_financial_services_element_is_displayed() {
        Assert.assertTrue(ExamineElements.IsElementDisplayed(theHomePage.GetFinancialServicesLocator()));
    }
}
