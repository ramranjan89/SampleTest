package sele;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop {
public static void main(String[] args) {
	
WebDriver driver=new FirefoxDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/");
WebElement wb=driver.findElement(By.xpath("//select[@id='month']"));
Select s1=new Select(wb);
for(int i=0;i<12;i++)
{
	s1.selectByIndex(i);
}

List <WebElement> lst=s1.getOptions();
for(int j=0;j<lst.size();j++)
{
	System.out.println(lst.get(j).getText());
}

}
}
