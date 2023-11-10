import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObject.ConstructorPageObject;
import pageObject.RegistrationPageObject;

public class RegistrationTest {
    WebDriver driver = setUpDriver();
    RegistrationPageObject registration = new RegistrationPageObject(driver);
    ConstructorPageObject constructorPageObject = new ConstructorPageObject(driver);
    static final String PATH_TO_CHROME = "chromedriver-win64/chromedriver.exe";
    static final String PATH_TO_YANDEX = "yandexdriver/yandexdriver.exe";

    public WebDriver setUpDriver(){
        System.setProperty("webdriver.chrome.driver", PATH_TO_CHROME);
        WebDriver driver = new ChromeDriver();
        return driver;
    }


    @Test
    public void registration(){
        registration.clickPersonalArea();
        registration.clickRegistrationArea();
        registration.clickNameButton();
        registration.enterNameButton("Иван");
        registration.clickEmailButton();
        registration.enterEmailButton("scjsacksajjjb@mail.ru");
        registration.clickPasswordButton();
        registration.enterPasswordButton("eidhi7bj");
        registration.clickRegistration();
        registration.checkIsSuccessfullRegistration();
    }
    @Test
    public void wrongPassword(){
        registration.clickPersonalArea();
        registration.clickRegistrationArea();
        registration.clickNameButton();
        registration.enterNameButton("Иван");
        registration.clickEmailButton();
        registration.enterEmailButton("gvfyufi@mail.ru");
        registration.clickPasswordButton();
        registration.enterPasswordButton("ei");
        registration.clickRegistration();
        registration.checkIsNotSuccessfullRegistration();
    }
    @Test
    public void registrationWithOtherButton(){
        registration.clickloginToAccountButton();
        registration.clickRegistrationArea();
        registration.clickNameButton();
        registration.enterNameButton("Иван");
        registration.clickEmailButton();
        registration.enterEmailButton("gvfyufi@mail.ru");
        registration.clickPasswordButton();
        registration.enterPasswordButton("ei2h2oih8");
        registration.clickRegistration();
        registration.checkIsSuccessfullRegistration();
    }
    @After
    public void deleteUser(){
        registration.clickloginToAccountButton();
        registration.clickEmailButton();
        registration.enterEmailButton("scjsacksajjjb@mail.ru");
        registration.clickPasswordButton();
        registration.enterPasswordButton("eidhi7bj");
        registration.clickloginButton();
        constructorPageObject.checkIfSauceButtonIfDisplayed();
        registration.putToken();
        registration.deleteAccount();

    }

}
