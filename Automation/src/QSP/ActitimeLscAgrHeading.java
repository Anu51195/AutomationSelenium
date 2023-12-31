package QSP;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeLscAgrHeading {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	driver.get("http://localhost/login.do");
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.xpath("//input[@class='textField pwdfield']")).sendKeys("manager");
	driver.findElement(By.id("loginButton")).click();
	driver.findElement(By.xpath("//div[@class='popup_menu_label' and contains(text(),'Help')]")).click();
	driver.findElement(By.partialLinkText("About your actiTIME")).click();
	driver.findElement(By.linkText("Read License Agreement")).click();
	Set<String> allWh = driver.getWindowHandles();
	for(String wh:allWh) {
		driver.switchTo().window(wh);
		String title = driver.getTitle();
		if(title.contains("License")) {
			System.out.println(driver.getTitle());
		List<WebElement> headings = driver.findElements(By.xpath("//h2"));
		int count=headings.size();
		for(int i=0;i<count;i++) {		
		System.out.println(headings.get(i).getText());
		}
		driver.quit();
		}
	}
}
}
