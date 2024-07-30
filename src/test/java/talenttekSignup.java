import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class talenttekSignup {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://qa.taltektc.com/signup.html");
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(200));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
        driver.findElement(By.name("firstName")).sendKeys("Hass");
        driver.findElement(By.name("lastName")).sendKeys("QAbs");
        driver.findElement(By.name("email")).sendKeys("aenv21@gmail.com");
        driver.findElement(By.name("password")).sendKeys("Test12345");
        driver.findElement(By.xpath("//form[@id='signup-form']/div[4]/span/i")).click();
        driver.findElement(By.name("confirmPassword")).sendKeys("Test12345");
        driver.findElement(By.xpath("//form[@id='signup-form']/div[5]")).click();
        driver.findElement(By.xpath("//form[@id='signup-form']/div[5]/span/i")).click();
        driver.findElement(By.name("month")).click();
        new Select(driver.findElement(By.name("month"))).selectByVisibleText("Feb");
        driver.findElement(By.name("day")).click();
        new Select(driver.findElement(By.name("day"))).selectByVisibleText("4");
        driver.findElement(By.name("year")).click();
        new Select(driver.findElement(By.name("year"))).selectByVisibleText("1985");
        driver.findElement(By.xpath("//form[@id='signup-form']/label[3]")).click();
        driver.findElement(By.xpath("//form[@id='signup-form']/div[7]/label/span")).click();
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }
}
