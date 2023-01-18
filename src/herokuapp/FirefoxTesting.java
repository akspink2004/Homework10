package herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FirefoxTesting {
    public static void main(String[] args) {
        String baseurl = "http://the-internet.herokuapp.com/login"; // storing base url
        System.setProperty("webdriver.gecko.driver","src/Drivers/geckodriver.exe");  //Seting Webbrowser
        WebDriver driver = new FirefoxDriver(); // creating object of chrome webdriver
        driver.get(baseurl); // method to invoke Url
        driver.manage().window().maximize(); // maximising window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); //timeout session
        String titel = driver.getTitle(); // storing title
        System.out.println("Title of the page : " + titel); // printing title  in console

        WebElement Username = driver.findElement(By.name("username"));
        Username.sendKeys("tomsmith");
        WebElement Password = driver.findElement(By.name("password"));
        Password.sendKeys("SuperSecretPassword!");
        driver.findElement(By.className("radius")).click();
//        driver.close();
    }
}
