package sele;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.omg.CORBA.FREE_MEM;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Dynam {
public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.gmail.com");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("ramranjanjha89");
	driver.findElement(By.xpath("//span[text()='Next']")).click();
	
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("9753860654");
	driver.findElement(By.xpath("//span[text()='Next']")).click();
	
	
	
	String x="//table[@class='F cf zt']/tbody/tr[*]/td[5]";
	
	List<WebElement> list=driver.findElements(By.xpath(x));
	
	for(int i=0;i<list.size();i++)
	{
		System.out.println(list.get(i).getText());
	}
	
	}
	
}

