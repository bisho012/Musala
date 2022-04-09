package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends PageBase {


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public By btnContactUs = By.xpath("//span[@data-alt='Contact us']");
    public By btnCompany = By.xpath("(//a[contains(.,'Company')])[4]");
    public By btnCareers = By.xpath("(//a[@class='main-link'][text()='Careers'])[4]");


    public void clickContactUs() {
        click(btnContactUs);
    }

    public void clickCompany() {
        click(btnCompany);
    }

    public void clickCareers() {
        click(btnCareers);
    }
}
