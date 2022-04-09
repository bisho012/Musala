package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactUsPage extends PageBase {

    public ContactUsPage(WebDriver driver) {
        super(driver);
    }

    public By txtName = By.name("your-name");
    public By txtEmail = By.name("your-email");
    public By txtMobile = By.name("mobile-number");
    public By txtSubject = By.name("your-subject");
    public By txtMessage = By.name("your-message");
    public By btnSend = By.xpath("//input[@value='Send']");
    public By lblEmailErrMsg = By.xpath("(//span[@class='wpcf7-not-valid-tip'])[1]");


    public void setName(String name) {
        setText(txtName, name);
    }

    public void setEmail(String email) {
        setText(txtEmail, email);
    }

    public void setMobile(String mobile) {
        setText(txtMobile, mobile);
    }

    public void setSubject(String subject) {
        setText(txtSubject, subject);
    }

    public void setMessage(String message) {
        setText(txtMessage, message);
    }

    public void clickSend() {
        click(btnSend);
    }

    public boolean isEmailErrMsgDisplayed() {
        waitElement(lblEmailErrMsg);
        return action(lblEmailErrMsg).isDisplayed();
    }

}
