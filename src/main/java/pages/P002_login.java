package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P002_login extends base {

        public P002_login(WebDriver driver) {

            super(driver);
        }
    public final By loginLocator = By.xpath("//a[@href=\"/login\"]");
    public final By loginVerifyLocator=By.xpath("//div[@class=\"login-form\"]/h2");
    public final  By emailLoginLocator = By.xpath("//input[@data-qa=\"login-email\"]");
    public final  By passwordLoginLocator = By.xpath("//input[@data-qa=\"login-password\"]");
    public final  By loginButtonLocator = By.xpath("//button[@data-qa=\"login-button\"]");
    public final By loggedInAsLocator=By.xpath("//ul[@class=\"nav navbar-nav\"]//li[10]");
    public final By deleteAccountLocator=By.xpath("//a[@href=\"/delete_account\"]");
    public final By messageDeleteAccountLocator=By.xpath("//h2[@class=\"title text-center\"]");
    public final By messageIncorrectLocator=By.xpath("//form[@action=\"/login\"]/p");
    public final By continueLocator=By.xpath("//a[@data-qa=\"continue-button\"]");
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
    public void clickOnLoginButton(){

        click(loginButtonLocator);
    }
    public String getLoggedAs(){
        String logged=driver.findElement(loggedInAsLocator).getText();
        return logged;
    }
    public void clickOnDeleteAccount(){

        click(deleteAccountLocator);
    }
    public String getMessageDelete(){
        String delete = driver.findElement(messageDeleteAccountLocator).getText();
        return delete;
    }
    public String verifyIncorrectLogin(){
        String message=driver.findElement(messageIncorrectLocator).getText();
        return message;
    }
    }


