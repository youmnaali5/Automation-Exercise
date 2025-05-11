import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.P004_register1;

public class T004_register1 extends testbase{
    P004_register1 register1;
    SoftAssert soft = new SoftAssert();
    @Test
    public void test(){
        register1=new P004_register1(driver);
        soft.assertEquals(driver.getCurrentUrl(),"https://automationexercise.com/");
        register1.clickOnSignUp();
        soft.assertEquals(register1.getAssertNewUserLetter(),"New User Signup!","This content isn't correct");
        register1.fillData("youmna khalifa","youmnakhalifa630@gmail.com");
        register1.clickOnSignUpButton();
        soft.assertEquals(register1.verifyEmailExist(),"Email Address already exist!");
        soft.assertAll();
    }
    @Test
    public void test1(){
        register1=new P004_register1(driver);
        soft.assertEquals(driver.getCurrentUrl(),"https://automationexercise.com/");
        register1.clickOnProuct();
        System.out.println(register1.getProductImage());
        System.out.println(register1.getProductPrice());
        System.out.println(register1.getProductTitle());
        register1.clickOnViewProduct();
        soft.assertEquals(register1.getProductImg(), driver.getCurrentUrl());
//        soft.assertEquals(register1.getProductPrice1(),register1.getProductPrice());
//        soft.assertEquals(register1.getProductTitle1(),register1.getProductTitle());
        soft.assertAll();

//        System.out.println(driver.getCurrentUrl());


    }
}
