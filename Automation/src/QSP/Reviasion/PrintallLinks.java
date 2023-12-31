package QSP.Reviasion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintallLinks {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
	List<WebElement> allLinks = driver.findElements(By.tagName("a"));
	int count = allLinks.size();
	for(int i = 0;i<count;i++) {
		String text = allLinks.get(i).getText();
		System.out.println(text);
	}
	driver.quit();
	}
}
