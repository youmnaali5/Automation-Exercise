package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P0010_subscriptionCart extends base{
    public P0010_subscriptionCart(WebDriver driver){
        super(driver);
    }
    public final By cartLocator=By.xpath("//ul[@class=\"nav navbar-nav\"]//a[@href=\"/view_cart\"]");
    public final By scrollDownLocator=By.xpath("//footer[@id=\"footer\"]");
    public final By subscriptionLocator=By.xpath("//div[@class=\"single-widget\"]/h2");
    public final By emailLocator=By.xpath("//input[@type=\"email\"]");
    public final By sumbitLocator=By.xpath("//button[@type=\"submit\"]");
    public final By messageLocator=By.xpath("//div[@class=\"alert-success alert\"]");
    public void clickOnCart(){
        click(cartLocator);
    }
    public void scrollDown(){
        click(scrollDownLocator);
    }
    public String verifySubscription(){
        String verify=driver.findElement(subscriptionLocator).getText();
        return verify;
    }
    public void enterEmail(String email){
        sendkeys(emailLocator,email);
    }
    public void clickOnSumbit(){
        click(sumbitLocator);
    }
    public String getMessage(){
        String success=driver.findElement(messageLocator).getText();
        return success;
    }
}
