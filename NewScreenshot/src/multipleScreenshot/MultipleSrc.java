package multipleScreenshot;

import java.io.IOException;

import javax.swing.text.Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSrc {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\omkar\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.facebook.com/signup");
		d.manage().window().maximize();
		Utility.screenshot(d, "valid url");
		//Thread.sleep(3000);
		d.findElement(By.name("firstname")).sendKeys("omkar");
		//Thread.sleep(3000);
		d.findElement(By.name("lastname")).sendKeys("dandwate");
		d.findElement(By.name("reg_email__")).sendKeys("omkar@gm.com");
		Utility.screenshot(d, "valid email");
		d.findElement(By.name("reg_passwd__")).sendKeys("omkar1234");
		
		Select day=new Select(d.findElement(By.name("birthday_day")));
		day.selectByIndex(9);
		Select month=new Select(d.findElement(By.name("birthday_month")));
		month.selectByIndex(8);
		Select year=new Select(d.findElement(By.name("birthday_year")));
		year.selectByValue("1994");
		Utility.screenshot(d, "valid birthdate");
		d.close();
		

	}

}
