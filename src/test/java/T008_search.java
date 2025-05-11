import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.P008_search;

public class T008_search extends testbase{
    P008_search search;
    SoftAssert soft=new SoftAssert();
    @Test
    public void test(){
        search=new P008_search(driver);
        soft.assertEquals(driver.getCurrentUrl(),"https://automationexercise.com/");
        search.clickOnProducts();
        soft.assertEquals(search.allproducts(),"ALL PRODUCTS");
        search.enterProduct();
        search.clickOnSearchButton();
        soft.assertEquals(search.verifySearchProduct(),"SEARCHED PRODUCTS");
        soft.assertTrue(search.productName().contains("Top"));
        System.out.println(search.productName());
        soft.assertAll();
    }
}
