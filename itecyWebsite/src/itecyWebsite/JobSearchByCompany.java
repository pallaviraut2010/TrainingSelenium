package itecyWebsite;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JobSearchByCompany {

	WebDriver driver;
	
	ReusableMethod method = new ReusableMethod();
	

	@Test
	public void SearchByCompany() throws InterruptedException {
	
		// Launching Browser
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\workspace\\Drivers\\newchrome\\chromedrivercrome\\chromedriver.exe");
		driver = new ChromeDriver();
		
		// Website open
		method.setDriver(driver);
		method.loginUser();
		
		
		
		
		
		
		
		
		
		// Jobseeker search
		driver.findElement(By.xpath("//*[@data-toggle='dropdown'and contains(.,'Job Seeker')]")).click();
		method.ClickSubMenu("Search Companies");
		driver.findElement(By.xpath("//div[@class='col-md-5 col-sm-5']/input[@name='filter']"))
				.sendKeys("ClientServer Technology Solutions LLC");
		Thread.sleep(2000);
		
		// Select state
		driver.findElement(By.xpath(" //*[@class='col-md-4 col-sm-4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ul[@class='chosen-results']/li[31]")).click();
		Thread.sleep(3000);

		// Search Company driver.findElement(By.
		driver.findElement(By.xpath("//*[@class='btn btn-primary' and text()=' Search Company']")).click();

		method.CloseBrowser();
	}

}
