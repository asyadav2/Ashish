package webdriver;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo7 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ASHISHYADAV\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		//System.setProperty("webdriver.ie.driver", "C:\\Users\\ASHISHYADAV\\Downloads\\IEDriverServer_x64_3.4.0\\IEDriverServer.exe");
        WebDriver driver = new FirefoxDriver();
        //WebDriver driver = new InternetExplorerDriver();
        driver.manage().window().maximize();
        //driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.navigate().to("http://realestate.upskills.in/wp-admin/");
        String Expected = driver.getCurrentUrl();
        System.out.println(Expected);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='user_login']")).sendKeys("admin");
        driver.findElement(By.xpath("//*[@id='user_pass']")).sendKeys("adminuser@12345");
        driver.findElement(By.xpath("//*[@class='button border margin-top-10' and @type='submit']")).click();
        Thread.sleep(3000);
        WebElement link = driver.findElement(By.xpath("//*[contains(text(),'Howdy')]"));
        Actions act = new Actions(driver);
        act.contextClick(link).build().perform();
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(3000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(3000);
        robot.keyPress(KeyEvent.VK_CONTROL);
        Thread.sleep(3000);
        robot.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(3000);
        String Actual = driver.getCurrentUrl();
        System.out.println(Actual);
        if(Expected.equals(Actual))
    	{
    		System.out.println("This is same URL");
    	} 
  
        else
        {
    		System.out.println("This is not same URL");
    	}  	
	}

}
