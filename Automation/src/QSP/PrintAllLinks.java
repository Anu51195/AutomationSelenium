package QSP;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllLinks {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		driver.get("https://www.google.com/");
		driver.findElement(By.id("APjFqb")).sendKeys("Apple"+Keys.ENTER);
		List<WebElement> allLinks = driver.findElements(By.xpath("//span[contains(text(),'.com')]"));
		for(WebElement links:allLinks) {
			System.out.println(links.getText());
		}
	}
}
