package utimateqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class EdgeTesting {
    public static void main(String[] args) {
        String baseurl = "https://courses.ultimateqa.com/users/sign_in";
        System.setProperty("webdriver.Edge.driver","src/Drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get(baseurl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        String titel = driver.getTitle();
        System.out.println("Title of the page : " + titel);
        String url =driver.getCurrentUrl();
        System.out.println("Current URL : " +url);
        String source = driver.getPageSource();
        System.out.println("Page source : " +source);
        WebElement usernamefild = driver.findElement(By.name("user[email]"));
        usernamefild.sendKeys("akspink2004@googlemail.com");
        WebElement passwordfild = driver.findElement(By.name("user[password]"));
        passwordfild.sendKeys("123456789");
        driver.findElement(By.className("button")).click();
        driver.close();
    }
}
