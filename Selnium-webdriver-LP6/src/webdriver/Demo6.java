package webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo6 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ASHISHYADAV\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		//System.setProperty("webdriver.ie.driver", "C:\\Users\\ASHISHYADAV\\Downloads\\IEDriverServer_x64_3.4.0\\IEDriverServer.exe");
        WebDriver driver = new FirefoxDriver();
        //WebDriver driver = new InternetExplorerDriver();
        driver.manage().window().maximize();
        //driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.navigate().to("http://retail.upskills.in/admin//");
        driver.findElement(By.xpath("//*[@id='input-username']")).sendKeys("admin");
        driver.findElement(By.xpath("//*[@id='input-password']")).sendKeys("admin@123");
        driver.findElement(By.xpath("//*[@class='btn btn-primary' and @type='submit']")).click();
        WebElement link =driver.findElement(By.id("menu-catalog"));
        Actions act = new Actions(driver);
        act.moveToElement(link).click().perform();

	}

}
