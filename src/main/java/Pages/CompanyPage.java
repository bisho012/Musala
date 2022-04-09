package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CompanyPage extends PageBase {


    public By logoIcon = By.xpath("(//span[@class='logo'])[2]");
    public By lblLeadership = By.xpath("//h2[contains(.,'Leadership')]");
    public By btnFB = By.xpath("//span[@class='musala musala-icon-facebook']");
    public By btnAcceptCookies = By.id("wt-cli-accept-all-btn");

    public CompanyPage(WebDriver driver) {
        super(driver);
    }

    public boolean isLogoDisplayed() {
        waitElement(logoIcon);
        return isDisplayed(logoIcon);
    }

    public boolean isLeadershipDisplayed() {
        waitElement(lblLeadership);
        return isDisplayed(lblLeadership);
    }

    public void clickFB() {
        click(btnFB);
    }

    public void clickAcceptCookies(){
        click(btnAcceptCookies);
    }

}
