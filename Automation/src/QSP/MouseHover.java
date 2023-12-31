package QSP;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.vtiger.com/");
		WebElement resource = driver.findElement(By.partialLinkText("Resources"));
		Actions a = new Actions(driver);
		a.moveToElement(resource).perform();
		driver.findElement(By.partialLinkText("Contact Us")).click();
		String No=driver.findElement(By.xpath("//p[contains(text(),'Bengaluru, India')]/../p[2]")).getText();
		System.out.println(No);
		driver.quit();
		
	}
}
