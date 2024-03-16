package pages;

import org.openqa.selenium.By;
import utils.Driver;
import utils.GetElements;
import java.util.Map;

public class HomePage {

    private static final By FinancialServicesLocator
            = By.cssSelector(".score-button.btn-clickable-area[href='https://risk.lexisnexis.co.uk/financial-services']");
    private static final By InsuranceLocator
            = By.cssSelector(".score-button.btn-clickable-area[href='https://risk.lexisnexis.co.uk/insurance']");
    private static final By LifeAndPensionsLocator
            = By.cssSelector(".score-button.btn-clickable-area[href='https://risk.lexisnexis.co.uk/life-and-pension']");
    private static final By CorpsAndNonProfitsLocator
            = By.cssSelector(".score-button.btn-clickable-area[href='https://risk.lexisnexis.co.uk/corporations-and-non-profits']");
    private static final By CookiesPopupLocator
            = By.cssSelector("[id='onetrust-accept-btn-handler']");

    private static final By ChooseIndustryLocator = By.xpath(".//*[contains(text(),'Choose Your Industry')]");
    public static final By FinancialServicesIndustryLocator = By.cssSelector("[data-industryname='Financial Services '][data-industrylink='/financial-services'][class='subpage-link']");
    private static final By FinancialCrimeComplianceLocator = By.cssSelector("[href='/financial-services/financial-crime-compliance']");
    private static final By FraudAndIdentityLocator = By.cssSelector("[href='/financial-services/fraud-and-identity-management']");
    private static final By CustomerDataLocator = By.cssSelector("[href='/financial-services/customer-data-management']");
    private static final By CreditRiskLocator = By.cssSelector("[href='/financial-services/credit-risk-assessment']");
    private static final By CollectionsAndRecoveryLocator = By.cssSelector("[href='/financial-services/collections-and-recovery']");
    private static final By InvestigationsAndDueDilegenceLocator = By.cssSelector("[href='/financial-services/tracing-and-investigations']");

    private static final  Map<String, By> LocatorsMap = Map.of(
            "Financial Services", FinancialServicesLocator,
            "Insurance",InsuranceLocator,
            "Life And Pensions",LifeAndPensionsLocator,
            "Corps And NonProfits", CorpsAndNonProfitsLocator,

            "Financial Crime Compliance", FinancialCrimeComplianceLocator,
            "Fraud And Identity", FraudAndIdentityLocator,
            "Customer Data", CustomerDataLocator,
            "Credit Risk",CreditRiskLocator,
            "Collections And Recovery", CollectionsAndRecoveryLocator,
            "Investigations And Due Diligence", InvestigationsAndDueDilegenceLocator
            );


    public By GetLocator(String locatorName){
        return LocatorsMap.get(locatorName);
    }

    public void SelectChooseIndustryAndFinancialServices() {
        GetElements.GetClickableElement(ChooseIndustryLocator).click();
        GetElements.GetClickableElement(FinancialServicesIndustryLocator).click();
    }

    public void GotoHomePage()
    {
        Driver.navigateTo(Driver.rootURL);
    }

    public By GetPopupLocator()
    {
        return CookiesPopupLocator;
    }
}
