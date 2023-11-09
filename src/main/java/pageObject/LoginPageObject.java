package pageObject;

import io.qameta.allure.Step;
import org.junit.Before;
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
    //Кнопка войти в аккаунт
    private By loginToAccount = By.xpath(".//button[@class='button_button__33qZ0 button_button_type_primary__1O7Bx button_button_size_large__G21Vg']");
   //Кнопка email
    private By emailButton = By.xpath("(.//label[text()='Email'])/../input[@class='text input__textfield text_type_main-default']");
   //Кнопка пароль
    private By passwordButton = By.xpath("(.//label[text()='Пароль'])/../input[@class='text input__textfield text_type_main-default']");
    private By loginButton = By.xpath(".//button[@class='button_button__33qZ0 button_button_type_primary__1O7Bx button_button_size_medium__3zxIa']");
    //Кнопка Личный кабинет
    private By personalAreaButton = By.xpath(".//a[@class='AppHeader_header__link__3D_hX']/p[text()= 'Личный Кабинет']");
    //Кнопка регистрации
    private By registrationButton = By.xpath(".//button[@class='button_button__33qZ0 button_button_type_primary__1O7Bx button_button_size_medium__3zxIa']");
    //Кнопка входа
    private By comeInButton = By.xpath(".//a[@class='Auth_link__1fOlj']");
    //Кнопка Восстановления пароля
    private By restorePasswordButton = By.xpath(".//a[text()='Восстановить пароль']");
    //Кнопка Восстановить
    private By restoreButton = By.xpath(".//button[@class='button_button__33qZ0 button_button_type_primary__1O7Bx button_button_size_medium__3zxIa']");
    //Кнопка для поучения кода для восстановления пароля
    private By codeFromeEmailButton= By.xpath(".//label[text()='Введите код из письма']/../input[@class='text input__textfield text_type_main-default']");
   //Кнопка входа в личном кабинете
    private By comeInButtonInPersonalArea = By.xpath(".//button[@class='button_button__33qZ0 button_button_type_primary__1O7Bx button_button_size_medium__3zxIa']");
    //Кнопка сохранить
    private By saveButton = By.xpath(".//button[@class='button_button__33qZ0 button_button_type_primary__1O7Bx button_button_size_medium__3zxIa']");
    //Кнопка Конструктор
    private By construktorButton = By.xpath(".//p[contains(@class,'AppHeader_header__linkText__3q_va ml-2') and text()='Конструктор']");
   //Кнопка Выхода
    private By exitButton = By.xpath(".//button[@class='Account_button__14Yp3 text text_type_main-medium text_color_inactive']");
    //Кнопка логотипа
    private By stellarBurgerButton = By.xpath(".//div[@class='AppHeader_header__logo__2D0X2']");

    @Step("Вход в аккаунт через личный кабинет")
    public void clickloginToAccountButton(){
        driver.findElement(loginToAccount).click();
    }
    @Step("Нажатие на поле Email")
    public void clickloginEmailButton(){
        driver.findElement(emailButton).click();
    }
    @Step("Нажатие на поле Email и ввод данных")
    public void enterloginEmailButton(String email){
        driver.findElement(emailButton).click();
        driver.findElement(emailButton).sendKeys(email);
    }
    @Step("Нажатие на поле пароль")
    public void clickPasswordButton(){
        driver.findElement(passwordButton).click();
    }
    @Step("Нажатие на поле пароль и ввод данных")
    public void enterPasswordButton(String password){
        driver.findElement(passwordButton).click();
        driver.findElement(passwordButton).sendKeys(password);
    }
    @Step("Вход в аккаунт")
    public void clickLoginButton(){
        driver.findElement(loginButton).click();
    }

    @Step("Вход в личный кабинет")
    public void clickPersonalAreaButton(){
        driver.findElement(personalAreaButton).click();
    }
    @Step("Регистрация пользователя")
    public void clickRegistrationButton(){
        driver.findElement(registrationButton).click();
    }
    @Step("Вход")
    public void clickComeInButton(){
        driver.findElement(comeInButton).click();
    }
    @Step("Восстановления пароля")
    public void clickRestorePassword(){
        driver.findElement(restorePasswordButton).click();
    }
    @Step("Восстановления пароля")
    public void clickRestoreButton(){
        driver.findElement(restoreButton).click();
    }
    @Step("Получение кода на email")
    public void clickCodeFromEmail(){
        driver.findElement(codeFromeEmailButton).click();
    }
    @Step("Ввод полученного кода ")
    public void enterCodeFromEmail(String code){
        driver.findElement(codeFromeEmailButton).click();
        driver.findElement(codeFromeEmailButton).sendKeys(code);
    }
    @Step("Сохранение пароля")
    public void clickSaveButton(){
        driver.findElement(saveButton).click();
    }
    @Step("Вход в акаунт через личный кабинет")
    public void clickComeInButtonInPersonalArea(){
        driver.findElement(comeInButtonInPersonalArea).click();
    }
    @Step("Нажатие на кнопку конструкор для заказов")
    public void clickConstructorButton(){
        driver.findElement(construktorButton).click();
    }

    @Step("Выход из аккаунта")
    public void clickExit(){
        driver.findElement(exitButton).click();
    }
    @Step("Переход на главную страницу")
    public void clickStellarBurgersButton(){
        driver.findElement(stellarBurgerButton).click();
    }
    @Step("Проверка корректной работы конструктора")
    public void isConstructorPageSelected(){
        driver.findElement(construktorButton).isDisplayed();
    }
    @Step("Проверка корректной работы входа в аккаунт")
    public void loginToAccountIsEvabled(){
        driver.findElement(loginButton).isEnabled();
    }
    @Step("Проверка корректной работы входа в аккаунт через личный кабинет")
    public void loginToAreaButtonIsEvabled(){
        driver.findElement(loginButton).isEnabled();
    }
    @Step("Проверка корректной регистрации")
    public void loginInRegistrationFormIsEvabled(){
        driver.findElement(loginButton).isEnabled();
    }
    @Step("Проверка корректного восстановления пароя")
    public void loginInRestorePasswordButtonIsEvabled(){
        driver.findElement(comeInButtonInPersonalArea).isEnabled();
    }
    @Step("ПРоверка корректной работы личного кабинета")
    public void checkPersonalAreaIsEvabled(){
        driver.findElement(personalAreaButton).isEnabled();
    }
    @Step("Проверка работы конструктора")
    public void constructorIsEnabled(){
        driver.findElement(construktorButton).isEnabled();
    }
    @Step("Проверка корректной работы перехода на главную страницу")
    public void stellarBurgerIsEnabled(){
        driver.findElement(stellarBurgerButton).isEnabled();
    }
    @Step("Проверка корректного выхода")
    public void checkExit(){
        driver.findElement(exitButton).isEnabled();
    }

}


