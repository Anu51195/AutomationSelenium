package QSP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class Demo {
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		String title=driver.getTitle();
		System.out.println(title);
		driver.close();
	
		WebElement as;
		
	}
}
