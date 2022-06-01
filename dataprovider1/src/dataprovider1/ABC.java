package dataprovider1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ABC {
	WebDriver driver;
	@Test(dataProvider="datatest")
	public void m(String un,String pw)
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\omkar\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://www.microlearning.org.in");
	System.out.println("username provided " + un);
	System.out.println("password provided " + pw);
	driver.manage().window().maximize();
	driver.findElement(By.name("username")).sendKeys(un);
	driver.findElement(By.name("password")).sendKeys(pw);
	driver.findElement(By.name("login")).click();
	Assert.assertTrue(driver.getCurrentUrl().contains("http://www.microlearning.org.in/admin/home1.php"),"User is not able to login");
	System.out.println("user is able to login");
	
	}
	@DataProvider(name="datatest")
	public Object[][]getdata()
	{
		Object[][] data=new  Object[4][2];
		
		data[0][0] = "admin@gmail.com";
		data[0][1] = "2002100";
		
		data[1][0] = "admin###@gmail.com";
		data[1][1] = "2002100";
		
		data[2][0] = "ad   min    @gmail.com";
		data[2][1] = "200   2100";
		
		data[3][0] = "";
		data[3][1] = "";
		return data;
}

}
