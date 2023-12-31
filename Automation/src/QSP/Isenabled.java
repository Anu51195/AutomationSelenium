package QSP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.grid.Main;

public class Isenabled {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		boolean link = driver.findElement(By.name("login")).isEnabled();
		System.out.println(link);
		driver.quit();
	}
}
