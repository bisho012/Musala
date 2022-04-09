package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase2 extends TestBase {

    @Test
    public void companyPageTest(){
        homePage.clickCompany();
        Assert.assertTrue(companyPage.isLogoDisplayed());
        companyPage.scrollToElement();
        Assert.assertTrue(companyPage.isLeadershipDisplayed());
        companyPage.clickAcceptCookies();
        companyPage.clickFB();
        switchTab();
        Assert.assertTrue(facebookPage.isLogoDisplayed());
    }
}
