package QSP;

import org.openqa.selenium.WebDriver;

public class DemoA {
	
	public static void TestA(WebDriver driver) {
		driver.navigate().to("https://www.google.com/");
		String title = driver.getTitle();
		System.out.println(title);
		driver.navigate().to("https://www.gmail.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.close();
	}
}
