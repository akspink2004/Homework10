package saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FirefoxTesting {
    public static void main(String[] args) {
        String baseurl = "https://www.saucedemo.com/";
        System.setProperty("webdriver.gecko.driver","src/Drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get(baseurl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        String titel = driver.getTitle();
        System.out.println("Title of the page : " + titel);
        String url =driver.getCurrentUrl();
        System.out.println("Current URL : " +url);
        String source = driver.getPageSource();
        System.out.println("Page source : " +source);
        WebElement usernamefild = driver.findElement(By.name("user-name"));
        usernamefild.sendKeys("standard_user");
        WebElement passwordfild = driver.findElement(By.name("password"));
        passwordfild.sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        // driver.close();
    }
}
