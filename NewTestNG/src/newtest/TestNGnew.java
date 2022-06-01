package newtest;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGnew {
  @Test
  public void f() {
	  	System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\omkar\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.facebook.com/signup");
		Reporter.log("valid url");
		d.manage().window().maximize();
		//Thread.sleep(3000);
		d.findElement(By.name("firstname")).sendKeys("omkar");
		//Thread.sleep(3000);
		d.findElement(By.name("lastname")).sendKeys("dandwate");
		//Thread.sleep(3000);
		d.close();
	
  }
}
