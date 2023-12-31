package QSP;

import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseSpecificBrowser {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://secure.indeed.com/");
		driver.findElement(By.id("login-google-button")).click();
		driver.findElement(By.id("apple-signin-button")).click();
		Set<String> allWh = driver.getWindowHandles();
		for(String wh:allWh) {
			driver.switchTo().window(wh);
			String title = driver.getTitle();
			System.out.println(title);
		}
		System.out.println("---------------------------");
		System.out.println("Which Window U want to close give title name");
		Scanner s=new Scanner(System.in);
		String s1=s.next();
		for(String close:allWh) {
			driver.switchTo().window(close);
			String title = driver.getTitle();
			if(title.contains(s1)) {
				driver.close();
			}
			
		}
	}

}
