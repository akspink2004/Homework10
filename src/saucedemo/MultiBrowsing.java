package saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowsing {
    static String browser ="Chrome";
    static String basedURL = "https://www.saucedemo.com/";
    static WebDriver driver;

    public static void main(String[] args) {
        if(browser.equalsIgnoreCase("Chrome")){
            System.setProperty("webdriver.Chrome.driver","src/Drivers/chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Fierfox")) {
            System.setProperty("Webdriver.Firefox.driver","src/Drivers/geckodriver.exe");
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            System.setProperty("webdriver.Edge.driver", "src/Drivers/msedgedriver.exe");
            driver = new EdgeDriver();
        }else {
            System.out.println("Not valid browser");
        }
        driver.get(basedURL);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        String title = driver.getTitle();
        System.out.println("Title of the page :"+title);
        WebElement Username = driver.findElement(By.name("user-name"));
        Username.sendKeys("standard_user");
        WebElement Password = driver.findElement(By.name("password"));
        Password.sendKeys("secret_sauce");
        driver.findElement(By.className("login-button")).click();
        driver.close();
    }
}
