package itecyWebsite;

import java.awt.AWTException;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ItecyHomepage {
	WebDriver driver;
	ReusableMethod method = new ReusableMethod();

	@Test
	public void LoginPage() throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		// Launching Browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\workspace\\Drivers\\newchrome\\chromedrivercrome\\chromedriver.exe");
		driver = new ChromeDriver();
		method.setDriver(driver);
		method.loginUser();
		// Enter keyword
		driver.findElement(By.name("filter")).sendKeys("Java");
		// Select State
		driver.findElement(By.xpath("//a[@class='chosen-single']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ul[@class='chosen-results']/li[31]")).click();
		Thread.sleep(2000);
		// Search Job
		driver.findElement(By.xpath("//*[@class='btn btn-primary' and text()=' Search Job']")).click();
		Thread.sleep(2000);
		
		method.CloseBrowser();
		// driver.close();
	}
}
