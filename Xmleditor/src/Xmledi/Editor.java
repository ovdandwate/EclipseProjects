package Xmledi;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Editor {
	WebDriver d;
	@Test
	@Parameters({"username","pw"})
	public void a(String username,String pw) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\omkar\\chromedriver.exe");
		d=new ChromeDriver();
		d.get("http://www.microlearning.org.in");
		d.manage().window().maximize();
		d.findElement(By.name("username")).sendKeys(username);
		d.findElement(By.name("password")).sendKeys(pw);
		d.findElement(By.name("login")).click();
		d.close();
		
	}

}
