package sele;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class XpathFind {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("mi 4",Keys.ENTER);
		
		WebDriverWait wait=new WebDriverWait(driver,40);
		
		
		
		//driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//WebElement nwstfst=driver.findElement(By.xpath("//li[contains(@class,'_2Ylh8t')]/../li[5]"));
		WebElement wbe=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//li[contains(@class,'_2Ylh8t')]/../li[5]")));
		Actions act=new Actions(driver);
		act.moveToElement(wbe).doubleClick().build().perform();
		
		
	}

}
