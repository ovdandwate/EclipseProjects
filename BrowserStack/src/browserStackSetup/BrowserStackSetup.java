package browserStackSetup;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import browserStackPages.BrowserStackHomePage;
import browserStackPages.BrowserStackSignUpPage;

public class BrowserStackSetup {
	WebDriver driver;
	@BeforeTest
	public void Setup() {
		System.setProperty("webdriver.chrome.driver", "D:/Programming/SELENIUM/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.browserstack.com");		
	}
	
	@Test
	public void OnHomePageClickOnGetStarted() {
		BrowserStackHomePage objBrowserStackHomePage=new BrowserStackHomePage(driver);
		objBrowserStackHomePage.verifyHeader();
		objBrowserStackHomePage.clickOnGetStarted();
	}
	
	@Test(priority = 2)
	public void enterUserDetails() {
		BrowserStackSignUpPage objBrowserStackSignUpPage=new BrowserStackSignUpPage(driver);
		objBrowserStackSignUpPage.enterName("omkar");
		objBrowserStackSignUpPage.enterEmail("omkar@d.com");
		objBrowserStackSignUpPage.enterPW("oVD");
	}
	
	@AfterTest
	public void checkAndQuitBrowser() throws IOException, InterruptedException {
		TakesScreenshot ss=(TakesScreenshot)driver;
		File src=ss.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("D:\\Programming\\Screenshots\\detailsuploaded.jpg"));
		Thread.sleep(3000);
		driver.close();
	}

}
