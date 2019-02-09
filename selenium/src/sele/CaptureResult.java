package sele;

import java.util.concurrent.TimeUnit;

import org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CaptureResult {
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("nokia");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String s1=driver.findElement(By.xpath("//div[contains(@class,'KG9X1F')]")).getText();
		System.out.println(s1);
		String s2="";
		boolean status;
		for(int i=0;i<s1.length();i++)
		{
			
		if(i>=17&&i<=21)
		{
		      char ch=s1.charAt(i);	 
		  	s2=s2+ch;
			
		}
	
		
		}
		System.out.println(s2);
		
	}}


