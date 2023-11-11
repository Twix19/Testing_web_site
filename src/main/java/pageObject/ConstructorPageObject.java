package pageObject;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ConstructorPageObject {
    WebDriver driver;
    static final int DRIVER_DURATION = 10;
    static final String DRIVER_SITE = "https://stellarburgers.nomoreparties.site/";

    public ConstructorPageObject(WebDriver driver) {
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

    @Step("Проверка на корректную работу поля Булки")
    public void clickBunsButton(){
        driver.findElement(bunsButton).click();
    }
    @Step("Проверка на корректную работу поля Соусы")
    public void clickSauceButton(){
        driver.findElement(sauceButton).click();
    }
    @Step("Проверка на корректную работу поля Начинки")
    public void clickFillingsButton(){
        driver.findElement(fillingsButton).click();
    }
    @Step("Проверка на корректную работу теста перехода на поле Соусы")
    public void checkIsSauceSelected(){
        driver.findElement(sauceButton).isSelected();
    }
    @Step("Проверка на корректную работу теста перехода на поле Булки")
    public void checkIsBunsSelected(){
        driver.findElement(bunsButton).isSelected();
    }
    @Step("Проверка на корректную работу теста перехода на поле Начинки")
    public void checkIsFillingSelected(){
        driver.findElement(fillingsButton).isSelected();
    }
    public void checkIfSauceButtonIfDisplayed(){
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(4));
        wait.until(ExpectedConditions.visibilityOfElementLocated(sauceButton));
    }
}
