package QSP;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Suggestion {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	Thread.sleep(2000);
	driver.findElement(By.id("APjFqb")).sendKeys("JAVA");
	Thread.sleep(2000);
	List<WebElement> allsugg = driver.findElements(By.xpath("//span[contains(text(),'java')]"));
	int count = allsugg.size();
	System.out.println(count);
	for(int i=0;i<count;i++)
	{
		System.out.println(allsugg.get(i).getText()); 
	}
}
}
