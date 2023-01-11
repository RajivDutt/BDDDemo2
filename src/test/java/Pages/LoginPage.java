package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver d;
    private By txt_userName = By.id("name");
    private By txt_pwd = By.id("password");
    private By btn_login = By.id("login");
    private By btn_logout = By.id("logout");
    public LoginPage(WebDriver d){
        this.d = d;
        if(!d.getTitle().equals("TestProject Demo")){
            throw new IllegalStateException("This is not login page. The current page is : "
                    + d.getCurrentUrl());
        }
    }
    public void enterUserName(String username){
        d.findElement(txt_userName).sendKeys(username);
    }
    public void enterPassword(String pwd){
        d.findElement(txt_pwd).sendKeys(pwd);
    }
    public void clickLogin(){
        d.findElement(btn_login).click();
    }
    public boolean checkLogoutIsDisplayed(){
        return d.findElement(btn_logout).isDisplayed();
    }
    public void loginValidUser(String Username, String password){
        d.findElement(txt_userName).sendKeys(Username);
        d.findElement(txt_pwd).sendKeys(password);
        d.findElement(btn_login).click();
    }
}
