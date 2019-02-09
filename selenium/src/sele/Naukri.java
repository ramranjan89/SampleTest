package sele;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Naukri {
public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
	driver.get("https://www.naukri.com/");
	
	Set<String> set=driver.getWindowHandles();
	
	Iterator<String> i1=set.iterator();
	
	
	
	while(i1.hasNext())
	{
		driver.switchTo().window(i1.next());
		String title=driver.getTitle();
		
		
		if(title.contains("Jobs-Recruitment"))
		{
			break;
		}
		else
		{
			driver.close();
	}
	

}
}
}
