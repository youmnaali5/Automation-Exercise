package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P007_allProducts extends base{
    public P007_allProducts(WebDriver driver){
        super(driver);
    }
    public final By productsLocator=By.xpath("//a[@href=\"/products\"]");
    public final By allProductsLocator=By.xpath("//h2[@class=\"title text-center\"]");
    public final By productListLocator=By.xpath("//div[@class=\"features_items\"]");
    public final By viewProductLocator=By.xpath("//a[@href=\"/product_details/1\"]");
    public final By productPageLocator=By.xpath("//div[@class=\"product-details\"]");
    public final By productDetailsLocator=By.xpath("//div[@class=\"product-information\"]");
    public void clickOnProducts(){
        click(productsLocator);
    }
    public String allProducts(){
        String product=driver.findElement(allProductsLocator).getText();
        return product;
    }
    public String productList(){
        String list=driver.findElement(productListLocator).getText();
        return list;
    }
    public void clickOnViewProduct(){
        click(viewProductLocator);
    }
    public String productPage(){
        String page=driver.findElement(productPageLocator).getText();
        return page;
    }
    public String productDetails(){
        String details=driver.findElement(productDetailsLocator).getText();
        return details;
    }
}
