package test1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test2 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");             
		driver.manage().window().maximize();
		String path="C:\\Users\\lenovo\\eclipse-workspace\\bsmorningbatch\\data\\testdata1.xlsx";
		FileInputStream sr=new FileInputStream(path);                 //to read data from excel
		 XSSFWorkbook aj=new XSSFWorkbook(sr);                         // to provide data from excel
		 
		 WebElement frstname1=driver.findElement(By.xpath("//input[@name='firstName']"));
	     WebElement frstname2=driver.findElement(By.xpath("//input[@name='lastName']"));
	     WebElement frstname3=driver.findElement(By.xpath("//input[@name='phone']"));
	     WebElement frstname4=driver.findElement(By.xpath("//input[@name='userName']"));
	     WebElement frstname5=driver.findElement(By.xpath("//input[@name='address1']"));
	     WebElement frstname6=driver.findElement(By.xpath("//input[@name='city']"));
	     WebElement frstname7=driver.findElement(By.xpath("//input[@name='state']"));
	     WebElement frstname8=driver.findElement(By.xpath("//input[@name='postalCode']"));
	     WebElement frstname9=driver.findElement(By.xpath("//input[@id='email']"));
	     WebElement frstname10=driver.findElement(By.xpath("//input[@name='password']"));
	     WebElement frstname11=driver.findElement(By.xpath("//input[@name='confirmPassword']"));
	     WebElement frstname12=driver.findElement(By.xpath("//input[@name='submit']"));
	     
		 String data1=aj.getSheet("Sheet2").getRow(0).getCell(0).getStringCellValue();  //tsg data frm excel
		 System.out.println(data1);
		 String data2=aj.getSheet("Sheet2").getRow(0).getCell(1).getStringCellValue();
		 System.out.println(data2);
		 String data3=aj.getSheet("Sheet2").getRow(0).getCell(2).getStringCellValue();  //tsg data frm excel
		 System.out.println(data3);
		 String data4=aj.getSheet("Sheet2").getRow(0).getCell(4).getStringCellValue();
		 System.out.println(data4);
		 String data5=aj.getSheet("Sheet2").getRow(2).getCell(0).getStringCellValue();  //tsg data frm excel
		 System.out.println(data5);
		 String data6=aj.getSheet("Sheet2").getRow(2).getCell(3).getStringCellValue();
		 System.out.println(data6);
		 String data7=aj.getSheet("Sheet2").getRow(2).getCell(4).getStringCellValue();  //tsg data frm excel
		 System.out.println(data7);
		 String data8=aj.getSheet("Sheet2").getRow(2).getCell(6).getStringCellValue();
		 System.out.println(data8);
		 String data10=aj.getSheet("Sheet2").getRow(4).getCell(0).getStringCellValue();  //tsg data frm excel
		 System.out.println(data7);
		 String data11=aj.getSheet("Sheet2").getRow(4).getCell(1).getStringCellValue();
		 System.out.println(data8);
		 frstname1.sendKeys(data1);                                                     //sndg data to wbelmnt
		 frstname2.sendKeys(data2);
		 frstname3.sendKeys(data3);                                                     //sndg data to wbelmnt
		 frstname4.sendKeys(data4);
		 frstname5.sendKeys(data5);                                                     //sndg data to wbelmnt
		 frstname6.sendKeys(data6);
		 frstname7.sendKeys(data7);                                                     //sndg data to wbelmnt
		 frstname8.sendKeys(data8);
		 frstname9.sendKeys(data4);
		 frstname10.sendKeys(data10);                                                     //sndg data to wbelmnt
		 frstname11.sendKeys(data11);
		 WebElement drpcountry=driver.findElement(By.xpath("//select[@name='country']"));
		 Select sel=new Select(drpcountry);
		 sel.selectByVisibleText("AMERICAN SAMOA");
		 Thread.sleep(5000);
		 frstname12.click();
		 WebElement frstname13=driver.findElement(By.xpath("//a[text()=' sign-in ']"));
		 frstname13.click();
		 WebElement frstname14=driver.findElement(By.xpath("//input[@name='userName']"));
		 frstname14.sendKeys(data4);
		 WebElement frstname15=driver.findElement(By.xpath("//input[@name='password']"));
		 frstname15.sendKeys(data10);
		 WebElement frstname16=driver.findElement(By.xpath("//input[@name='submit']"));
		 frstname16.click();
	}

}
