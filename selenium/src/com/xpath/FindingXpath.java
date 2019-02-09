package com.xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FindingXpath {
public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com");
	driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
	driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("mi 4",Keys.ENTER);
	
List<WebElement> lst=driver.findElements(By.xpath("//div[@class='_1fWl8W']/div[1]/section/div[2]/div/div[2]/a"));
for(int i=0;i<lst.size();i++)
{
	System.out.println(lst.get(i).getText());
}
}
}
