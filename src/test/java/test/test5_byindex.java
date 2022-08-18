package test;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class test5_byindex {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/emailsignup/?hl=en");
		//driver.manage().window().maximize();         ////a[@role='button']
		Thread.sleep(5000);
		//WebElement txt_createacnt=driver.findElement(By.xpath("//a[@data-testid='sign-up-link']"));
		//txt_createacnt.click();                                  
		 WebElement frstname=driver.findElement(By.xpath("//input[@name='emailOrPhone']"));
		 //frstname.click();                                 //(//input[@data-type='text'])[1]
		 frstname.sendKeys("8888739854");                         ////input[@name='emailOrPhone']  
		 WebElement frstname1=driver.findElement(By.xpath("//input[@name='fullName']"));
		 frstname1.sendKeys("swapnil");                                                    ////input[@data-type='text']
		 WebElement frstname2=driver.findElement(By.xpath("//input[@name='username']"));                                                        ////input[@id='u_3_b_qW']
		 frstname2.sendKeys("sw_apnil2454");  
		 WebElement frstname3=driver.findElement(By.xpath("//input[@name='password']")); 
		 frstname3.sendKeys("swapnil@tali12");
		 WebElement frstname4=driver.findElement(By.xpath("//button[@type='submit']")); 
		 frstname4.click();
		 ////input[@class='inputtext _58mg _5dba _2ph-']
		 // WebElement txt1_frstname=driver.findElement(By.xpath("(//input[@data-type='text'])[2]"));
		 //txt1_frstname.sendKeys("swapn");
		 //WebElement txt2_frstname=driver.findElement(By.xpath("(//input[@data-type='text'])[3]"));
		 //txt2_frstname.sendKeys("swapniltali82@gmail.com");
		 //driver.close();
		                                                                                        //for screenshot 
		 
	    String path="C:\\Users\\lenovo\\eclipse-workspace\\bsmorningbatch\\screenshot";
		 
		//String rq=RandomString.make(2);                                              
		TakesScreenshot tr=(TakesScreenshot) driver;
		File scr=tr.getScreenshotAs(OutputType.FILE);
		File destination=new File(path+ "//"+"trial2.png");
		FileUtils.copyFile(scr, destination);
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}
}
