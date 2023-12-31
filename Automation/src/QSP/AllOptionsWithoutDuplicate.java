package QSP;


import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllOptionsWithoutDuplicate {

	public static void main(String[] args) {
			WebDriver driver = new ChromeDriver();
			driver.get("file:///C:/Users/Anurag%20Dixit/OneDrive/Desktop/API/menu.html");
			WebElement mtrListbox = driver.findElement(By.id("mtr"));
			Select s = new Select(mtrListbox);
			List<WebElement> alloptions = s.getOptions();
			ArrayList<String> al=new ArrayList();
			for(int i=0;i<alloptions.size();i++) {
				al.add(alloptions.get(i).getText());
			}
			
				for(int i=0;i<al.size();i++) {
					String text = al.get(i);
					int count = 0;
					for(int j=0;j<al.size();j++) {
						String tzxt = al.get(j);
						if(text.equals(tzxt)) {
						++count;
						}
					} 						
					
				if(count>1) {
					System.out.println(text +" is repeating ");
				}
			}
			driver.quit();
	}

}
