package newPracticeCB;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CBnew {
	WebDriver d;
	@BeforeTest
	//@BeforeMethod
	@Parameters("browser")
	public void run(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\omkar\\chromedriver.exe");
			d=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Desktop\\omkar\\geckodriver.exe");
			d=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", "C:\\Users\\user\\Desktop\\omkar\\IEDriverServer.exe");
			d=new InternetExplorerDriver(); 
		}
		else {
			System.out.println("Browser is not correct");
		}
	}
	@Test
	public void run1() {
		d.get("http://www.microlearning.org.in");
		d.manage().window().maximize();
		d.findElement(By.name("username")).sendKeys("admin@gmail.com");
		d.findElement(By.name("password")).sendKeys("2002100");
		d.findElement(By.name("login")).click();
		d.close();
	}

}
