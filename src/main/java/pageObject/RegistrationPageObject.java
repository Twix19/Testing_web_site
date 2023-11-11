package pageObject;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.html5.WebStorage;
import org.openqa.selenium.html5.LocalStorage;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
import static org.apache.http.HttpStatus.SC_ACCEPTED;

import java.time.Duration;

public class RegistrationPageObject {
    WebDriver driver;
    public String accessToken;
    static final int DRIVER_DURATION = 10;
    static final String DRIVER_SITE = "https://stellarburgers.nomoreparties.site/";
    static final String USER_API = "https://stellarburgers.nomoreparties.site/api/auth/user";

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

    private By loginButton = By.xpath(".//button[@class='button_button__33qZ0 button_button_type_primary__1O7Bx button_button_size_medium__3zxIa']");
    @Step("Нажатие на кнопку Личный кабинет")
    public void clickPersonalArea() {
        driver.findElement(personalArea).click();
    }
    @Step("Нажатие на кнопку регистрации")
    public void clickRegistrationArea(){
      driver.findElement(registrationArea).click();
    }
    @Step("Нажатие на кнопку Имя")
    public void clickNameButton(){
        driver.findElement(nameButton).click();
    }
    @Step("Нажатие на кнопку Имя и ввод своих данных")
    public void enterNameButton(String name){
        driver.findElement(nameButton).sendKeys(name);
    }
    @Step("Нажатие на кнопку Email")
    public void clickEmailButton(){
        driver.findElement(emailButton).click();
    }
    @Step("Нажатие на кнопку Email и ввод своих данных")
    public void enterEmailButton(String email){
        driver.findElement(emailButton).click();
        driver.findElement(emailButton).sendKeys(email);
    }
    @Step("Нажатие на кнопку пароль")
    public void clickPasswordButton(){
        driver.findElement(passwordButton).click();
    }
    @Step("Нажатие на кнопку пароль и ввод своих данных")
    public void enterPasswordButton(String password){
        driver.findElement(passwordButton).click();
        driver.findElement(passwordButton).sendKeys(password);
    }
    @Step("Нажатие на кнопку регистрации")
    public void clickRegistration(){
        driver.findElement(registrationButton).click();
    }
    @Step("Вход в аккаунт")
    public void clickloginToAccountButton(){
        driver.findElement(loginToAccount).click();
    }
    @Step("Проверка успешной регистрации")
    public void checkIsSuccessfullRegistration(){
        driver.findElement(registrationButton).isSelected();
    }
    @Step("Проверка неудачной регистрации с неверным паролем")
    public void checkIsNotSuccessfullRegistration(){
        driver.findElement(registrationButton).isEnabled();
    }
    @Step("Вход в аккаунт")
    public void clickloginButton(){
        driver.findElement(loginButton).click();
    }
    @Step("Получение токена")
    public void putToken(){
        LocalStorage localStorage = ((WebStorage) driver).getLocalStorage();
        String tempAccessToken = localStorage.getItem("accessToken");
        accessToken = tempAccessToken;
    }
    @Step("Удаление пользователя")
    public void deleteAccount(){
        Response response =
                given()
                        .header("Authorization", accessToken)
                        .when()
                        .delete(USER_API)
                        .then()
                        .statusCode(SC_ACCEPTED)
                        .extract()
                        .path("true");

    }
}

