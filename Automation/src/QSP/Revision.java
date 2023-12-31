package QSP;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Revision {
 public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().window().minimize();
	driver.manage().window().fullscreen();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.navigate().to("http://localhost/login.do");
	System.out.println(driver.getPageSource());
	List<WebElement> allLinks = driver.findElements(By.tagName("//a[@href]"));
	System.out.println(allLinks.size());
	for(WebElement links:allLinks) {
		System.out.println(links.getText());
	}
	 
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.xpath("//div[contains(text(),'Login')]")).click();
	driver.findElement(By.linkText("View Time-Track")).click();
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();
	driver.quit();
	System.out.println("success");
}
}
