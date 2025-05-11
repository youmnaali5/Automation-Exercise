import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.P003_logout;

public class T003_logout extends testbase{
    P003_logout logout;
    SoftAssert soft=new SoftAssert();
    @Test
    public void test(){
        logout=new P003_logout(driver);
        soft.assertEquals(driver.getCurrentUrl(),"https://automationexercise.com/");
        logout.clickOnLogin();
        soft.assertEquals(logout.verifyLoginToAccount(),"Login to your account");
        logout.fillFullData("youmnakhalifa630@gmail.com","123456");
        logout.clickOnLoginButton();
        soft.assertEquals(logout.getLoggedAs(),"Logged in as youmna khalifa");
        logout.clickOnLogout();
        soft.assertEquals(driver.getCurrentUrl(),"https://automationexercise.com/login");
        soft.assertAll();
    }
}
