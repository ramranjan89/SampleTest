package com.selenium.handel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CalanderHand {
	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.goibibo.com");
	driver.findElement(By.xpath("//div[@id='searchWidgetNew']/div[3]/div/div[3]/div[1]/div[1]/div")).click();
	
	
	
	
	
	}
	
	
}
