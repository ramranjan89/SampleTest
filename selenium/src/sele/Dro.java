package sele;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Dro {
	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		driver.get("https://www.gmail.com/");
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("ramranjanjha89");
		driver.findElement(By.xpath("//div[@id='identifierNext']")).click();
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("9753860654");
		driver.findElement(By.xpath("//div[@id='passwordNext']")).click();
		List<WebElement> wb=driver.findElements(By.xpath("//div[@class='T-Jo-auh']"));
		for(int i=1;i<wb.size();i++)
		{
			if(i%2==0)
			{
				wb.get(i).click();
			}
		}
		
	}
	

}
