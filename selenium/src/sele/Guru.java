package sele;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Guru {
public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("http://www.demo.guru99.com/V4/");
	driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr113239");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("ezujYpa");
	driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
	driver.findElement(By.xpath("//a[@href='DeleteCustomerInput.php']")).click();
	driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("35549");
	driver.findElement(By.xpath("//input[@name='AccSubmit']")).click();
	Alert alrt=driver.switchTo().alert();
	alrt.accept();
	String str=driver.switchTo().alert().getText();
	System.out.println(str);
	alrt.accept();

}
}
