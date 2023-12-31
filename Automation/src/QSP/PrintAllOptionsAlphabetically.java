package QSP;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAllOptionsAlphabetically {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Anurag%20Dixit/OneDrive/Desktop/API/menu.html");
		WebElement mtrListbox = driver.findElement(By.id("mtr"));
		Select s = new Select(mtrListbox); 
		List<WebElement> alloptions = s.getOptions();
		int count=alloptions.size();
		for(int i = 0;i<count;i++) {
			System.out.println(alloptions.get(i).getText());
		}
		System.out.println("----------------------------------");
		System.out.println("Alphabetical Order");
		System.out.println("-----------------------------------");
		ArrayList al = new ArrayList();
		for(int i = 0;i<count;i++)
		{
			al.add(alloptions.get(i).getText());
		}
		Collections.sort(al);
		for(int i =0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		System.out.println("-----------------------------------");
		System.out.println("Without Duplicates");
		System.out.println("-----------------------------------");
		TreeSet <String>ts = new TreeSet<>();
		for(int i = 0;i<count;i++)
		{
			ts.add(alloptions.get(i).getText());
		}
		System.out.println(ts);
		for(String s3 : ts)
		{
			System.out.println(s3);
		}
		System.out.println("-----------------------------------");

		driver.quit();
	}

}
