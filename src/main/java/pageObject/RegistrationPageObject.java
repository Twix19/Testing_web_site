package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class RegistrationPageObject {
    WebDriver driver;
    static final int DRIVER_DURATION = 10;
    static final String DRIVER_SITE = "https://stellarburgers.nomoreparties.site/";

    public RegistrationPageObject(WebDriver driver) {
        this.driver = driver;
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(DRIVER_DURATION)); //испольуем ожидание
        driver.get(DRIVER_SITE);
    }

    //Нажимаем на кнопку "Личный кабинет"
    private By personalArea = By.xpath(".//a[@class='AppHeader_header__link__3D_hX']/p[text()= 'Личный Кабинет']");
   //Кнопка регистрации
    private By registrationArea = By.xpath(".//a[@class='Auth_link__1fOlj' and text() = 'Зарегистрироваться']");
  //Кнопка для ввода имени
    private By nameButton = By.xpath("(.//label[text()='Имя'])/../input[@class='text input__textfield text_type_main-default']");
   //Кнопка email
    private By emailButton = By.xpath("(.//label[text()='Email'])/../input[@class='text input__textfield text_type_main-default']");
    //Кнопка для ввода пароля
    private By passwordButton = By.xpath("(.//label[text()='Пароль'])/../input[@class='text input__textfield text_type_main-default']");
   //Кнопка для регистрации
    private By registrationButton = By.xpath(".//button[@class='button_button__33qZ0 button_button_type_primary__1O7Bx button_button_size_medium__3zxIa']");
    //Кнопка для входа в аккаунт
    private By loginToAccount = By.xpath(".//button[@class='button_button__33qZ0 button_button_type_primary__1O7Bx button_button_size_large__G21Vg']");

    public void clickPersonalArea() {
        driver.findElement(personalArea).click();
    }
    public void clickRegistrationArea(){
      driver.findElement(registrationArea).click();
    }
    public void clickNameButton(){
        driver.findElement(nameButton).click();
    }
    public void enterNameButton(String name){
        driver.findElement(nameButton).sendKeys(name);
    }
    public void clickEmailButton(){
        driver.findElement(emailButton).click();
    }
    public void enterEmailButton(String email){
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
    public void clickRegistration(){
        driver.findElement(registrationButton).click();
    }
    public void clickloginToAccountButton(){
        driver.findElement(loginToAccount).click();
    }
}
