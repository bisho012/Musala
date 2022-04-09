package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FacebookPage extends PageBase {

    public FacebookPage(WebDriver driver) {
        super(driver);
    }

    public By logoMusalaPP = By.xpath("(//*[name()='image'])[1]");

    public boolean isLogoDisplayed(){
        waitElement(logoMusalaPP);
        return isDisplayed(logoMusalaPP);
    }
}
