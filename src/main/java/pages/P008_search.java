package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P008_search extends base{
    public P008_search(WebDriver driver){
        super(driver);
    }
    public final By productsLocator=By.xpath("//a[@href=\"/products\"]");
    public final By allProductsLocator=By.xpath("//h2[@class=\"title text-center\"]");
    public final By searchLocator=By.xpath("//input[@name=\"search\"]");
    public final By searchButtonLocator=By.xpath("//button[@type=\"button\"]");
    public final By searchProductsLocator=By.xpath("//h2[@class=\"title text-center\"]");
    public final By productsNameLocator=By.xpath("//div[@class=\"productinfo text-center\"]//p");
    public void clickOnProducts(){
        click(productsLocator);
    }
    public String allproducts(){
        String product=driver.findElement(allProductsLocator).getText();
        return product;
    }
    public void enterProduct(){
        sendkeys(searchLocator,"Top");
    }
    public void clickOnSearchButton(){
        click(searchButtonLocator);
    }
    public String verifySearchProduct(){
        String search=driver.findElement(searchProductsLocator).getText();
        return search;
    }
    public String productName(){
        String name=driver.findElement(productsNameLocator).getText();
        return name;
    }
}
