package com.xpath;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class GoogleSearch {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.google.co.in");
		String expect="amazon pay";
		driver.findElement(By.xpath("//input[@dir='ltr']")).sendKeys("amaz");
		List<WebElement> lst=driver.findElements(By.xpath("//li[contains(@class,'sbsb_c gsfs')]"));
		for(int i=0;i<lst.size();i++)
		{
	String actual=lst.get(i).getText();
	if(expect.equals(actual))
	{
		lst.get(i).click();
		break;
	}
	
		}
	}

}
