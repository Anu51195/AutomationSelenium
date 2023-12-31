package QSP;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDOB {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.fb.com/");
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(3000);
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.name("firstname")).sendKeys("Anurag");
		driver.findElement(By.name("lastname")).sendKeys("Dixit");
		driver.findElement(By.name("reg_email__")).sendKeys("Dixit151195@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("987654321");
		WebElement dayListBox = driver.findElement(By.id("day")); 
		Select s = new Select(dayListBox);
		s.selectByValue("5");
		WebElement monthListBox = driver.findElement(By.id("month"));
		Select s1 = new Select(monthListBox);
		s1.selectByValue("11");
		WebElement yearListBox = driver.findElement(By.id("year"));
		Select s2 = new Select(yearListBox);
		s2.selectByValue("1995");
		

	}

}
