package sele;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.thoughtworks.selenium.webdriven.commands.FireEvent;

public class Goog {
	public static void main(String[] args) {
 WebDriver driver=new FirefoxDriver();
 driver.manage().window().maximize();
 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://softwaretesting-guru.blogspot.in");
		driver.findElement(By.xpath("//a[@href='http://softwaretesting-guru.blogspot.in/p/blog-page.html']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("ramranjanjha");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//textarea[@name='comments']")).sendKeys("i m a good boy.this is my automation testing test");
       WebElement wb=driver.findElement(By.xpath("//select[@name='countries']"));
        Select s1=new Select(wb);
        for(int i=0;i<4;i++)
        {
        	s1.selectByIndex(i);
        }
        
       WebElement wbe= driver.findElement(By.xpath("//select[@multiple='multiple']"));
       
       Select sel=new Select(wbe);
       boolean status=sel.isMultiple();
       
       if(status)
       {
    	   for(int i=0;i<4;i++)
    	   {
    		   sel.selectByIndex(i);
    	   }
       }
       driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("le raja");
       driver.findElement(By.xpath("//input[@value='excellent']")).click();
       driver.findElement(By.xpath("//input[@value='good']")).click();
       driver.findElement(By.xpath("//input[@value='bad']")).click();
       
       WebElement wb1=driver.findElement(By.xpath("//a[@target='_self']"));
		Actions act=new Actions(driver);
		act.contextClick(wb1).perform();
		act.sendKeys("T").perform();
WebElement wb2=driver.findElement(By.xpath("//a[@target='_blank']"));
Actions act1=new Actions(driver);
act.contextClick(wb2).perform();
act.sendKeys("W").perform();


	}

}
