import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.P0011_downloadInvoice;
import pages.P001_register;

import java.io.File;

public class T0011_downloadInvoice extends testbase{
    P0011_downloadInvoice downloadInvoice;
    SoftAssert soft=new SoftAssert();
    File f = new File("C:\\Users\\Nour Soft\\Downloads\\invoice (1).txt");
    @Test
    public void test() throws InterruptedException {
        downloadInvoice=new P0011_downloadInvoice(driver);
        soft.assertEquals(driver.getCurrentUrl(),"https://automationexercise.com/");
        downloadInvoice.addProduct();
        downloadInvoice.clickOnCart();
        soft.assertEquals(driver.getCurrentUrl(),"https://automationexercise.com/view_cart");
        downloadInvoice.clickOnProceed();
        downloadInvoice.clickOnRegister();
        downloadInvoice.fillData("youmna khalifa","youmnakhalifa1459@gmail.com");
        downloadInvoice.clickOnSignUpButton();
        downloadInvoice.chooseRandom();
        downloadInvoice.password();
        downloadInvoice.selectRandomOption();
        downloadInvoice.clickOnCheckbox();
        downloadInvoice.fillOtherData();
        downloadInvoice.clickOnCreateAccount();
        soft.assertEquals(downloadInvoice.getMessageCreate(),"ACCOUNT CREATED!");
        downloadInvoice.clickOncontinue();
        soft.assertEquals(downloadInvoice.getLoggedAs(),"Logged in as youmna khalifa");
        downloadInvoice.clickOnCart();
        downloadInvoice.clickOnProceed();
        soft.assertEquals(downloadInvoice.addressDetails(),"Address Details");
        soft.assertEquals(downloadInvoice.reviewOrder(),"Review Your Order");
        downloadInvoice.description();
        downloadInvoice.clickOnPlaceOrder();
        downloadInvoice.enterDataCard();
        downloadInvoice.clickOnSumbit();
        driver.navigate().back();
        soft.assertEquals(downloadInvoice.successMessage(),"Your order has been placed successfully!");
        driver.navigate().forward();
        downloadInvoice.clickOnDownloadInvoice();
//        ChromeOptions options = new ChromeOptions();
//        options.addExtensions(new File("src/main/resources/invoice (1).txt"));
//        driver= new ChromeDriver(options);
        f.exists();
        System.out.println(f.getPath());
        System.out.println(f.isFile());
        Thread.sleep(2000);
        soft.assertAll();
    }
}
