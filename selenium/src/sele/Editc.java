package sele;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Editc {
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.demo.guru99.com/V4/");
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr113239");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("ezujYpa");
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
		driver.findElement(By.xpath("//a[@href='EditCustomer.php']")).click();
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		Alert alt1=driver.switchTo().alert();
		String str=driver.switchTo().alert().getText();
		System.out.println(str);
		alt1.accept();
	}

}
