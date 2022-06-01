package practiceNew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Practicetestng {
	WebDriver d;
	@Test
	@Parameters({"fn","ln","emid","np","bday","bmonth","byear"})
	public void b(String fn,String ln,String emid,String np,int bday,int bmonth,String byear) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\omkar\\chromedriver.exe");
		d=new ChromeDriver();
		d.get("https://www.facebook.com/signup");
		d.manage().window().maximize();
		d.findElement(By.name("firstname")).sendKeys(fn);
		d.findElement(By.name("lastname")).sendKeys(ln);
		d.findElement(By.name("reg_email__")).sendKeys(emid);
		d.findElement(By.name("reg_passwd__")).sendKeys(np);
		Select day=new Select(d.findElement(By.name("birthday_day")));
		day.selectByIndex(bday);
		Select month=new Select(d.findElement(By.name("birthday_month")));
		month.selectByIndex(bmonth);
		Select year=new Select(d.findElement(By.name("birthday_year")));
		year.selectByVisibleText(byear);
		d.close();
	}
}
