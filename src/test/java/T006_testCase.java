import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.P006_testCase;

public class T006_testCase extends testbase{
    P006_testCase testCase;
    SoftAssert soft=new SoftAssert();
    @Test
    public void test(){
        testCase=new P006_testCase(driver);
        soft.assertEquals(driver.getCurrentUrl(),"https://automationexercise.com/");
        testCase.clickOnTestCase();
        soft.assertEquals(driver.getCurrentUrl(),"https://automationexercise.com/test_cases");
        soft.assertAll();
    }
}
