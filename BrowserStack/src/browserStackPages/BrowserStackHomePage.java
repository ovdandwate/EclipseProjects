package browserStackPages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BrowserStackHomePage {
	WebDriver driver;
	By header= By.xpath("//h1");
	By GetStartedFree= By.xpath("//a[@id='signupModalButton']");
	
	public BrowserStackHomePage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void verifyHeader() {
		String getHeaderTest = driver.findElement(header).getText();
		assertEquals("App & Browser Testing Made Easy",getHeaderTest);
	}
	
	public void clickOnGetStarted() {
		driver.findElement(GetStartedFree).click();
	}

}
