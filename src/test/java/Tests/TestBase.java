package Tests;

import Pages.*;
import com.google.common.collect.ImmutableMap;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.ArrayList;

import static com.github.automatedowl.tools.AllureEnvironmentWriter.allureEnvironmentWriter;

public class TestBase {
    WebDriver driver;
    HomePage homePage;
    ContactUsPage contactUsPage;
    CompanyPage companyPage;
    FacebookPage facebookPage;
    CareersPage careersPage;
    JoinUsPage joinUsPage;
    JobPage jobPage;
    ApplyPage applyPage;

    private final String url="http://www.musala.com/";

    @BeforeSuite
    void setEnvironment() {
        allureEnvironmentWriter(
                ImmutableMap.<String, String>builder()
                        .put("Browser", "Chrome")
                        .put("Browser.Version", "97.0.4692.71")
                        .put("URL", url)
                        .build(), System.getProperty("user.dir")
                        + "/allure-results/");
    }

    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to(url);
        homePage = new HomePage(driver);
        contactUsPage = new ContactUsPage(driver);
        companyPage = new CompanyPage(driver);
        facebookPage = new FacebookPage(driver);
        careersPage = new CareersPage(driver);
        joinUsPage = new JoinUsPage(driver);
        jobPage = new JobPage(driver);
        applyPage = new ApplyPage(driver);
    }

    @AfterMethod
    public void tearDown(){
        //driver.quit();
    }

    public void switchTab(){
        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
    }

}
