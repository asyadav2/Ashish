package webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Demo5 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ASHISHYADAV\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
        //driver.get("https://newtours.demoaut.com/");
        driver.navigate().to("http://newtours.demoaut.com/");
        //WebElement link = driver.findElement(By.tagName("a"));
        List<WebElement> link = driver.findElements(By.tagName("a"));
        Actions MH = new Actions(driver);
        //Mouseover on Cruises
        Action mouseover = MH.moveToElement(link).build();
        mouseover.perform();
       // this is to click Enter from the Keyboard 
        //MH.sendKeys(link, (Keys.ENTER)).perform();
        Thread.sleep(3000);
        //MH.sendKeys(link, (Keys.RETURN)).perform();
        MH.sendKeys(Keys.TAB,Keys.TAB,Keys.TAB,(Keys.ENTER)).perform();

	}

}
