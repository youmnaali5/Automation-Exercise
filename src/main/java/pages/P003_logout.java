package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P003_logout extends base{
    public P003_logout(WebDriver driver){
        super(driver);
    }
    public final By loginLocator = By.xpath("//a[@href=\"/login\"]");
    public final By loginVerifyLocator=By.xpath("//div[@class=\"login-form\"]/h2");
    public final  By emailLoginLocator = By.xpath("//input[@data-qa=\"login-email\"]");
    public final  By passwordLoginLocator = By.xpath("//input[@data-qa=\"login-password\"]");
    public final  By loginButtonLocator = By.xpath("//button[@data-qa=\"login-button\"]");
    public final By loggedInAsLocator=By.xpath("//ul[@class=\"nav navbar-nav\"]//li[10]");
    public final By logoutLocator = By.xpath("//a[@href=\"/logout\"]");
    public  void clickOnLogin(){

        click(loginLocator);
    }
    public String verifyLoginToAccount(){
        String login=driver.findElement(loginVerifyLocator).getText();
        return login;
    }
    public void fillFullData(String email, String password){
        sendkeys(emailLoginLocator,email);
        sendkeys(passwordLoginLocator,password);
    }
    public String getLoggedAs(){
        String logged=driver.findElement(loggedInAsLocator).getText();
        return logged;
    }
    public void clickOnLoginButton(){

        click(loginButtonLocator);
    }
    public void clickOnLogout(){
        click(logoutLocator);
    }
}
