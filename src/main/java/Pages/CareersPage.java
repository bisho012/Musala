package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CareersPage extends PageBase{

    public CareersPage(WebDriver driver) {
        super(driver);
    }

    public By btnCheckPosititons = By.xpath("//button[@class='contact-label contact-label-code btn btn-1b']");

    public void clickCheckPositions(){
        click(btnCheckPosititons);
    }
}
