package webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CaseStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ASHISHYADAV\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
        driver.get("http://newtours.demoaut.com/");
        String underconstitle = "Under Construction: Mercury Tours";
        List<WebElement> links = driver.findElements(By.tagName("a"));
        String[] linktext = new String[links.size()];
        int i=0;
        i++;
        for(WebElement e:links)
        {
        linktext[i]=e.getText();
        
	}
for(String t:linktext)
{
    driver.findElement(By.linkText(t)).click();
	if(driver.getTitle().equals(underconstitle))
	{
		System.out.println("\"" + t + "\" + is underconstruction");
	} 
	else 
	{
		System.out.println("\"" + t + "\" + is working");
		
	}
	driver.navigate().back();
	
	}
driver.close();
	}

	}
