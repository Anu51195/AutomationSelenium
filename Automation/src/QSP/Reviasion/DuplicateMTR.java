package QSP.Reviasion;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DuplicateMTR {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Anurag%20Dixit/OneDrive/Desktop/API/menu.html");
		WebElement mtr = driver.findElement(By.id("mtr"));
		Select s=new Select(mtr);
		List<WebElement> opt = s.getOptions();
		TreeSet<String> ts=new TreeSet<String>();
		for(int i=0;i<opt.size();i++) {
				String text = opt.get(i).getText();
			if(ts.add(text)==false) {
				System.out.println(text);
			}
		}
		System.out.println(ts);
		
		
		driver.quit();
		
	}
}
