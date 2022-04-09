package Tests;

import Utils.Stable;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase3 extends TestBase{

    @Test
    public void CareersTest(){
        homePage.clickCareers();
        careersPage.clickCheckPositions();
        joinUsPage.validateURL("https://www.musala.com/careers/join-us/");
        joinUsPage.selectLocationAnyWhere();
        joinUsPage.clickQAEngineer();
        Assert.assertTrue(jobPage.isGeneralDescriptionDisplayed());
        Assert.assertTrue(jobPage.isRequirementsDisplayed());
        Assert.assertTrue(jobPage.isResponsibilitiesDisplayed());
        Assert.assertTrue(jobPage.isWhatWeOfferDisplayed());
        jobPage.scrollToElement();
        jobPage.clickAcceptCookies();
        jobPage.clickApply();
        applyPage.setTxtEmail("test@123");
        applyPage.setTxtMobile("test");
        applyPage.upLoadFile(Stable.UploadFilePath);
        applyPage.setTxtLinkedin("bla bla");
        applyPage.setTxtMessage("message");
        applyPage.clickPrivacyPolicy();
        applyPage.clickSend();
        applyPage.clickClose();
        Assert.assertTrue(applyPage.isRequiredNameDisplayed(),"Failed to display Req Name Err message");
        Assert.assertTrue(applyPage.isErrMsgEmailDisplayed(),"Failed to display Email Err message");
        Assert.assertTrue(applyPage.isErrMsgEmailDisplayed(),"Failed to display Mobile Err message");
    }
}
