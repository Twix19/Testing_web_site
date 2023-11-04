package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class LoginPageObject {
    WebDriver driver;
    static final int DRIVER_DURATION = 10;
    static final String DRIVER_SITE = "https://stellarburgers.nomoreparties.site/";
    public LoginPageObject(WebDriver driver) {
        this.driver = driver;
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(DRIVER_DURATION)); //испольуем ожидание
        driver.get(DRIVER_SITE);
    }
    private By loginToAccount = By.xpath(".//button[@class='button_button__33qZ0 button_button_type_primary__1O7Bx button_button_size_large__G21Vg']");
    private By emailButton = By.xpath("(.//label[text()='Email'])/../input[@class='text input__textfield text_type_main-default']");
    private By passwordButton = By.xpath("(.//label[text()='Пароль'])/../input[@class='text input__textfield text_type_main-default']");
    private By loginButton = By.xpath(".//button[@class='button_button__33qZ0 button_button_type_primary__1O7Bx button_button_size_medium__3zxIa']");
    private By personalAreaButton = By.xpath(".//a[@class='AppHeader_header__link__3D_hX']/p[text()= 'Личный Кабинет']");
    private By registrationButton = By.xpath(".//button[@class='button_button__33qZ0 button_button_type_primary__1O7Bx button_button_size_medium__3zxIa']");
    private By comeInButton = By.xpath(".//a[@class='Auth_link__1fOlj']");
    private By restorePasswordButton = By.xpath(".//a[text()='Восстановить пароль']");
    private By restoreButton = By.xpath(".//button[@class='button_button__33qZ0 button_button_type_primary__1O7Bx button_button_size_medium__3zxIa']");

    private By codeFromeEmailButton= By.xpath(".//label[text()='Введите код из письма']/../input[@class='text input__textfield text_type_main-default']");
  private By comeInButtonInPersonalArea = By.xpath(".//button[@class='button_button__33qZ0 button_button_type_primary__1O7Bx button_button_size_medium__3zxIa']");
   private By saveButton = By.xpath(".//button[@class='button_button__33qZ0 button_button_type_primary__1O7Bx button_button_size_medium__3zxIa']");
   private By construktorButton = By.xpath(".//p[@class='AppHeader_header__linkText__3q_va ml-2']");
   private By exitButton = By.xpath(".//button[@class='Account_button__14Yp3 text text_type_main-medium text_color_inactive']");

   private By stellarBurgerButton = By.xpath(".//div[@class='AppHeader_header__logo__2D0X2']");
    public void clickloginToAccountButton(){
        driver.findElement(loginToAccount).click();
    }
    public void clickloginEmailButton(){
        driver.findElement(emailButton).click();
    }
    public void enterloginEmailButton(String email){
        driver.findElement(emailButton).click();
        driver.findElement(emailButton).sendKeys(email);
    }
    public void clickPasswordButton(){
        driver.findElement(passwordButton).click();
    }
    public void enterPasswordButton(String password){
        driver.findElement(passwordButton).click();
        driver.findElement(passwordButton).sendKeys(password);
    }
    public void clickLoginButton(){
        driver.findElement(loginButton).click();
    }
    public void clickPersonalAreaButton(){
        driver.findElement(personalAreaButton).click();
    }
    public void clickRegistrationButton(){
        driver.findElement(registrationButton).click();
    }
    public void clickComeInButton(){
        driver.findElement(comeInButton).click();
    }
    public void clickRestorePassword(){
        driver.findElement(restorePasswordButton).click();
    }
    public void clickRestoreButton(){
        driver.findElement(restoreButton).click();
    }
    public void clickCodeFromEmail(){
        driver.findElement(codeFromeEmailButton).click();
    }
    public void enterCodeFromEmail(String code){
        driver.findElement(codeFromeEmailButton).click();
        driver.findElement(codeFromeEmailButton).sendKeys(code);
    }
    public void clickSaveButton(){
        driver.findElement(saveButton).click();
    }
    public void clickComeInButtonInPersonalArea(){
        driver.findElement(comeInButtonInPersonalArea).click();
    }
    public void clickConstructorButton(){
        driver.findElement(construktorButton).click();
    }
    public void clickExit(){
        driver.findElement(exitButton).click();
    }
    public void clickStellarBurgersButton(){
        driver.findElement(stellarBurgerButton).click();
    }
}
