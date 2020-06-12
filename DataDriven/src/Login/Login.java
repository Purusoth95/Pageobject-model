package Login;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Login {
	WebDriver driver;
	
	Object[][]data=null;
			//{	
		//{"admin","admin3"},
		//{"admin","admin"},
		//{"admi","admin3"},
		//{"admin","admin1"}
	//};
	@DataProvider(name="logindata")
	public Object[][] loginDataProvider() throws BiffException, IOException {
		data=Getexcel();
				
		return data;	
	}
	
	public String[][] Getexcel() throws BiffException, IOException {
		FileInputStream file=new FileInputStream("C:\\Users\\purushoth\\Desktop\\Orangehrm.xls");
		Workbook workbook=Workbook.getWorkbook(file);
		Sheet sheet=workbook.getSheet(0);
		int rowcount=sheet.getRows();
		int columncount=sheet.getColumns();
		String testData[][]=new String[rowcount-1][columncount];
		for(int i=1;i<rowcount;i++) {
			for(int j=0;j<columncount;j++) {
				testData[i-1][j]=sheet.getCell(i,j).getContents();
			}
		}
		return testData;
	}
//	@BeforeTest
//	public void test() {
//		System.setProperty("webdriver.chrome.driver","D:\\81\\chromedriver.exe");
//		driver=new ChromeDriver();
//		
//	}
//	@AfterTest
//	public void aftertest(){
//		driver.quit();
//		
//	}
	
	@Test(dataProvider="logindata")
		public void browser(String uname,String upaswrd) {
		System.setProperty("webdriver.chrome.driver","D:\\81\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		WebElement username=driver.findElement(By.id("txtUsername"));
		username.sendKeys(uname);
		WebElement passwrd=driver.findElement(By.id("txtPassword"));
		passwrd.sendKeys(upaswrd);
		driver.quit();
	}

}
