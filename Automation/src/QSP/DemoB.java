package QSP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DemoB {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		DemoA.TestA(driver);
		WebDriver driver1=new EdgeDriver();
		DemoA.TestA(driver1);
	}

}
