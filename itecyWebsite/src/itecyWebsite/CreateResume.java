package itecyWebsite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CreateResume {
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
		method.ClickSubMenu("Create Profile");
		driver.findElement(By.xpath("//input[@id='pal_r']")).click();
		driver.findElement(By.xpath("//input[@id='joymeet2015_gmail_com']")).click();
	//  Professional title
		driver.findElement(By.xpath("//*[@id='ResumeTitle']")).sendKeys("QA Automation"); 
		driver.findElement(By.xpath("//*[@id='ResumeTitle']")).clear();
		// select
		
		//WebElement dropdown = driver.findElement(By.xpath("//*[text()=' Select Industry']"));
		//Select  industry  = new Select(dropdown);
		// industry.selectByValue("8");
		//Select industry=new Select(driver.findElement(By.xpath("//*[@id='IndustryId']"))).selectByValue("IT/Computer");
		Thread.sleep(2000);
		 //about notes
		driver.findElement(By.xpath("//*[@id='Summary']")).sendKeys("Java Automation");  
		driver.findElement(By.xpath("//*[@id='Summary']")).clear();
		//next
		driver.findElement(By.xpath("//*[@class='next btn btn-primary']")).click(); 
		
		driver.findElement(By.xpath("//*[@id='Contact']")).click();
		//WebElement dropdown = ;
		Select  mStatus  = new Select(driver.findElement(By.xpath("//*[@id='MaritalStatus']")));
		 mStatus.selectByValue("2");
		 //Select Countrty
		Select country=new Select(driver.findElement(By.xpath("//*[@id='CountryId']")));
		country.selectByValue("3");
		//Select Nationality
		Select nationality=new Select(driver.findElement(By.xpath("//*[@id='NationalityId']")));
		nationality.selectByValue("3");
		//Select City
		Select city=new Select(driver.findElement(By.xpath("//*[@id='CityId']")));
		 city.selectByVisibleText("Select City");
		//Select State
		Select state=new Select(driver.findElement(By.xpath("//*[@id='StateId']")));
		state.selectByValue("TELANGANA");
		//Select Experience level
		driver.findElement(By.xpath("//div[@class='row bottom-mrg extra-mrg']/div[15]")).click();
			
		driver.findElement(By.xpath("//select[@id='ExpLevel']/option[3]")).click();
		//Select Work Authorization
				Select workAuthority=new Select(driver.findElement(By.xpath("//*[@id='AuthId']")));
				workAuthority.selectByVisibleText("Citizen");
				Thread.sleep(2000);
				//Select Gender
				Select gender=new Select(driver.findElement(By.xpath("//*[text()='Female']")));
				gender.selectByVisibleText("Female");
				method.NextclickButton();
		Thread.sleep(5000);
		
	driver.close();
		
		

		
		
	
		
	}
}
