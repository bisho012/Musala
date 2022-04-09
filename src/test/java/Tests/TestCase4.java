package Tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.report.AllureReportBuilder;
import ru.yandex.qatools.allure.report.AllureReportBuilderException;

import java.io.File;

public class TestCase4 extends TestBase {

    @Test
    public void getOpeningPositions() throws AllureReportBuilderException {
        homePage.clickCareers();
        careersPage.clickCheckPositions();
        joinUsPage.selectLocationSofia();
        joinUsPage.getAllPositions();
        joinUsPage.selectLocationSkopje();
        joinUsPage.getAllPositions();
    }
}
