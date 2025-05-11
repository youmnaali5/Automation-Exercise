package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P004_register1 extends base{

    public P004_register1 (WebDriver driver){

        super(driver);
    }
    private By productImgLocator= By.xpath("//div[@class=\"col-sm-4\"][2]//div[@class=\"productinfo text-center\"]//img");
    private By productPriceLocator= By.xpath("//div[@class=\"col-sm-4\"][2]//div[@class=\"productinfo text-center\"]//h2");
    private By productTitleLocator= By.xpath("//div[@class=\"col-sm-4\"][2]//div[@class=\"productinfo text-center\"]//p");
    public final By signUpLocator = By.xpath("//a[@href=\"/login\"]");
    public final By userLetterLocator =By.xpath("//div[@class=\"signup-form\"]/h2");
    public final  By nameRegisterLocator = By.xpath("//input[@data-qa=\"signup-name\"]");
    public final  By emailRegisterLocator = By.xpath("//input[@data-qa=\"signup-email\"]");
    public final  By signUpButtonLocator = By.xpath("//button[@data-qa=\"signup-button\"]");
    public final By messageExistLocator=By.xpath("//form[@action=\"/signup\"]/p");
    public final By productLocator =By.xpath("//a[@href=\"/products\"]");
    public final By viewProductLocator=By.xpath("//a[@href=\"/product_details/2\"]");
    public final By productImg =By.xpath("//img[@src=\"/get_product_picture/2\"]");
    public final By productPrice=By.xpath("//div[@class=\"product-information\"]/span/span");
    public final By productTitle =By.xpath("//div[@class=\"product-information\"]/h2");



    public  void clickOnSignUp(){

        click(signUpLocator);
    }
    public String getAssertNewUserLetter(){
        String text = driver.findElement(userLetterLocator).getText();
        return text;
    }
    public void fillData(String name, String email){
        sendkeys(nameRegisterLocator,name);
        sendkeys(emailRegisterLocator,email);
    }
    public void clickOnSignUpButton(){
        click(signUpButtonLocator);
    }
    public String verifyEmailExist(){
        String message=driver.findElement(messageExistLocator).getText();
        return message;
    }
    public void clickOnProuct(){
        click(productLocator);
    }
    public void clickOnViewProduct(){
        click(viewProductLocator);
    }
    public String getProductImage(){
        String name =driver.findElement(productImgLocator).getAttribute("src");
        return name;

    }
    public String getProductPrice(){
        String price =driver.findElement(productPriceLocator).getText();
        return price;

    }
    public String getProductTitle(){
        String title =driver.findElement(productTitleLocator).getText();
        return title;
    }
    public String getProductImg(){
        String img =driver.findElement(productImg).getAttribute("src");
        return img;
    }
    public String getProductTitle1(){
        String title1 =driver.findElement(productTitle).getText();
        return title1;
    }
    public String getProductPrice1(){
        String price1 =driver.findElement(productPrice).getText();
        return price1;
    }
}
