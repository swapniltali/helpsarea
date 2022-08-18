package next;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test5 {
WebDriver driver;
@Test
public void opn1() {
	WebDriverManager.chromedriver().setup();
	driver =new ChromeDriver();
	driver.get("https://www.domain.com/");
	driver.manage().window().maximize();
}
@Test
public void opn2() {
	driver.get("https://www.microsoft.com/en-in/windows?r=1");
	driver.close();
}

}
