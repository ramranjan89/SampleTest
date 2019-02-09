package sele;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class PopH {
	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.hdfcbank.com/");
		WebElement wb=driver.findElement(By.xpath("//span[text()='Apply now']"));
		Actions ac=new Actions(driver);
		ac.moveToElement(wb).build().perform();
 driver.findElement(By.xpath("//a[@href='https://home-loans.hdfc.com/wl1?WT.mc_id=P4_hp_AppNow_HL']")).sendKeys(Keys.ENTER);
//Actions act=new Actions(driver);//
//act.moveToElement(wb1).click().perform();
 Set<String> s1=driver.getWindowHandles();
 Iterator<String> i1=s1.iterator();
 String mainwind=i1.next();
 String childwind=i1.next();
 driver.switchTo().window(childwind);
 driver.switchTo().window(mainwind);
 driver.findElement(By.xpath("//input[@class='searchbox']")).sendKeys("gold loan");
 driver.findElement(By.xpath("//div[@class='sf-searchicon']")).click();
 driver.switchTo().window(childwind);
 driver.findElement(By.xpath("//a[text()='Home Loan']")).click();
		
				
	}

}
