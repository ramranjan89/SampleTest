package sele;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Zoout {
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		Actions ac=new Actions(driver);
		ac.sendKeys(Keys.chord(Keys.CONTROL,Keys.SUBTRACT,Keys.SUBTRACT,Keys.SUBTRACT,Keys.SUBTRACT)).perform();
	}

}
