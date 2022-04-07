package tasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class task_first_EatStreet {
    @Test
    public void addCard() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://eatstreet.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[@id='menu-signin']")).click();
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("yuliya");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("12345");
        driver.findElement(By.xpath("//div[contains(text(), 'Sign In')]")).click();
        Assert.assertTrue(driver.getCurrentUrl().contains("eats"));
        driver.quit();
    }
//    @Test
//    public void intertopTest() {
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://intertop.ua/ua/");
//        driver.manage().window().maximize();
//        driver.findElements(By.xpath("//span[@class='menu-item__name']")).get(6).click();
//        sleep(3);
//        driver.findElement(By.xpath("//div[@class='Button']")).click();
//        driver.findElement(By.xpath("//span[contains(text(), 'Garnier')]")).click();
//        driver.findElement(By.xpath("//span[contains(text(), 'Захист і гігієна')]")).click();
//        Assert.assertTrue(driver.getCurrentUrl().contains("garnier"));
//        driver.quit();
}

