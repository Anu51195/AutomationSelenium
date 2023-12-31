package QSP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CareHealthInsurance {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
	driver.findElement(By.id("policynumber")).sendKeys("12345");
	driver.findElement(By.id("dob")).click();
	
	driver.findElement(By.id("alternative_number")).sendKeys("9845098450");
	Thread.sleep(10000);
	driver.findElement(By.id("renew_policy_submit")).click();
	
	
	}
}
