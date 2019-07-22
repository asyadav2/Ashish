package webdriver;

//import java.awt.
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ASHISHYADAV\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
        driver.get("http://newtours.demoaut.com/");
        WebElement username = driver.findElement(By.name("userName"));
        if(username.isEnabled())
        {
        	username.sendKeys("sunil");
        	username.clear();
        	username.sendKeys("sunil");
        }
        if(username.isDisplayed())
        {
        	String UN = username.getAttribute("value");
        	String UN1 = username.getAttribute("name");
        	System.out.println(UN1);
        	//gettext --> label, dropdown, links
        	//getAttribute --> Edit Box where we pass the value and if any element attributes is dynamic in nature
        	String text = driver.findElement(By.xpath("//*[contains(text(),'Name:')]")).getText();
        	System.out.println(text);
        	System.out.println(UN);
        }
        driver.findElement(By.name("password")).sendKeys("sunil");
        driver.findElement(By.name("login")).click();
        Thread.sleep(30000);
        if(driver.findElement(By.xpath("//*[@name='tripType'and @value='roundtrip']")).isSelected())
      {
	driver.findElement(By.xpath("//*[@name='tripType'and @value='oneway']")).click();

	        }
        WebElement DD = driver.findElement(By.name("passCount"));
        Select sel = new Select(DD);
        List<WebElement> options = sel.getOptions();
        System.out.println(options.size());
        for(int i=0;i<options.size();i++)
        {
        	System.out.println(options.get(i).getText());
        	
        }
        sel.selectByValue("2");
        Thread.sleep(3000);
        sel.selectByIndex(3);
        Thread.sleep(3000);
        sel.selectByVisibleText("1");
        driver.findElement(By.xpath("//*[@name='servClass'and @value='Business']")).click();
        driver.findElement(By.name("findFlights")).click();
        Thread.sleep(3000);
        driver.findElement(By.name("reserveFlights")).click();
        driver.findElement(By.name("passFirst0")).sendKeys("Ashish");
        driver.findElement(By.name("passLast0")).sendKeys("Yadav");
        driver.findElement(By.name("creditnumber")).sendKeys("1234 5678 1234");
        List<WebElement>checkbox = driver.findElements(By.xpath("//*[@name='ticketLess' and @value='checkbox']"));
        System.out.println("Checkbox size is-->" + checkbox.size());
        for(int i=0;i<1;i++)
        {
        checkbox.get(i).click();
        }
        driver.findElement(By.name("buyFlights")).click();
        /*for(WebElement e:checkbox)
        {
        	e.click();
        }*/
        }
	}