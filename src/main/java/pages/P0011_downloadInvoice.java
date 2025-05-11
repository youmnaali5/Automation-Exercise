package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class P0011_downloadInvoice extends base{
    public P0011_downloadInvoice(WebDriver driver){
        super(driver);
    }
    public final By prouctsLocator=By.xpath("//div[@class=\"col-sm-4\"]");
    public final By cartLocator=By.xpath("//ul[@class=\"nav navbar-nav\"]//a[@href=\"/view_cart\"]");
    public final By proceedLocator=By.xpath("//a[@class=\"btn btn-default check_out\"]");

   public final By registerLocator=By.xpath("//p[@class=\"text-center\"]//a[@href=\"/login\"]");
    public final  By nameRegisterLocator = By.xpath("//input[@data-qa=\"signup-name\"]");
    public final  By emailRegisterLocator = By.xpath("//input[@data-qa=\"signup-email\"]");
    public final  By signUpButtonLocator = By.xpath("//button[@data-qa=\"signup-button\"]");
    public final  By genderLocator = By.xpath("//div[@class=\"clearfix\"]");
    public final  By passwordRegisterLocator = By.xpath("//input[@data-qa=\"password\"]");
    public final  By dateOfDaysLocator = By.xpath("//select[@data-qa=\"days\"]//option");
    public final  By dateOfMonthsLocator = By.xpath("//select[@data-qa=\"months\"]//option");
    public final  By dateOfYearsLocator = By.xpath("//select[@data-qa=\"years\"]//option");
    public final  By newsLetterLocator = By.xpath("//input[@id=\"newsletter\"]");
    public final  By optionLocator = By.xpath("//input[@id=\"optin\"]");
    public final  By firstNameLocator = By.xpath("//input[@data-qa=\"first_name\"]");
    public final  By lastNameLocator = By.xpath("//input[@data-qa=\"last_name\"]");
    public final  By companyRegisterLocator = By.xpath("//input[@data-qa=\"company\"]");
    public final  By addressRegisterLocator = By.xpath("//input[@data-qa=\"address\"]");
    public final  By countryRegisterLocator = By.xpath("//input[@data-qa=\"country\"]//option");
    public final  By stateRegisterLocator = By.xpath("//input[@data-qa=\"state\"]");
    public final  By cityRegisterLocator = By.xpath("//input[@data-qa=\"city\"]");
    public final  By zipCodeRegisterLocator = By.xpath("//input[@data-qa=\"zipcode\"]");
    public final  By mobileNumberRegisterLocator = By.xpath("//input[@data-qa=\"mobile_number\"]");
    public final  By createAccountLocator = By.xpath("//button[@data-qa=\"create-account\"]");
    public final By messageCreateLocator=By.xpath("//h2[@class=\"title text-center\"]/b");
    public final  By continueRegisterLocator = By.xpath("//*[@data-qa=\"continue-button\"]");
    public final By loggedInAsLocator=By.xpath("//ul[@class=\"nav navbar-nav\"]//li[10]");
    public final By addressDetailLocator=By.xpath("//div[@class=\"step-one\"][1]//h2");
    public final By reviewOrderLocator=By.xpath("//div[@class=\"step-one\"][2]//h2");
    public final By descriptionLocator=By.xpath("//textarea[@class=\"form-control\"]");
    public final By placeOrderLocator=By.xpath("//a[@href=\"/payment\"]");
    public final By nameCardLocator=By.xpath("//input[@class=\"form-control\"]");
    public final By numberCardLocator=By.xpath("//input[@name=\"card_number\"]");
    public final By CVCLocator=By.xpath("//input[@name=\"cvc\"]");
    public final By expiryMonthLocator=By.xpath("//input[@name=\"expiry_month\"]");
    public final By expiryYearLocator=By.xpath("//input[@name=\"expiry_year\"]");
    public final By sumbitLocator=By.xpath("//button[@id=\"submit\"]");
   public final By successMessageLocator=By.xpath("//div[@id=\"success_message\"]");
   public final By downloadInvoiceLocator=By.xpath("//a[@class=\"btn btn-default check_out\"]");


    @FindBy(xpath = "//select[@data-qa=\"days\"]")
    private WebElement dayselection;
    @FindBy(xpath = "//select[@data-qa=\"months\"]")
    private WebElement monthselection;
    @FindBy(xpath = "//select[@data-qa=\"years\"]")
    private WebElement yearselection;
    @FindBy(xpath = "//select[@data-qa=\"country\"]")
    private WebElement countryselection;
    public void addProduct(){
        int product=driver.findElements(prouctsLocator).size();
        for(int i= 1;i<=6;i++) {
            By viewproduct = By.xpath("//div[@class=\"col-sm-4\"][" + i + "]//li");
            click(viewproduct);
            By addCartLocator = By.xpath("//button[@type=\"button\"]");
            click(addCartLocator);
            By continueLocator = By.xpath("//button[@data-dismiss=\"modal\"]");
            click(continueLocator);
            driver.navigate().back();
        }
    }
    public void clickOnCart(){
        click(cartLocator);
    }
    public void clickOnProceed(){
        click(proceedLocator);
    }
    public void clickOnRegister(){
        click(registerLocator);
    }
    public void fillData(String name, String email){
        sendkeys(nameRegisterLocator,name);
        sendkeys(emailRegisterLocator,email);
    }
    public void chooseRandom(){
        int num = driver.findElements(genderLocator).size();
        int random = fake.number().numberBetween(1,num+1);
        By gender = By.xpath("//div[@class=\"clearfix\"]["+random+"]//input");
        click(gender);
    }
    public void selectRandomOption(){
        selectingRandom(dayselection,dateOfDaysLocator,2);
        selectingRandom(monthselection,dateOfMonthsLocator,2);
        selectingRandom(yearselection,dateOfYearsLocator,2);
        selectingRandom(countryselection,countryRegisterLocator,1);
    }
    public void password(){

        sendkeys(passwordRegisterLocator,"123456");
    }
    public void fillOtherData(){
        sendkeys(firstNameLocator,"youmna");
        sendkeys(lastNameLocator,"khalifa");
        sendkeys(companyRegisterLocator,"semicorner");
        sendkeys(addressRegisterLocator,"sidi essi");
        sendkeys(stateRegisterLocator,"egypt");
        sendkeys(cityRegisterLocator,"menouf");
        sendkeys(zipCodeRegisterLocator,"11111-99999");
        sendkeys(mobileNumberRegisterLocator,"01063490618");
    }
    public void clickOnCheckbox(){
        click(newsLetterLocator);
        click(optionLocator);
    }
    public void clickOnSignUpButton(){

        click(signUpButtonLocator);
    }
    public void clickOnCreateAccount(){

        click(createAccountLocator);
    }
    public String getMessageCreate(){
        String text3= driver.findElement(messageCreateLocator).getText();
        return text3;
    }
    public void clickOncontinue(){

        click(continueRegisterLocator);
    }
    public String getLoggedAs(){
        String text4=driver.findElement(loggedInAsLocator).getText();
        return text4;
    }
    public String addressDetails(){
        String text=driver.findElement(addressDetailLocator).getText();
        return text;
    }
    public String reviewOrder(){
        String order=driver.findElement(reviewOrderLocator).getText();
        return order;
    }
    public void description(){
        sendkeys(descriptionLocator,"please don't late my order");
    }
    public void clickOnPlaceOrder(){
        click(placeOrderLocator);
    }
    public void enterDataCard(){
        sendkeys(nameCardLocator,"youmna khalifa");
        sendkeys(numberCardLocator,"765432");
        sendkeys(CVCLocator,"422");
        sendkeys(expiryMonthLocator,"May");
        sendkeys(expiryYearLocator,"2027");
    }
    public void clickOnSumbit(){
        click(sumbitLocator);
    }
    public String successMessage(){
        String success=driver.findElement(successMessageLocator).getText();
        return success;
    }
    public void clickOnDownloadInvoice(){

        click(downloadInvoiceLocator);
    }

}
