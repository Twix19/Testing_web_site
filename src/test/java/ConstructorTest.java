import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObject.LoginPageObject;
import pageObject.ConstructorPageObject;
import static org.junit.Assert.assertTrue;

public class ConstructorTest {
    WebDriver driver = setUpDriver();
    ConstructorPageObject constructor = new ConstructorPageObject(driver);
    static final String PATH_TO_CHROME = "chromedriver-win64/chromedriver.exe";
    static final String PATH_TO_YANDEX = "yandexdriver/yandexdriver.exe";

    LoginPageObject login = new LoginPageObject(driver);
    public WebDriver setUpDriver(){
        System.setProperty("webdriver.chrome.driver", PATH_TO_CHROME);
        WebDriver driver = new ChromeDriver();
        return driver;
    }
    @Test
    public void goToConstructor(){
       login.clickPersonalAreaButton();
       login.clickloginEmailButton();
       login.enterloginEmailButton("gvfyufi@mail.ru");
       login.clickPasswordButton();
       login.enterPasswordButton("eidhi7bj");
       login.clickLoginButton();
       login.clickConstructorButton();
       login.isConstructorPageSelected();
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
        constructor.checkIsSauceSelected();

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
      //  constructor.checkIsBunsSelected();
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
        constructor.checkIsFillingSelected();
    }
}
