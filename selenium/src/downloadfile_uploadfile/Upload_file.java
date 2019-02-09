package downloadfile_uploadfile;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.thoughtworks.selenium.webdriven.commands.KeyEvent;

public class Upload_file {

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath(".//input[@id='imagesrc']")).click();
         Robot upload=new Robot();
         upload.keyPress(java.awt.event.KeyEvent.VK_R);
         upload.keyPress(java.awt.event.KeyEvent.VK_E);
         upload.keyPress(java.awt.event.KeyEvent.VK_S);
         upload.keyPress(java.awt.event.KeyEvent.VK_U);
         upload.keyPress(java.awt.event.KeyEvent.VK_M);
         upload.keyPress(java.awt.event.KeyEvent.VK_E	);
         upload.keyPress(java.awt.event.KeyEvent.VK_ENTER);
	}
         

}
