package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P005_contantUs extends base{
    public P005_contantUs(WebDriver driver){
        super(driver);
    }
    public final By contantUsLocator=By.xpath("//a[@href=\"/contact_us\"]");
    public final By getInTouchLocator=By.xpath("//div[@class=\"contact-form\"]//h2[@class=\"title text-center\"]");
    public final By nameLocator=By.xpath("//input[@name=\"name\"]");
    public final By emailLocator=By.xpath("//input[@name=\"email\"]");
    public final By uploadFileLocator=By.xpath("//input[@name=\"upload_file\"]");
    public final By sumbitLocator=By.xpath("//input[@name=\"submit\"]");
    public final By messageLocator=By.xpath("//div[@style=\"display: block;\"]");
    public final By homeLocator=By.xpath("//a[@class=\"btn btn-success\"]");
   public void clickOnContantUs(){
       click(contantUsLocator);
   }
   public String getInTouch(){
       String verify=driver.findElement(getInTouchLocator).getText();
       return verify;
   }
   public void enterData(String name ,String email){
       sendkeys(nameLocator,name);
       sendkeys(emailLocator,email);
   }
   public void uploadFile(){
       sendkeys(uploadFileLocator,"C:\\Users\\Nour Soft\\Downloads\\Copy of Bug Summary Report Temp.xlsx");
       waitUntilElementIsVisiable(uploadFileLocator);
   }
   public void clickOnSumbit(){
       click(sumbitLocator);
   }
   public String verifySuccessMessage(){
       String message=driver.findElement(messageLocator).getText();
       return message;
   }
   public void clickOnHome(){
       click(homeLocator);
   }
}
