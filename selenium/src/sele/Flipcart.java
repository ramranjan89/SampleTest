package sele;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Flipcart {
public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com");
	driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
	driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("oppo");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
String s1=	driver.findElement(By.xpath("//div[text()='OPPO F3 (Black, 64 GB)']/../../div[2]/div[4]/span")).getText();
System.out.println(s1);
	
String s2="";

for(int i=0;i<s1.length();i++)
{
	char ch=s1.charAt(i);
	
	if(Character.isDigit(ch))
	{
		s2=s2+ch;
	}
}
System.out.println(s2);

	
}
}
