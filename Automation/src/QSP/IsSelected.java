package QSP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		boolean link = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']")).isDisplayed();
		System.out.println(link);
		driver.quit();
	}

}
