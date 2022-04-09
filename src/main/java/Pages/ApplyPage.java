package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ApplyPage extends PageBase{

    public ApplyPage(WebDriver driver) {
        super(driver);
    }

    public By txtName = By.xpath("//input[@name='your-name']");
    public By txtEmail = By.xpath("//input[@name='your-email']");
    public By txtMobile = By.xpath("//input[@name='mobile-number']");
    public By uploadFile = By.xpath("//input[@name='uploadtextfield']");
    public By txtLinkedin = By.xpath("//input[@name='linkedin']");
    public By txtMessage = By.xpath("//textarea[@name='your-message']");
    public By errRequiredName = By.xpath("(//span[@class='wpcf7-not-valid-tip'])[1]");
    public By errMsgEmail = By.xpath("(//span[@class='wpcf7-not-valid-tip'])[2]");
    public By errMsgMobile = By.xpath("(//span[@class='wpcf7-not-valid-tip'])[3]");
    public By btnPrivacyPolicy = By.id("adConsentChx");
    public By btnSend = By.cssSelector("input[type='submit']");
    public By btnClose = By.xpath("//button[@class='close-form']");

    public void setTxtName(String name){
        setText(txtName, name);
    }

    public void setTxtEmail(String email){
        setText(txtEmail, email);
    }

    public void setTxtMobile(String mobile){
        setText(txtMobile, mobile);
    }

    public void upLoadFile(String URL){
        setText(uploadFile, URL);
    }

    public void setTxtLinkedin(String linkedin){
        setText(txtLinkedin, linkedin);
    }

    public void setTxtMessage(String message){
        setText(txtMessage, message);
    }

    public boolean isRequiredNameDisplayed(){
        waitElement(errRequiredName);
        return isDisplayed(errRequiredName);
    }

    public boolean isErrMsgEmailDisplayed(){
        waitElement(errMsgEmail);
        return isDisplayed(errMsgEmail);
    }

    public boolean isErrMsgMobileDisplayed(){
        waitElement(errMsgMobile);
        return isDisplayed(errMsgMobile);
    }

    public void clickPrivacyPolicy(){
        click(btnPrivacyPolicy);
    }

    public void clickSend(){
        click(btnSend);
    }

    public void clickClose(){
        click(btnClose);
    }

}
