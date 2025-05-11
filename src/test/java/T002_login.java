import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.P002_login;

public class T002_login extends testbase{
    P002_login login;
    SoftAssert soft=new SoftAssert();
    @Test
    public void loginWithValidData(){
     login = new P002_login(driver);
     soft.assertEquals(driver.getCurrentUrl(),"https://automationexercise.com/");
     login.clickOnLogin();
     soft.assertEquals(login.verifyLoginToAccount(),"Login to your account");
     login.fillFullData("youmnakhalifa630@gmail.com","123456");
     login.clickOnLoginButton();
     soft.assertEquals(login.getLoggedAs(),"Logged in as youmna khalifa");
     login.clickOnDeleteAccount();
     soft.assertEquals(login.getMessageDelete(),"ACCOUNT DELETED!E-commerce solutions");
     soft.assertAll();

    }
    @Test
    public void loginWithInvalidData(){
        login = new P002_login(driver);
        soft.assertEquals(driver.getCurrentUrl(),"https://automationexercise.com/");
        login.clickOnLogin();
        soft.assertEquals(login.verifyLoginToAccount(),"Login to your account");
        login.fillFullData("youmnakhalifa630@gmail.com","12345698");
        login.clickOnLoginButton();
        soft.assertEquals(login.verifyIncorrectLogin(),"Your email or password is incorrect!");
        soft.assertAll();

    }

}
