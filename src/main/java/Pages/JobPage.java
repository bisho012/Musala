package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JobPage extends PageBase {

    public JobPage(WebDriver driver) {
        super(driver);
    }

    public By lblGeneralDescription = By.xpath("//h2[contains(.,'General description')]");
    public By lblRequirements = By.xpath("//h2[contains(.,'Requirements')]");
    public By lblResponsibilities = By.xpath("//h2[contains(.,'Responsibilities')]");
    public By lblWhatWeOffer = By.xpath("//h2[contains(.,'What we offer')]");
    public By btnAcceptCookies = By.xpath("//a[@id='wt-cli-accept-all-btn']");
    public By btnApply = By.xpath("//input[@value='Apply']");

    public boolean isGeneralDescriptionDisplayed() {
        waitElement(lblGeneralDescription);
        return action(lblGeneralDescription).isDisplayed();
    }

    public boolean isRequirementsDisplayed() {
        waitElement(lblRequirements);
        return action(lblRequirements).isDisplayed();
    }

    public boolean isResponsibilitiesDisplayed() {
        waitElement(lblResponsibilities);
        return action(lblResponsibilities).isDisplayed();
    }

    public boolean isWhatWeOfferDisplayed() {
        waitElement(lblWhatWeOffer);
        return action(lblWhatWeOffer).isDisplayed();
    }

    public void clickAcceptCookies(){
        click(btnAcceptCookies);
    }

    public void clickApply(){
        click(btnApply);
    }
}
