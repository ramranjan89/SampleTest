package sele;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.security.Credentials;

public class Pracprog {
	
public static void main(String[] args) throws Throwable {
System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajni\\eclipse-workspace\\uiAutomation\\driver\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.get("http://jqueryui.com/slider/");
	driver.switchTo().frame(0);
	WebElement wb1=driver.findElement(By.xpath("//div[@id='slider']/span"));

	Actions act=new Actions(driver);
     act.dragAndDropBy(wb1, 100, 0).perform();
    
	
		
		
	}
	
	

	
	
	
			
	
}
	



