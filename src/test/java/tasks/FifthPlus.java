package tasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FifthPlus {
    @Test
    public void scrollplus () {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://qa2.eatstreet.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[@ng-if='showPartnerLink']")).click();
        Assert.assertTrue(driver.getCurrentUrl().contains("street"));
        driver.quit();
    }
}
