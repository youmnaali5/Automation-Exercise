package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P006_testCase extends base{
    public P006_testCase(WebDriver driver){
        super(driver);
    }
    public final By testCaseLocator=By.xpath("//a[@href=\"/test_cases\"]");
    public void clickOnTestCase(){
        click(testCaseLocator);
    }
}
