package QSP.Reviasion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("JAVA");
		//driver.findElement(By.xpath("//input[@value='Google Search']")).click();
		Thread.sleep(3000);
		List<WebElement> allSgn = driver.findElements(By.xpath("//span[contains(text(),'java')]"));
		int count=allSgn.size();
		for(int i=0;i<count;i++) {
			String sgst = allSgn.get(i).getText();
			System.out.println(sgst);
		}
		driver.quit();


	}
}
