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
    //int maxNumOfOpeningPositions = getNumberOfElementsFound(By.xpath("//div[@class='card-container']"));
    List<WebElement> myListToCheck=driver.findElements(By.xpath("//div[@class='card-container']"));
    int mySize=myListToCheck.size();
    public By cardsNumOfPositions = By.xpath("//div[@class='card-container']");
    int maxNumOfOpeningPositions = driver.findElements(cardsNumOfPositions).size();

    //public By positions = By.xpath("//*[@id=\"content\"]/section/div[2]/article[1]");
    //public By urls = By.xpath("(//a[@class='card-jobsHot__link'])[2]")

    public boolean validateURL(String expURL) {
        boolean result = false;
        if (driver.getCurrentUrl().equals(expURL)) {
            result = true;
        }
        return result;
    }

    public void selectLocationAnyWhere(){
        selectData(ddlLocation,6);
    }

    public void selectLocationSofia(){
        selectData(ddlLocation,4);
    }

    public void selectLocationSkopje(){
        selectData(ddlLocation,5);
    }

    public void clickQAEngineer(){
        hover(lblQAEngineer);
        click(lblQAEngineer);
    }

    public int getNumberOfElementsFound(By by) {
        return driver.findElements(by).size();
    }

    public void printNumOfPositions(){
        System.out.println(mySize);
    }

    public void getAllPositions(){
      for (int index = 1; index <= maxNumOfOpeningPositions; index++) {
//          String textPositionValue = driver.findElement(By.xpath(""))
//                  .getAttribute("value");
          String textURLvalue = driver.findElement(By.xpath("(//a[contains(@href,'www.musala.com/job')])["+ index +"]"))
                  .getAttribute("href");
          System.out.println("URL: "+textURLvalue);
          //System.out.println(textPositionValue);
      }
  }

}
