package QSP.Actitime;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LoginActitime {
	public static void main(String[] args) throws IOException {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notofication","--start-maximize");
		WebDriver driver=new ChromeDriver(opt);
		driver.get(GetPropertyActitime.GetPropertyURL());	
	}
}
