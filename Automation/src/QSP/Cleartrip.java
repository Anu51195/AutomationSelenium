package QSP;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cleartrip {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://www.cleartrip.com/");
		driver.findElement(By.xpath("//div[@class='px-1   flex flex-middle nmx-1 pb-1']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Where from?']")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//div/p[contains(text(),'Bangalore')]")).click();
		driver.findElement(By.xpath("//input[@placeholder='Where to?']")).sendKeys("Nagpur");
		driver.findElement(By.xpath("//div/p[contains(text(),'Nagpur')]")).click();
		driver.findElement(By.xpath("//button[@class='flex flex-middle  t-all fs-2 focus:bc-secondary-500 bg-transparent bc-neutral-100 c-pointer pr-2 pl-3 pt-2 pb-2 ba br-4 h-8 c-neutral-900'][1]")).click();
		driver.findElement(By.xpath("//div[@role='gridcell' and @aria-label='Sun Dec 31 2023' ]")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//span[contains(text(),'Search flights')]")).click();
		//driver.close();--

	}

}
   