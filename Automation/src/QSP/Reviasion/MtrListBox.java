package QSP.Reviasion;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MtrListBox {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///C:/Users/Anurag%20Dixit/OneDrive/Desktop/API/menu.html");
		WebElement mtr = driver.findElement(By.id("mtr"));
		Select s = new Select(mtr);
		List<WebElement> allOptions = s.getOptions();	
		int count=allOptions.size();
		for(int i=0;i<count;i++) {
			String text = allOptions.get(i).getText();
			System.out.println(text);
		}
		//select
		for(int i=0;i<count;i++) {
			s.selectByIndex(i);
		}
		//deselect
		for(int i=0;i<count;i++) {
		s.deselectByIndex(i);
		}
		
		driver.quit();
	}

}
