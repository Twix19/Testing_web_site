import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObject.LoginPageObject;

public class LoginTest {
    static final String PATH_TO_CHROME = "chromedriver-win64/chromedriver.exe";
    static final String PATH_TO_YANDEX = "yandexdriver/yandexdriver.exe";
    public WebDriver setUpDriver(){
        System.setProperty("webdriver.chrome.driver", PATH_TO_CHROME);
        WebDriver driver = new ChromeDriver();
        return driver;
    }
    WebDriver driver = setUpDriver();
    LoginPageObject login = new LoginPageObject(driver);
    @Test
    public void loginWithLogInAccountButton(){
        login.clickloginToAccountButton();
        login.clickloginEmailButton();
        login.enterloginEmailButton("gvfyufi@mail.ru");
        login.clickPasswordButton();
        login.enterPasswordButton("eidhi7bj");
        login.clickLoginButton();
    }
    @Test
    public void loginWithPersonalAreaButton(){
        login.clickPersonalAreaButton();
        login.clickloginEmailButton();
        login.enterloginEmailButton("gvfyufi@mail.ru");
        login.clickPasswordButton();
        login.enterPasswordButton("eidhi7bj");
        login.clickLoginButton();
    }
    @Test
    public void loginInRegistrationForm(){
        login.clickPersonalAreaButton();
        login.clickRegistrationButton();
        login.clickComeInButton();
        login.clickloginEmailButton();
        login.enterloginEmailButton("gvfyufi@mail.ru");
        login.clickPasswordButton();
        login.enterPasswordButton("eidhi7bj");
        login.clickLoginButton();
    }
    @Test
    public void loginInRestorePasswordButton(){
        login.clickPersonalAreaButton();
        login.clickRestorePassword();
        login.clickloginEmailButton();
        login.enterloginEmailButton("luvd85@mail.ru");
        login.clickRestoreButton();
        login.clickPasswordButton();
        login.enterPasswordButton("vdh978h");
        login.clickCodeFromEmail(); //не кликабедьный элемент
        login.enterCodeFromEmail("8134ff00-b604-4df7-af3d-db388d769446"); //вручную заходим в восстпано пароль вводим почту получаем код и вставляем новый код и парооль сюда
        login.clickSaveButton();
        login.clickloginEmailButton();
        login.enterloginEmailButton("luvd85@mail.ru");
        login.clickPasswordButton();
        login.enterPasswordButton("vdh978h");
        login.clickComeInButtonInPersonalArea();
    }
    @Test
    public void goToPersonalAccount(){
        login.clickPersonalAreaButton();
    }
    @Test
    public void goToConstructor(){
        login.clickPersonalAreaButton();
        login.clickConstructorButton();
    }
    @Test
    public void goToStellarBurger(){
        login.clickPersonalAreaButton();
        login.clickStellarBurgersButton();
    }
    @Test
    public void exit(){
        login.clickPersonalAreaButton();
        login.clickloginEmailButton();
        login.enterloginEmailButton("gvfyufi@mail.ru");
        login.clickPasswordButton();
        login.enterPasswordButton("eidhi7bj");
        login.clickComeInButtonInPersonalArea();
        login.clickPersonalAreaButton();
        login.clickExit();
    }


}
