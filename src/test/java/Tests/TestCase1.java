package Tests;

import Utils.ExcelFileManager;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase1 extends TestBase {

    @Test
    public void contactUs() throws Exception {
        homePage.scrollToElement();
        homePage.clickContactUs();
        contactUsPage.setName("Bishoy Ezzat");
        contactUsPage.setEmail(ExcelFileManager.setDataFromExcelFile(0, 1));
        contactUsPage.setMobile("+201220380851");
        contactUsPage.setSubject("Test");
        contactUsPage.setMessage("testing message");
        contactUsPage.scrollToElement();
        contactUsPage.clickSend();
        Assert.assertTrue(contactUsPage.isEmailErrMsgDisplayed());
    }

    @Test
    public void contactUs1() throws Exception {
        homePage.scrollToElement();
        homePage.clickContactUs();
        contactUsPage.setName("Bishoy Ezzat");
        contactUsPage.setEmail(ExcelFileManager.setDataFromExcelFile(0, 2));
        contactUsPage.setMobile("+201220380851");
        contactUsPage.setSubject("Test");
        contactUsPage.setMessage("testing message");
        contactUsPage.scrollToElement();
        contactUsPage.clickSend();
        Assert.assertTrue(contactUsPage.isEmailErrMsgDisplayed());
    }

    @Test
    public void contactUs2() throws Exception {
        homePage.scrollToElement();
        homePage.clickContactUs();
        contactUsPage.setName("Bishoy Ezzat");
        contactUsPage.setEmail(ExcelFileManager.setDataFromExcelFile(0, 3));
        contactUsPage.setMobile("+201220380851");
        contactUsPage.setSubject("Test");
        contactUsPage.setMessage("testing message");
        contactUsPage.scrollToElement();
        contactUsPage.clickSend();
        Assert.assertTrue(contactUsPage.isEmailErrMsgDisplayed());
    }

    @Test
    public void contactUs3() throws Exception {
        homePage.scrollToElement();
        homePage.clickContactUs();
        contactUsPage.setName("Bishoy Ezzat");
        contactUsPage.setEmail(ExcelFileManager.setDataFromExcelFile(0, 4));
        contactUsPage.setMobile("+201220380851");
        contactUsPage.setSubject("Test");
        contactUsPage.setMessage("testing message");
        contactUsPage.scrollToElement();
        contactUsPage.clickSend();
        Assert.assertTrue(contactUsPage.isEmailErrMsgDisplayed());
    }

    @Test
    public void contactUs4() throws Exception {
        homePage.scrollToElement();
        homePage.clickContactUs();
        contactUsPage.setName("Bishoy Ezzat");
        contactUsPage.setEmail(ExcelFileManager.setDataFromExcelFile(0, 5));
        contactUsPage.setMobile("+201220380851");
        contactUsPage.setSubject("Test");
        contactUsPage.setMessage("testing message");
        contactUsPage.scrollToElement();
        contactUsPage.clickSend();
        Assert.assertTrue(contactUsPage.isEmailErrMsgDisplayed());
    }
}