package downloadfile_uploadfile;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Down_File {

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.freshmaza.live/beta/download/225943/01 Khamiyaza - Title Song - 320Kbps/1.html");
		driver.findElement(By.xpath("//a[@class='touch']/b/font")).click();
		String mainwindow=driver.getWindowHandle();
		driver.switchTo().window(mainwindow);
		Robot rob=new Robot();
		Thread.sleep(2000);
		rob.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		rob.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		rob.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);			
		
		rob.keyPress(KeyEvent.VK_ENTER);
	}

}
