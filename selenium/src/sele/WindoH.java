package sele;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindoH {
public static void main(String[] args) {
	
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("http://demo.guru99.com/popup.php");
	driver.findElement(By.xpath("//a[@href='../articles_popup.php']")).click();
	
	Set<String> str1=driver.getWindowHandles();
	
	Iterator<String> i1=str1.iterator();
	String parentwindow=i1.next();
	String childwindow=i1.next();
	
	driver.switchTo().window(childwindow);
	
	driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("ramranjanjha");
	
	driver.switchTo().window(parentwindow);
	
}
}
