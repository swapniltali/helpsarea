package test;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
        WebDriver drive=new ChromeDriver();
        drive.get("https://www.instagram.com/?hl=en");
        drive.manage().window().maximize();
        Thread.sleep(18000);
        drive.close();
        
        //drive.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
}
}