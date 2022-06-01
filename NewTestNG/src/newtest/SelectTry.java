package newtest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class SelectTry {
	WebDriver a;

@Test
public void select() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\omkar\\chromedriver.exe");
	a=new ChromeDriver();
	a.get("https://www.facebook.com/signup");
	WebElement bd=a.findElement(By.name("birthday_day"));
	Select day=new Select(bd);
	day.selectByVisibleText("10");
	List<WebElement> li=day.getOptions();
	System.out.println(li.size());
	for(int i=0;i< li.size();i++) {
		System.out.println(li.get(i).getText());
		
	}
	WebElement mo=a.findElement(By.name("birthday_month"));
	Select month=new Select(mo);
	month.selectByVisibleText("Sep");
	List<WebElement> liy=month.getOptions();
	System.out.println(liy.size());
	for(int i=0;i< liy.size();i++) {
		System.out.println(liy.get(i).getText());
		   
	}
	
}
@AfterTest
public void close() {
	a.close();
}
}
