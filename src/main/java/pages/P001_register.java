package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class P001_register extends base {
    public P001_register(WebDriver driver){

        super(driver);
    }
    Faker fake = new Faker();
    public final By signUpLocator = By.xpath("//a[@href=\"/login\"]");
    public final By userLetterLocator =By.xpath("//div[@class=\"signup-form\"]/h2");
    public final  By nameRegisterLocator = By.xpath("//input[@data-qa=\"signup-name\"]");
    public final  By emailRegisterLocator = By.xpath("//input[@data-qa=\"signup-email\"]");
    public final  By signUpButtonLocator = By.xpath("//button[@data-qa=\"signup-button\"]");
    public final By accountInformationLocator=By.xpath("//div[@class=\"login-form\"]/h2[@class=\"title text-center\"]/b");
    public final  By genderLocator = By.xpath("//div[@class=\"clearfix\"]");
    public final  By passwordRegisterLocator = By.xpath("//input[@data-qa=\"password\"]");
    public final  By dateOfDaysLocator = By.xpath("//select[@data-qa=\"days\"]//option");
    public final  By dateOfMonthsLocator = By.xpath("//select[@data-qa=\"months\"]//option");
    public final  By dateOfYearsLocator = By.xpath("//select[@data-qa=\"years\"]//option");
    public final  By newsLetterLocator = By.xpath("//input[@id=\"newsletter\"]");
    public final  By optionLocator = By.xpath("//input[@id=\"optin\"]");
    public final By addressInformationLocator=By.xpath("//form[@action=\"/signup\"]/h2");
    public final  By firstNameLocator = By.xpath("//input[@data-qa=\"first_name\"]");
    public final  By lastNameLocator = By.xpath("//input[@data-qa=\"last_name\"]");
    public final  By companyRegisterLocator = By.xpath("//input[@data-qa=\"company\"]");
    public final  By addressRegisterLocator = By.xpath("//input[@data-qa=\"address\"]");
    public final  By address2RegisterLocator = By.xpath("//input[@data-qa=\"address\"]");
    public final  By countryRegisterLocator = By.xpath("//input[@data-qa=\"country\"]//option");
    public final  By stateRegisterLocator = By.xpath("//input[@data-qa=\"state\"]");
    public final  By cityRegisterLocator = By.xpath("//input[@data-qa=\"city\"]");
    public final  By zipCodeRegisterLocator = By.xpath("//input[@data-qa=\"zipcode\"]");
    public final  By mobileNumberRegisterLocator = By.xpath("//input[@data-qa=\"mobile_number\"]");
    public final  By createAccountLocator = By.xpath("//button[@data-qa=\"create-account\"]");
    public final By messageCreateLocator=By.xpath("//h2[@class=\"title text-center\"]/b");
    public final  By continueRegisterLocator = By.xpath("//*[@data-qa=\"continue-button\"]");
    public final By loggedInAsLocator=By.xpath("//ul[@class=\"nav navbar-nav\"]//li[10]");
    public final By deleteAccountLocator=By.xpath("//a[@href=\"/delete_account\"]");
    public final By messageDeleteAccountLocator=By.xpath("//h2[@class=\"title text-center\"]");
    public final By continueDeleteLocator=By.xpath("//a[@data-qa=\"continue-button\"]");
    @FindBy(xpath = "//select[@data-qa=\"days\"]")
    private WebElement dayselection;
    @FindBy(xpath = "//select[@data-qa=\"months\"]")
    private WebElement monthselection;
    @FindBy(xpath = "//select[@data-qa=\"years\"]")
    private WebElement yearselection;
    @FindBy(xpath = "//select[@data-qa=\"country\"]")
    private WebElement countryselection;
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
  public String getAccountInformation(){
      String text1 =driver.findElement(accountInformationLocator).getText();
      return text1;
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
    public String getAddressInformation(){
        String text2=driver.findElement(addressInformationLocator).getText();
        return text2;
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
   public void clickOnDeleteAccount(){
        click(deleteAccountLocator);
   }
   public String getMessageDelete(){
        String delete = driver.findElement(messageDeleteAccountLocator).getText();
        return delete;
   }
   public void clickOnContinueDelete(){
        click(continueDeleteLocator);
   }
}
