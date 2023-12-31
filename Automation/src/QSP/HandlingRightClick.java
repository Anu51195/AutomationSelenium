package QSP;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class HandlingRightClick {
	public static void main(String[] args) throws AWTException, InterruptedException {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notification","--maximize");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://localhost/login.do");
		WebElement link = driver.findElement(By.linkText("actiTIME Inc."));
		Actions a=new Actions(driver);
		a.contextClick(link).perform();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_W);
		Thread.sleep(10000);
		driver.quit();
		
	}
}
