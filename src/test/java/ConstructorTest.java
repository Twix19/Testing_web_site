import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import pageObject.LoginPageObject;
import pageObject.СonstructorPageObject;

public class ConstructorTest {
    WebDriver driver = new ChromeDriver();
    //  WebDriver yandexDriver = new YandexDriver();
    СonstructorPageObject constructor = new СonstructorPageObject(driver);
    LoginPageObject login = new LoginPageObject(driver);
    @Test
    public void goToConstructor(){
       login.clickPersonalAreaButton();
       login.clickloginEmailButton();
       login.enterloginEmailButton("gvfyufi@mail.ru");
       login.clickPasswordButton();
       login.enterPasswordButton("eidhi7bj");
       login.clickLoginButton();
       login.clickConstructorButton();
    }
    @Test
    public void goToSauce(){
        login.clickPersonalAreaButton();
        login.clickloginEmailButton();
        login.enterloginEmailButton("gvfyufi@mail.ru");
        login.clickPasswordButton();
        login.enterPasswordButton("eidhi7bj");
        login.clickLoginButton();
        constructor.clickSauceButton();
       // constructor.clickBunsButton();
    }
    @Test
    public void goToBuns(){
        login.clickPersonalAreaButton();
        login.clickloginEmailButton();
        login.enterloginEmailButton("gvfyufi@mail.ru");
        login.clickPasswordButton();
        login.enterPasswordButton("eidhi7bj");
        login.clickLoginButton();
        constructor.clickSauceButton();
         constructor.clickBunsButton();
    }
    @Test
    public void goToFillings(){
        login.clickPersonalAreaButton();
        login.clickloginEmailButton();
        login.enterloginEmailButton("gvfyufi@mail.ru");
        login.clickPasswordButton();
        login.enterPasswordButton("eidhi7bj");
        login.clickLoginButton();
        constructor.clickFillingsButton();
    }
}
