package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class JoinUsPage extends PageBase {

    public JoinUsPage(WebDriver driver) {
        super(driver);
    }

    public By ddlLocation = By.id("get_location");
    public By lblQAEngineer = By.xpath("//div[@class='back']//img[@alt='Automation QA Engineer']");
    List<WebElement> maxNumOfPositions = driver.findElements(By.xpath("//*[@id=\"content\"]/section/div[2]/article"));


    public boolean validateURL(String expURL) {
        boolean result = false;
        if (driver.getCurrentUrl().equals(expURL)) {
            result = true;
        }
        return result;
    }

    public void selectLocationAnyWhere() {
        selectData(ddlLocation, 6);
    }

    public void selectLocationSofia() {
        selectData(ddlLocation, 4);
    }

    public void selectLocationSkopje() {
        selectData(ddlLocation, 5);
    }

    public void clickQAEngineer() {
        hover(lblQAEngineer);
        click(lblQAEngineer);
    }

    public void getAllPositions() {
        List<WebElement> maxNumOfPositions = driver.findElements(By.xpath("//*[@id=\"content\"]/section/div[2]/article"));
        for (int index = 1; index <= maxNumOfPositions.size(); index++) {
            String textPositionValue = driver.findElement(By.xpath("(//h2[@class='card-jobsHot__title'])[" + index + "]"))
                    .getAttribute("data-alt");
            String textURLvalue = driver.findElement(By.xpath("(//a[contains(@href,'www.musala.com/job')])[" + index + "]"))
                    .getAttribute("href");
            System.out.println("Position: " + textPositionValue);
            System.out.println("URL: " + textURLvalue);
        }
    }

}
