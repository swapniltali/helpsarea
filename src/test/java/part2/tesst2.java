package part2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class tesst2 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//WebElement drfg=driver.findElement(By.xpath("//a[contains(@id,'u_0_0_')]"));
		//drfg.click();
		WebElement txt_swa=driver.findElement(By.xpath("//input[@name='firstname']"));
		txt_swa.sendKeys("swapnil");
		
		
		
	}

}
