package sele;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Abc {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajni\\Downloads\\Compressed\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement wbday=driver.findElement(By.xpath("//select[@id='day']"));
		
		Select sel=new Select(wbday);
		
		
		for(int i=0;i<31;i++)
		{
			sel.selectByIndex(i);
		}
	
		List<WebElement> list=sel.getOptions();
		
		for(int j=0;j<list.size();j++)
		{
			System.out.println(list.get(j).getText());
		}
		
		
	}

}
