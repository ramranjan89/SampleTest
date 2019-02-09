package com.practicse;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class practis {
	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajni\\eclipse-workspace\\uiAutomation\\driver\\chromedriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://way2automation.com/way2auto_jquery/alert.php");
		driver.findElement(By.xpath(".//*[@id='load_form']/div/div[1]/p/a")).click();;
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("ramranjanjha89");
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("8271554461@r",Keys.ENTER);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//a[@href='#example-1-tab-2']")).click();
		driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
		Alert alt=driver.switchTo().alert();
		alt.sendKeys("ramu");
		alt.accept();
		
	
		
		
	}
		
	}


