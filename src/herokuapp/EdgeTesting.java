package herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class EdgeTesting {
    public static void main(String[] args) {
        String baseurl = "http://the-internet.herokuapp.com/login"; // storing base url
        System.setProperty("webdriver.edge.driver", "src/Drivers/msedgedriver.exe"); // setting webdriver
        WebDriver driver = new EdgeDriver();// creating object of chrome webdriver
        driver.get(baseurl); // method to invoke Url
        driver.manage().window().maximize(); // Maximising window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); // timeout session
        String title = driver.getTitle();  // store title
        System.out.println("Title of thwe page : " + title);//printing title in console
        String url = driver.getCurrentUrl(); // geting url
        System.out.println("Current url : " +url); // printing url in console

        WebElement Username = driver.findElement(By.name("usrname"));
        Username.sendKeys("tomsmith");
        WebElement Password = driver.findElement(By.className("password"));
        Password.sendKeys("SuperSecretPassword!");
                driver.findElement(By.className("radius"));

       // driver.close();
    }
}
