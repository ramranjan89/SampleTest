package com.selenium.handel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebSiteAuto {
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://www.voguedrycleaner.com/");
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("ramranjan");
		driver.findElement(By.xpath("//input[@id='mob']")).sendKeys("8271554461");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("ramranjanjha89");
		driver.findElement(By.xpath("//textarea[@id='comments']")).sendKeys("comment");
		driver.findElement(By.xpath("//a[@href='#process']")).click();
		driver.findElement(By.xpath(".//*[@id='pricing']/div[3]/div/div")).click();
		
		
	}

}
