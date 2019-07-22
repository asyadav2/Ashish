package webdriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ASHISHYADAV\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		//System.setProperty("webdriver.ie.driver", "C:\\Users\\ASHISHYADAV\\Downloads\\IEDriverServer_x64_3.4.0\\IEDriverServer.exe");
        WebDriver driver = new FirefoxDriver();
        //WebDriver driver = new InternetExplorerDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        //driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
        //Thread.sleep(3000);
        //driver.navigate().refresh();
        // To pass the value as Admin
        driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("admin");
        driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");
        driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='welcome']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[2]/a")).click();
        //driver.close will close the opened instance of the browser but only one browser
        //driver.close();
        //driver.close will close the opened instance of the browser for all the browser
        //driver.quit();
        
        
       
	}

} 
