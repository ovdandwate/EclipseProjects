package browserStackPages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BrowserStackSignUpPage {
	WebDriver driver;
	By Header=By.xpath("//h1");
	By Name= By.xpath("//input[@id='user_full_name']");
	By Email=By.xpath("//input[@id='user_email_login']");
	By PW=By.xpath("//input[@id='user_password']");
	
	public BrowserStackSignUpPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void verifyHeader() {
		String GetHeaderText=driver.findElement(Header).getText();
		assertEquals(GetHeaderText, "Create a FREE Account");
	}
	
	public void enterName(String arg1) {
		driver.findElement(Name).sendKeys(arg1);
	}
	
	public void enterEmail(String arg1) {
		driver.findElement(Email).sendKeys(arg1);
	}
	
	public void enterPW(String arg1) {
		driver.findElement(PW).sendKeys(arg1);
	}

}
