package sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Fram {
	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://softwaretesting-guru.blogspot.in/p/blog-page.html");
		driver.switchTo().frame("navbar-iframe");
		driver.findElement(By.xpath("//a[@id='b-more']")).click();
		
driver.findElement(By.xpath("//a[@href='email-post.g?blogID=8096591602883638104&postID=7418071031602096210&isHttps=false']"));


}

}
