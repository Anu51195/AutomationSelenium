package QSP.Reviasion;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AlphabaticalOrdermtr {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///C:/Users/Anurag%20Dixit/OneDrive/Desktop/API/menu.html");
		WebElement mtr = driver.findElement(By.id("mtr"));
		Select s=new Select(mtr);
		List<WebElement> opt = s.getOptions();
		int count=opt.size();
		ArrayList<String> al=new ArrayList();
		for(int i=0;i<count;i++) {
			al.add(opt.get(i).getText());
		}
		Collections.sort(al);
		for(int i=0;i<count;i++) {
			System.out.println(al.get(i));
		}
		driver.quit();
	}
}
