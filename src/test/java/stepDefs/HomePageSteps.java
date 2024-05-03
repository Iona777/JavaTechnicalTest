package stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.HomePage;
import utils.Driver;
import utils.ExamineElements;
import utils.GetElements;

import java.nio.channels.Selector;

public class HomePageSteps {

    private HomePage theHomePage;

    public HomePageSteps() {
        theHomePage = new HomePage();
    }

    @Given("I have navigated to the Homepage")
    public void i_have_navigated_to_the_homepage() throws InterruptedException {
        theHomePage.GotoHomePage();
    }

    @And("I accept the cookies popup if present")
    public void i_accept_the_cookies_popup_if_present() throws InterruptedException {
        if (ExamineElements.IsElementDisplayed(theHomePage.GetPopupLocator())) {
            GetElements.GetClickableElement(theHomePage.GetPopupLocator()).click();
        }
    }

    @When("the {string} element is displayed")
    public void theElementIsDisplayed(String element) {
        Assert.assertTrue(ExamineElements.IsElementDisplayed(theHomePage.GetLocator(element)));
    }

    @Then("the {string} element is clickable")
    public void theElementIsClickable(String element) {
        WebElement clickableElement = GetElements.GetClickableElement(theHomePage.GetLocator(element));
        Assert.assertNotNull(clickableElement);
        clickableElement.click();
    }

    @And("I select Industries Select Financial Services under the Choose your Industry tab")
    public void iSelectIndustriesSelectFinancialServicesUnderTheChooseYourIndustryTab() {
        theHomePage.SelectChooseIndustryAndFinancialServices();

    }
}
