package cookieshand;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Cookies_hand {
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
	Set<Cookie> cookie=driver.manage().getCookies();
	System.out.println("size of cookie"+ cookie.size());
	for(Cookie cookie1:cookie)
	{
		
		System.out.println("get cookie value"+ cookie1.getValue());
	}
	Cookie cobj=new Cookie("my cookies", "12344");
	driver.manage().addCookie(cobj);
	cookie=driver.manage().getCookies();
	System.out.println("new cookie size "+ cookie.size());
	driver.manage().deleteAllCookies();
	cookie=driver.manage().getCookies();
	System.out.println("size of cookie after delet  "+cookie.size());
	
	}

}
