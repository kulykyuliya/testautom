import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class IntertopTest {
  public WebDriver driver;

//    public void fullscreen(){
//        driver.manage().window().maximize();
//    }

    public void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void intertopTest() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://intertop.ua/ua/");
        driver.manage().window().maximize();
        driver.findElements(By.xpath("//span[@class='menu-item__name']")).get(6).click();
        sleep(3);
        driver.findElement(By.xpath("//div[@class='Button']")).click();
        driver.findElement(By.xpath("//span[contains(text(), 'Garnier')]")).click();
        driver.findElement(By.xpath("//span[contains(text(), 'Захист і гігієна')]")).click();
        Assert.assertTrue(driver.getCurrentUrl().contains("garnier"));
        driver.quit();
    }

    @Test
    public void reservedTest() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.reserved.com/ua/uk/");
        driver.manage().window().maximize();
        sleep(1);
        driver.findElement(By.xpath("//button[@id='cookiebotDialogOkButton']")).click();
        driver.findElement(By.xpath("//input[@placeholder='Шукати']")).click();
        driver.findElement(By.xpath("//input[@placeholder='Шукати']")).sendKeys("dress");
        sleep(3);
        driver.findElement(By.xpath("//div[@data-selen='product-discount-price']")).click();
        Assert.assertTrue(driver.getCurrentUrl().contains("dress"));
        driver.quit();
    }


    @Test
    public void Testpeninsula () {
        WebDriverManager.chromedriver(). setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://peninsula.ua/");
        driver.manage().window().maximize();
        sleep(3);
        driver. findElements(By.xpath("//li//a[contains(text(), 'Браслеты ')]")).get(4).click();
        Assert.assertTrue(driver.getCurrentUrl().contains("braslety"));
        driver.quit();
    }

     @Test
    public void Testmakeup () {
         WebDriverManager.chromedriver(). setup();
         WebDriver driver = new ChromeDriver();
         driver. get ("https://makeup.com.ua/ua/");
         driver.manage().window().maximize();
         driver.findElements(By.xpath("//a[@class='menu-list__link']")).get(9).click();
         driver.findElement(By.xpath("//a[contains(text(), 'Чоловікам')]")).click();
         driver.findElements(By.xpath("//a[@class='menu-list__link']")).get(3).click();
         Assert.assertTrue(driver.getCurrentUrl().contains("categorys/"));
         driver.quit();

     }
    @Test
    public void Testliga () {
        WebDriverManager.chromedriver(). setup();
        WebDriver driver = new ChromeDriver();
        driver. get ("https://www.liga.net/ua");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[@class='login-btn login-noborder text-center']")).click();
        sleep(2);
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("gjuj");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("hfufu");
        Assert.assertTrue(driver.getCurrentUrl().contains("liga.net/"));
        driver.quit();
    }
    @Test
    public void Testliga2 () {
        WebDriverManager.chromedriver(). setup();
        WebDriver driver = new ChromeDriver();
        driver. get ("https://www.ukr.net/ua/");
        driver.manage().window().maximize();
        WebElement iframe = driver.findElement(By.xpath("//iframe[@id='sinoptik_container']"));
        driver.switchTo().frame(iframe);
        driver.findElement(By.xpath("//a[contains(text(), '10 днів')]")).click();
        ArrayList<String> tabs2 = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        sleep(2);
        driver.findElement(By.xpath("//input[@id='search_city']")).sendKeys("Львів");
        driver.findElement(By.xpath("//input[@class='search_city-submit']")).click();
        Assert.assertFalse(driver.getCurrentUrl().contains("погода-львів"));
        driver.quit();
    }
   @Test
    public void Testukrnet() {
    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.ukr.net/");
    driver.manage().window().maximize();
    WebElement iframe = driver.findElement(By.xpath("//iframe[@name='mail widget']"));
    driver.switchTo().frame(iframe);
    driver.findElement(By.xpath("//input[@id='id-input-login']")).sendKeys("login");
    driver.findElement(By.xpath("//input[@id='id-input-password']")).sendKeys("password");
    Assert.assertTrue(driver.getCurrentUrl().contains("ukr.net"));
    driver.quit();

    }
    @Test
    public void Testukrnet2() {
        WebDriverManager. chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ukr.net/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[@href='http://www.booking.com/index.html?aid=375206']")).click();
        ArrayList<String> tabs2 = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        sleep(2);
        driver.findElements(By.xpath("//span[@class='sb-date-field__icon sb-date-field__icon-btn bk-svg-wrapper calendar-restructure-sb']")).get(0).click();
        driver.findElements(By.xpath("//span[contains(text(), '29')]")).get(0).click();
        sleep(2);
        driver.findElements(By.xpath("//span[contains(text(), '27')]")).get(1).click();
        driver.findElement(By.xpath("//input[@placeholder='Where are you going?']")).sendKeys("Georgia");
        sleep(2);
        driver.findElement(By.xpath("//span[contains(text(), 'Georgia Aquarium')]")).click();
        driver.findElement(By.xpath("//span[@class='b-button__text']")).click();
        Assert.assertTrue(driver.getCurrentUrl().contains("Georgia+Aquarium%2C"));
        driver.quit();
    }

}





