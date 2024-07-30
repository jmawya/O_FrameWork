import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class practice {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.macys.com/account/createaccount?cm_sp=my_account-_-sign_in-_-create_account");
        driver.findElement(By.xpath("//*[@id='ca-profile-firstname']")).sendKeys("Jannat");
        driver.findElement(By.xpath("//*[@id='ca-profile-lastname']")).sendKeys("Mawya");
        driver.findElement(By.xpath("//*[@id='ca-profile-email']")).sendKeys("jmawya07@gmail.com");
        driver.findElement(By.cssSelector("input[title='Password']")).sendKeys("Test12345");

        WebElement list=driver.findElement(By.xpath("//*[@id='ca-profile-birth-month']"));
        Select sc=new Select(list);
        sc.selectByValue("01");

        WebElement list1=driver.findElement(By.xpath("//*[@id='ca-profile-birth-day']"));
        Select s=new Select(list1);
        s.selectByValue("13");


        driver.findElement(By.name("star-rewards")).click();
        driver.findElement(By.name("star-rewards-phone")).sendKeys("01855591778");
        driver.findElement(By.id("ca-profile-submit")).click();

    }
}
