package Tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestCase4 extends TestBase{

    @Test
    public void getOpeningPositions(){
        homePage.clickCareers();
        careersPage.clickCheckPositions();
        joinUsPage.selectLocationSofia();
        joinUsPage.print();
        joinUsPage.getAllPositions();
    }
}
