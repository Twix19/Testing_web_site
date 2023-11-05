import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObject.LoginPageObject;
import pageObject.СonstructorPageObject;

public class ConstructorTest {
    static final String PATH_TO_CHROME = "chromedriver-win64/chromedriver.exe";
      static final String PATH_TO_YANDEX = "yandexdriver/yandexdriver.exe";
    public WebDriver setUpDriver(){
        System.setProperty("webdriver.chrome.driver", PATH_TO_CHROME);
        WebDriver driver = new ChromeDriver();
        return driver;
    }
    WebDriver driver = setUpDriver();


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
