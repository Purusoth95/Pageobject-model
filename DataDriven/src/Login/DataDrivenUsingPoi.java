package Login;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDrivenUsingPoi {
	static List<String>username=new ArrayList();
	static List<String>password=new ArrayList();
	
	public void Excelread() throws IOException {
		FileInputStream file=new FileInputStream("C:\\Users\\purushoth\\Desktop\\TestData1.xlsx");
		Workbook wbks=new XSSFWorkbook(file);
		Sheet sheet=wbks.getSheetAt(0);
		Iterator<Row>rowIterator=sheet.iterator();
		while(rowIterator.hasNext()) {
		Row rowvalue=rowIterator.next();
		Iterator<Cell>columnIterator=rowvalue.cellIterator();
		int i=2;
		while(columnIterator.hasNext()){
			if(i%2==0) {
				//Cell columnvalue=columnIterator.next();
				username.add(columnIterator.next().toString());
				//System.out.println(columnvalue);
			}
			else {
				password.add(columnIterator.next().toString());
			}
		i++;
		}
		}	
	}
public void login(String uname,String upassword) {
	
	System.setProperty("webdriver.chrome.driver","D:\\79\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	WebElement username=driver.findElement(By.id("txtUsername"));
	username.sendKeys(uname);
	WebElement pass=driver.findElement(By.id("txtPassword"));
	pass.sendKeys(upassword);
	WebElement button=driver.findElement(By.id("btnLogin"));
	button.click();
	driver.quit();
	
}
public void executetest() {
	for(int i=0;i<username.size();i++) {
		login(username.get(i),password.get(i));
		
	}
}
	public static void main(String[] args) throws IOException {
		DataDrivenUsingPoi usingpoi=new DataDrivenUsingPoi();
		usingpoi.Excelread();
		System.out.println("username List:"+username);
		System.out.println("password list:"+password);
		usingpoi.executetest();

	}

}
