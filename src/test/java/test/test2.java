package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test2 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://youtu.be/K4nAZZAhrro");      //utube auto play
		WebElement hjw=driver.findElement(By.xpath("//button[@class='ytp-play-button ytp-button']"));
		hjw.click();                                     //webelement via 'Xpath' locator(Xpath by text)
		WebElement hjws=driver.findElement(By.xpath("//button[@class='ytp-fullscreen-button ytp-button']"));
		hjws.click();
		Thread.sleep(19000);
		
		//String til=driver.getTitle();
		//System.out.println(til);
		//String url=driver.getCurrentUrl();
		//System.out.println(url);
		// driver.navigate().to("https://www.dream11.com/en-US");
		//Thread.sleep(8000);
		//String ti=driver.getTitle();
		//System.out.println(ti);
		//String re1=driver.getCurrentUrl();
		//System.out.println(re1);
		//driver.navigate().back();
		//Thread.sleep(9000);
		//driver.navigate().forward();
		//Thread.sleep(11000);
		//driver.navigate().refresh();
		//Thread.sleep(18000);
		//driver.close();
		
	}

}
