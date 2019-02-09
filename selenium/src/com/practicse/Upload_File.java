package com.practicse;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Upload_File {
	
	
	public static void main(String[] args) throws IOException {
		WebDriver driver;
		driver=new FirefoxDriver();
		driver.get("file:///C:/Users/Rajni/Desktop/fileupload/fileupload.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@id='1']"));
		Runtime.getRuntime().exec("C:\\Users\\Rajni\\Desktop\\fileupload");
		
		
	}
	


}
