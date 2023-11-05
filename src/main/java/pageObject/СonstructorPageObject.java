package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class СonstructorPageObject {
    WebDriver driver;
    static final int DRIVER_DURATION = 10;
    static final String DRIVER_SITE = "https://stellarburgers.nomoreparties.site/";

    public СonstructorPageObject(WebDriver driver) {
        this.driver = driver;
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(DRIVER_DURATION)); //испольуем ожидание
        driver.get(DRIVER_SITE);
    }
   //Кнопка для перехода в раздел "Булки"
   private By bunsButton = By.xpath(".//div[@class='tab_tab__1SPyG  pt-4 pr-10 pb-4 pl-10 noselect']//span[text()='Булки']");
    //Кнопка для перехода в раздел "Соусы"
    private By sauceButton = By.xpath(".//div[@class='tab_tab__1SPyG  pt-4 pr-10 pb-4 pl-10 noselect']//span[text()='Соусы']");
    //Кнопка для перехода в раздел "Начинки"
    private By fillingsButton = By.xpath(".//div[@class='tab_tab__1SPyG  pt-4 pr-10 pb-4 pl-10 noselect']//span[text()='Начинки']");
    public void clickBunsButton(){
        driver.findElement(bunsButton).click();
    }
    public void clickSauceButton(){
        driver.findElement(sauceButton).click();
    }
    public void clickFillingsButton(){
        driver.findElement(fillingsButton).click();
    }
}
