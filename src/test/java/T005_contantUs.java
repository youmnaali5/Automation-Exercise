import org.openqa.selenium.Alert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.P005_contantUs;

public class T005_contantUs extends testbase{
    P005_contantUs contantUs;
    SoftAssert soft=new SoftAssert();

    @Test
    public void test() throws InterruptedException {
        contantUs=new P005_contantUs(driver);
        soft.assertEquals(driver.getCurrentUrl(),"https://automationexercise.com/");
        contantUs.clickOnContantUs();
        soft.assertEquals(contantUs.getInTouch(),"GET IN TOUCH");
        contantUs.enterData("youmna khalifa","youmnakhalifa630@gmail.com");
        contantUs.uploadFile();
        contantUs.clickOnSumbit();
        Alert alert=driver.switchTo().alert();
        alert.accept();
        soft.assertEquals(contantUs.verifySuccessMessage(),"Success! Your details have been submitted successfully.");
        contantUs.clickOnHome();
        soft.assertEquals(driver.getCurrentUrl(),"https://automationexercise.com/");
        soft.assertAll();

    }
}
