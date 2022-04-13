package Homework_4;

import com.sun.deploy.security.SelectableSecurityManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.List;

public class ExampleMain_2 {
    static WebDriver driver;
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://www.cian.ru/");

        WebElement webElement1 = driver.findElement(By.xpath(".//a[@href='/snyat/']"));
        webElement1.click();
        WebElement webElement2 = driver.findElement(By.xpath("//div[@data-mark='FilterOfferType']"));
        webElement2.click();
        WebElement webElement3 = driver.findElement(By.xpath("//button[@class='frontend-mainpage-components-value-65seKkgL6gc frontend-mainpage-components-value-active-Aan6tutzFI _025a50318d--radio-button--active--kyfeg _025a50318d--radio-button--G9wFz']"));
        webElement3.click();
        WebElement webElement4 = driver.findElement(By.xpath(".//span[@class='_025a50318d--box--Sr_sA']"));
        webElement4.click();
        WebElement webElement5 = driver.findElement(By.xpath(".//div[@data-mark='FilterRoomsCount']"));
        webElement5.click();
        WebElement webElement6 = driver.findElement(By.xpath("//button[@class='_025a50318d--button--i1_mM _025a50318d--button--active--R3YUJ']"));
        webElement6.click();
        driver.findElement(By.xpath("//div[@data-mark='FilterPrice']")).click();
        driver.findElement(By.xpath("//input[@placeholder='от']")).sendKeys("45000");

        driver.findElement(By.xpath("//input[@placeholder='до']")).sendKeys("55000");
        driver.findElement(By.xpath("//input[@placeholder='Город, адрес, метро, район, ж/д, шоссе или ЖК']")).sendKeys("метро Говорово");
        driver.findElement(By.xpath("//span[@title='Говорово, Москва']")).click();
        driver.findElement(By.xpath("//a[@data-mark='FiltersSearchButton']")).click();

        //как-то прроверить сработал ли фильтр.. как?
        // driver.quit();


    }
}

