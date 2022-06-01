package multipleScreenshot;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MIcrolearning {
	WebDriver d;
@Test
public void show() throws IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\omkar\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
	d.get("http://www.microlearning.org.in");
	d.findElement(By.name("username")).sendKeys("admin@gmail.com");
	d.findElement(By.name("password")).sendKeys("2002100");
	Utility.screenshot(d, "valid login credentials");
	d.findElement(By.name("login")).click();
	Utility.screenshot(d, "successfull login");
	d.close();
	
	
}
}
