package sele;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Mon {
public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	WebElement w1=driver.findElement(By.xpath("//select[@id='year']"));
	Select s1=new Select(w1);
	for(int i=0;i<26;i++)
	{
		s1.selectByValue("1993");
	}
	List<WebElement> lst= s1.getOptions();
	for(int j=0;j<lst.size();j++)
	{
		System.out.println(lst.get(j).getText());
	}
}
}
