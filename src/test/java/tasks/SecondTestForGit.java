package tasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SecondTestForGit {
    @Test
    public void TestSecondBranch() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://qa2.eatstreet.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[@id='menu-signin']")).click();
        driver.findElement(By.xpath("//div[@id='uniqueid']")).click();
        Assert.assertTrue(driver.getCurrentUrl().contains("signin"));
        driver.quit();
    }
}

