package next;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test6 extends Test5{
  WebDriver driver;

	@Test
	public void opn3() {
		System.out.println("mau be");
	}
	@Test
	public void opn4() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.lenovo.com/in/en/");
		driver.manage().window().maximize();
		driver.close();
	}
	@Test
	public void opn5() {
		System.out.println("helpsarea");
	}

}
