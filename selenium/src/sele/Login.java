package sele;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://www.facebook.com/login/");
		driver.findElement(By.xpath("//input[@id='email'and@name='email']")).sendKeys("8271554461");
		driver.findElement(By.xpath("//input[@id='pass' or @placeholder='Password']")).sendKeys("8271554461@r");
		driver.findElement(By.xpath("//button[@id='loginbutton'][@name='login']")).click();
		driver.findElement(By.xpath("//textarea[@id='js_f' ]")).sendKeys("i m don");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
