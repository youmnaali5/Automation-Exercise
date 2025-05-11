package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class base {
    protected WebDriver driver;
    protected Faker fake = new Faker();
//    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
    public base(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public void click(By by){
//         wait.until(ExpectedConditions.elementToBeClickable(by));
        driver.findElement(by).click();
    }
    public void click(WebElement element){

        element.click();
    }
    public void sendkeys(WebElement element,String text){
        element.clear();
        element.sendKeys(text);
    }
    public void sendkeys(By by, String text){
        driver.findElement(by).clear();
        driver.findElement(by).sendKeys(text);
    }
    public void selectingRandom(WebElement select,By option, int min){
        int selectNum = driver.findElements(option).size();
        int random = fake.number().numberBetween(min,selectNum+1);
        Select select1=new Select(select);
        select1.selectByIndex(random);

    }
    public void waitUntilElementIsClickable(By by){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }
    public void waitUntilElementIsVisiable(By by){
        WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));
    }

}
