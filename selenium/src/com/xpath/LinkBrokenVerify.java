package com.xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkBrokenVerify {
public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in");
	String expectdlink="Sell on Amazon";
List<WebElement> wb=driver.findElements(By.xpath("//table[@class='navFooterVerticalColumn']/tbody/tr/td[5]/ul[*]/li"));
for(int i=0;i<wb.size();i++)
{
	String acutallink=wb.get(i).getText();
	if(expectdlink.equals(acutallink))
	{
		wb.get(i).click();
		break;
	}
}

String acttitle=driver.getTitle();
System.out.println(acttitle);

if(acttitle.contains("404 error")||acttitle.contains("page not loaded"))

{
	System.out.println("link not working, FAILED");
	
}
else
{
	System.out.println("link is working fine: PASSED");
}
}
}
