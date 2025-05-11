import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.P0010_subscriptionCart;
import pages.P009_subscriptionHome;

public class T0010_subscriptionCart extends testbase{
    P0010_subscriptionCart subscriptionCart;
    SoftAssert soft=new SoftAssert();
    @Test
    public void test(){
        subscriptionCart=new P0010_subscriptionCart(driver);
        soft.assertEquals(driver.getCurrentUrl(),"https://automationexercise.com/");
        subscriptionCart.clickOnCart();
        subscriptionCart.scrollDown();
        soft.assertEquals(subscriptionCart.verifySubscription(),"SUBSCRIPTION");
        subscriptionCart.enterEmail("youmnakhalifa630@gmail.com");
        subscriptionCart.clickOnSumbit();
        soft.assertEquals(subscriptionCart.getMessage(),"You have been successfully subscribed!");
        soft.assertAll();
    }
}
