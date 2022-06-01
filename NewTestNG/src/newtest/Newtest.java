package newtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Newtest {
	WebDriver m;
	@Test
	public void a()
{
	WebElement user=m.findElement(By.name("username"));
	user.sendKeys("admin@gmail.com");
	WebElement pw=m.findElement(By.name("password"));
	pw.sendKeys("2002100");
	WebElement login=m.findElement(By.name("login"));
	login.click();
}
@AfterTest
public void b() {
	m.close();
}
@BeforeTest
public void c() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\omkar\\chromedriver.exe");
	m=new ChromeDriver();
	m.get("http://www.microlearning.org.in");
}
}
