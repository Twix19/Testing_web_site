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
}
