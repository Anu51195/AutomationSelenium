package QSP;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopUp {

	public static void main(String[] args) throws AWTException, InterruptedException {
		{
			ChromeOptions option = new ChromeOptions();
			option.addArguments("--disable-notifications");
			WebDriver driver=new ChromeDriver(option);	
			driver.manage().window().maximize();
			driver.get("https://www.yatra.com/");
			driver.quit();
		}
		{
			WebDriver driver=new ChromeDriver();	
			driver.manage().window().maximize();
			driver.get("https://www.yatra.com/");
			Robot r = new Robot();	
			r.keyPress(KeyEvent.VK_TAB);Thread.sleep(3000);
			r.keyPress(KeyEvent.VK_ENTER);Thread.sleep(3000);
			driver.quit();
		}
		{
			ChromeOptions option = new ChromeOptions();
			option.addArguments("--disable-notifications","--incognito","--start-maximized");
			WebDriver driver=new ChromeDriver(option);	
			driver.get("https://www.yatra.com/");
			Robot r = new Robot();	
			r.keyPress(KeyEvent.VK_TAB);Thread.sleep(3000);
			r.keyPress(KeyEvent.VK_ENTER);Thread.sleep(3000);
			driver.quit();
		}

	}

}
