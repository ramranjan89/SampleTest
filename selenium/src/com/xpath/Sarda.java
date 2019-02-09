package com.xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sarda {
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.sharda.ac.in/");
		List<WebElement> wb=driver.findElements(By.xpath("//div[contains(@class,'region region-footer-menu')]/ul/li[5]/ul/li"));
		for(int i=0;i<wb.size();i++) 
		{
			System.out.println(wb.get(i).getText());
		}
	}

}
