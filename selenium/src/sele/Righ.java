package sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Righ {
public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.amazon.in/");
WebElement w1=	driver.findElement(By.xpath("//a[@id='nav-your-amazon' and @class='nav-a nav_a']"));
Actions a1=new Actions(driver);
a1.contextClick(w1).perform();
a1.sendKeys("s").perform();
	
}
}
