package QSP;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestActitime {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost/login.do");Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@class='textField pwdfield']")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='popup_menu_label' and contains(text(),'Help')]")).click();Thread.sleep(2000);
		driver.findElement(By.partialLinkText("About your actiTIME")).click();Thread.sleep(2000);
		driver.findElement(By.linkText("Read License Agreement")).click();
		
		driver.switchTo().window(null)
		List<WebElement> allHeadings = driver.findElements(By.tagName("h2"));
		int count=allHeadings.size();
		System.out.println(count);

	}

}
