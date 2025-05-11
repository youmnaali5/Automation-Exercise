import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.P007_allProducts;

public class T007_allProducts extends testbase{
    P007_allProducts allProducts;
    SoftAssert soft=new SoftAssert();
    @Test
    public void test(){
        allProducts=new P007_allProducts(driver);
        soft.assertEquals(driver.getCurrentUrl(),"https://automationexercise.com/");
        allProducts.clickOnProducts();
        soft.assertEquals(allProducts.allProducts(),"ALL PRODUCTS");
//        soft.assertTrue(allProducts.productList().isBlank());
        allProducts.clickOnViewProduct();
        System.out.println(allProducts.productDetails());
        soft.assertAll();
    }
}
