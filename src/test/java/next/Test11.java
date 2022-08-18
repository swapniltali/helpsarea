package next;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test11 {
	WebDriver driver;
	@Parameters({"browser"})
	@BeforeMethod
	public void m1 (String browser ) {
		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("mozila")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			
			
		}
		
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
	}
	@AfterMethod
	 public void g1() {
		driver.close();
	}
	

}
