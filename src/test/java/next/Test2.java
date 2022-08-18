package next;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Test2 {
	WebDriver driver;
	@Parameters({"browsername"})
	@BeforeMethod
	public void setup(String browsername ) {
		if (browsername.equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
	}
		else if(browsername.equalsIgnoreCase("mozilla")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
			
		
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
	}
		
		@AfterMethod
		
		
		public void AM() {
			driver.close();
		}
}
		
	//@Test
	//public void open() {
		//driver.get("https://msins.in/public/mh-grand-challenge");
	//	driver.manage().window().maximize();
		
	//}


