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

}
