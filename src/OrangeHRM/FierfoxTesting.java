package OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FierfoxTesting {
    public static void main(String[] args) {
        String baseurl = "https://opensource-demo.orangehrmlive.com/"; // storing base url
      //  System.setProperty("webdriver.gecko.driver", "src/Drivers/geckodriver.exe"); // setting webdriver
        System.setProperty("webdriver.gecko.driver","src/Drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver(); // creating object of chrome webdriver
        driver.get(baseurl); // method to invoke Url
        driver.manage().window().maximize(); // maximising window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); //timeout session
        String titel = driver.getTitle(); // storing title
        System.out.println("Title of the page : " + titel); // printing title  in console

        WebElement Username = driver.findElement(By.name("username"));
        Username.sendKeys("Admin");
        WebElement Password = driver.findElement(By.name("password"));
        Password.sendKeys("admin123");
        driver.findElement(By.className("oxd-button")).click();
    }
}
