package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Demo4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ASHISHYADAV\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		//System.setProperty("webdriver.ie.driver", "C:\\Users\\ASHISHYADAV\\Downloads\\IEDriverServer_x64_3.4.0\\IEDriverServer.exe");
        WebDriver driver = new FirefoxDriver();
        //WebDriver driver = new InternetExplorerDriver();
        driver.manage().window().maximize();
        //driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
        driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("admin");
        driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");
        WebElement button = driver.findElement(By.name("Submit"));
        Actions MH = new Actions(driver);
        Action mouseover = MH.moveToElement(button).build();
        mouseover.perform();
        Thread.sleep(3000);
        MH.sendKeys(button,(Keys.ENTER)).perform();
        MH.sendKeys(Keys.TAB,Keys.TAB,Keys.TAB,(Keys.ENTER)).perform();
      
        
        
        

	}

}
