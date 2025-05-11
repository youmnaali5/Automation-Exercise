import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.P009_subscriptionHome;

public class T009_subscriptionHome extends testbase{
    P009_subscriptionHome subscriptionHome;
    SoftAssert soft=new SoftAssert();
    @Test
    public void test(){
        subscriptionHome=new P009_subscriptionHome(driver);
        soft.assertEquals(driver.getCurrentUrl(),"https://automationexercise.com/");
        subscriptionHome.scrollDown();
        soft.assertEquals(subscriptionHome.verifySubscription(),"SUBSCRIPTION");
        subscriptionHome.enterEmail("youmnakhalifa630@gmail.com");
        subscriptionHome.clickOnSumbit();
        soft.assertEquals(subscriptionHome.getMessage(),"You have been successfully subscribed!");
        soft.assertAll();
    }
}
