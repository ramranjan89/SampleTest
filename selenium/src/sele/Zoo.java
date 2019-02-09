package sele;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Zoo {
	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		Actions act=new Actions(driver);
		act.sendKeys(Keys.chord(Keys.CONTROL,Keys.ADD,Keys.ADD,Keys.ADD,Keys.ADD,Keys.ADD)).perform();
		
		
	}

}
