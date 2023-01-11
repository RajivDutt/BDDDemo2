package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static org.openqa.selenium.support.How.*;

public class LoginPage_PF {
    @FindBy(id = "name")
    WebElement txt_Username;

    @FindBy(id = "password")
    WebElement txt_Password;

    @FindBy(id = "login")
    WebElement btn_login;

    @FindBy(partialLinkText = "Shirts")
    List<WebElement> mylinks;

    @FindBy(how = How.ID, using = "name")
    WebElement abc;


    WebDriver d;

    public LoginPage_PF(WebDriver d){
        this.d = d;
        PageFactory.initElements(d,this);
    }
    public void enterUserName(String username){
        txt_Username.sendKeys(username);
    }
    public void enterPassword(String pwd){
        txt_Password.sendKeys(pwd);
    }
    public void clickLogin(){
        btn_login.click();
    }

}
