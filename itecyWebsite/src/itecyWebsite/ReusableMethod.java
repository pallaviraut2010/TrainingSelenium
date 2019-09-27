package itecyWebsite;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class ReusableMethod {
	WebDriver driver;
	
	public WebDriver getDriver() {
		return driver;
	}

		public void setDriver(WebDriver driver) {
		this.driver=driver;
	}

	public void loginUser() throws InterruptedException{
		
		// Website open
		driver.get("https://testitecy.azurewebsites.net");
		driver.manage().window().maximize();
		// Login to jobseeker
		driver.findElement(By.xpath("//*[text()='Jobseeker Sign In']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name='email']")).sendKeys("joymeet2015@gmail.com");
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("ramram123#");
		driver.findElement(By.xpath("//*[@id='login-btn']")).click();
		}

public void  NextclickButton() throws InterruptedException {
	driver.findElement(By.xpath("//*[@class='next btn btn-primary']")).click(); 
	Thread.sleep(2000);
}
public void ClickSubMenu(String Menuitem) {
	
	
	driver.findElement(By.xpath("//*[text()='"+Menuitem+"']")).click();
	
}
public void CloseBrowser() {
	driver.close();
	
}

}
