package OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeTesting {
    public static void main(String[] args) {
        String baseurl = "https://opensource-demo.orangehrmlive.com/"; // storing base url
        System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe"); // setting webdriver
        WebDriver driver = new ChromeDriver(); // creating object of chrome webdriver
        driver.get(baseurl); // method to invoke Url
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); // timeout session
        String title = driver.getTitle();  // store title
        System.out.println("Title of thwe page : " + title);//printing title in console
        String url = driver.getCurrentUrl(); // geting url
        System.out.println("Current url : " +url); // printing url in console
        String source = driver.getPageSource();
        System.out.print("page source :" + source);
        WebElement Username = driver.findElement(By.name("username"));
        Username.sendKeys("Admin");
        WebElement Password = driver.findElement(By.name("password"));
        Password.sendKeys("admin123");
        driver.findElement(By.className("oxd-button")).click();
       // driver.close();
    }
}
