package itecyWebsite;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;



public class ShyamUpload {
WebDriver driver;
	
	ReusableMethod method = new ReusableMethod();
	

	@Test
	public void SearchByCompany() throws InterruptedException, AWTException {
	
		// Launching Browser test
		
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
		method.NextclickButton();
		method.NextclickButton();
		method.NextclickButton();
		method.NextclickButton();
		method.NextclickButton();
		method.NextclickButton();
		method.NextclickButton();
		
 driver.findElement(By.xpath("//div/div/div/input[@class='inputfile inputfile-2 form-control']")).click();

			uploadFileWithRobot("C:\\Users\\Admin\\Desktop\\CV\\Sample Automation tester Resume.docx");
	}

public void uploadFileWithRobot (String imagePath) {
    StringSelection stringSelection = new StringSelection(imagePath);
    Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
    clipboard.setContents(stringSelection, null);
    Robot robot = null;
    try {
        robot = new Robot();
    } catch (AWTException e) {
        e.printStackTrace();
    }
    robot.delay(250);
    robot.keyPress(KeyEvent.VK_ENTER);
    robot.keyRelease(KeyEvent.VK_ENTER);
    robot.keyPress(KeyEvent.VK_CONTROL);
    robot.keyPress(KeyEvent.VK_V);
    robot.keyRelease(KeyEvent.VK_V);
    robot.keyRelease(KeyEvent.VK_CONTROL);
    robot.keyPress(KeyEvent.VK_ENTER);
    robot.delay(150);
    robot.keyRelease(KeyEvent.VK_ENTER);



	}
	
	
	
	
/*Toolkit.getDefaultToolkit().getSystemClipboard().setContents(x,null);
Robot robot=new Robot();
robot.keyPress(KeyEvent.VK_CONTROL);  // press arrow down key of keyboard to navigate and select Save radio button	
robot.keyPress(KeyEvent.VK_V);	
robot.keyPress(KeyEvent.VK_V);
robot.keyPress(KeyEvent.VK_CONTROL);	
Thread.sleep(2000);	
robot.keyPress(KeyEvent.VK_ENTER);	
robot.keyPress(KeyEvent.VK_ENTER);
Thread.sleep(5000);
	}*/
	
	
	
	
	
}
