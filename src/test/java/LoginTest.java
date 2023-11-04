import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObject.LoginPageObject;

import java.time.Duration;

public class LoginTest {
    WebDriver driver = new ChromeDriver();
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
    public void loginInRegistrationForm(){ //не переходит из регистрации в войти,а вводит данные в полях регистрации,но работает
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
        login.enterPasswordButton("fuifuijhv");
        login.clickCodeFromEmail(); //не кликабедьный элемент
        login.enterCodeFromEmail("030194e8-4a87-404b-8ce4-4e0cb0f8c3c6"); //вручную заходим в восстпано пароль вводим почту получаем код и вставляем новый код и парооль сюда
        login.clickSaveButton();
        login.clickloginEmailButton();
        login.enterloginEmailButton("luvd85@mail.ru");
        login.clickPasswordButton();
        login.enterPasswordButton("fuifuijhv");
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
