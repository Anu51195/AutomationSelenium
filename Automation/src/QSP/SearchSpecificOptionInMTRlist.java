package QSP;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SearchSpecificOptionInMTRlist {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Anurag%20Dixit/OneDrive/Desktop/API/menu.html");
		WebElement mtrListbox = driver.findElement(By.id("mtr"));
		Select s = new Select(mtrListbox); s.
		List<WebElement> alloptions = s.getOptions();
		for(int i=0;i<alloptions.size();i++) {
			System.out.println(alloptions.get(i).getText());
		}
		WebElement slvListBox = driver.findElement(By.id("slv"));
		Select s1 = new Select(slvListBox);
		List<WebElement> alloptionsslv = s1.getOptions();
		for(int i=0;i<alloptionsslv.size();i++) {
			System.out.println(alloptionsslv.get(i).getText());
		}
		Scanner as = new Scanner(System.in);
		System.out.println("----------------------------------");
		System.out.println("type the dish of your choice from above list");
		System.out.println("----------------------------------");
		String dish = as.next();
		for(int i=0;i<alloptionsslv.size();i++) {
		
			
		}else {System.out.println("dish is a part of mtr menu");
		}
		}

}
