package screenshott;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test1 {

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\SELENIUM\\chromedriver.exe");
		
          ChromeDriver ch = new ChromeDriver();
          ch.get("https://www.facebook.com/reg/");
          
          WebElement username = ch.findElement(By.name("firstname"));
          username.sendKeys("jayant");
          
          WebElement surname = ch.findElement(By.name("lastname"));
          surname.sendKeys("shinde");
          
          WebElement day = ch.findElement(By.id("day"));
          Select sel = new Select(day);
          sel.selectByVisibleText("2");
          
          WebElement mon = ch.findElement(By.id("month"));
          
          Select sp = new Select(mon);
          sp.selectByVisibleText("Mar");
          
          
          WebElement year = ch.findElement(By.id("year"));
          Select js = new Select(year);
          js.selectByVisibleText("2022"); 

          
          TakesScreenshot ts = (TakesScreenshot)ch;
          
          File source = ts.getScreenshotAs(OutputType.FILE);
          FileUtils.copyFile(source, new File("./snapshot/login.png"));

	


	}

}
