package sele;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonMake {
public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in");
List<WebElement> wb=driver.findElements(By.xpath("//table[@class='navFooterVerticalColumn']/tbody/tr/td[5]/ul[*]/li"));
for(int i=0;i<wb.size();i++)
{
	System.out.println(wb.get(i).getText());
}
}
}
