import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObject.RegistrationPageObject;

public class RegistrationTest {
    WebDriver driver = new ChromeDriver();
    RegistrationPageObject registration = new RegistrationPageObject(driver);

    @Test
    public void registration(){
        registration.clickPersonalArea();
        registration.clickRegistrationArea();
        registration.clickNameButton();
        registration.enterNameButton("Иван");
        registration.clickEmailButton();
        registration.enterEmailButton("gvfyufi@mail.ru");
        registration.clickPasswordButton();
        registration.enterPasswordButton("eidhi7bj");
        registration.clickRegistration();

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
    }
}
