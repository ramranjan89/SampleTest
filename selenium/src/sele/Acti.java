package sele;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Acti {
	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.amazon.in");
		
		WebElement wb=driver.findElement(By.xpath("//a[@id='nav-link-shopall']"));
		Actions act=new Actions(driver);
		act.moveToElement(wb).perform();
		WebElement wb1=driver.findElement(By.xpath("//span[@aria-label='Mobiles, Computers']"));
		act.moveToElement(wb1).perform();
		
		WebElement wb2=driver.findElement(By.xpath("//a[@href='/mobile-phones/b/ref=nav_shopall_sbc_mobcomp_all_mobiles?ie=UTF8&node=1389401031']"));
		act.moveToElement(wb2).perform();
		WebElement wb3=driver.findElement(By.xpath("//a[@href='/computers-and-accessories/b/ref=nav_shopall_sbc_mobcomp_all_comp?ie=UTF8&node=976392031']"));
		act.moveToElement(wb3).perform();
		wb2.click();
		String str=driver.getCurrentUrl();
		System.out.println(str);
		String str2=driver.getTitle(); 
		System.out.println(str2);
		
		
		
			}
		};
	


