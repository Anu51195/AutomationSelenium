package QSP;

import java.time.Duration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseTabsUsingIterator {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
		driver.get("http://localhost/login.do");
		driver.findElement(By.linkText("actiTIME Inc.")).click();		
		Set<String> allWh = driver.getWindowHandles();
		Iterator i=allWh.iterator();
		while(i.hasNext()) {
			String wh=(String) i.next();
			driver.switchTo().window(wh);
			driver.close();
		}
	}
}
