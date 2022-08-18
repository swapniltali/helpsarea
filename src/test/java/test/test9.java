package test;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test9 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		WebElement frstname1=driver.findElement(By.xpath("//input[@id='email']"));
		WebElement frstname2=driver.findElement(By.xpath("//input[@id='pass']"));
		
		 String path="C:\\Users\\lenovo\\eclipse-workspace\\bsmorningbatch\\data\\testdata1.xlsx";
		 FileInputStream sr=new FileInputStream(path);                 //to read data from excel
		 XSSFWorkbook aj=new XSSFWorkbook(sr);                         // to provide data from excel
		 String data1=aj.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();  //tsg data frm excel
		 System.out.println(data1);
		 String data2=aj.getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
		 System.out.println(data2);
		
		 
		 frstname1.sendKeys(data1);                                                     //sndg data to wbelmnt
		 frstname2.sendKeys(data2);
		 
		 WebElement clkbtn=driver.findElement(By.xpath("//button[contains(@id,'u_0_5')]"));
		 clkbtn.click();                                                                //clk lgn_btn
		 
		double data5=aj.getSheet("Sheet1").getRow(0).getCell(4).getNumericCellValue();  //nmrk value
		System.out.println(data5);
		String data5s=String.valueOf(data5);                                            // cnvrt dbl to strng
		String data8b=data5s.replace(".0","");                                          // replace
		System.out.println(data8b);
		
	}

}
