package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginProvider {
String [][]data={
				{"Admin","admin123"},
				{"admin","admin123"},
				{"Admin","admin"},
				{"admin","admin"},
				{"admin","dad"},
};
	
	@DataProvider(name="loginData")
	public String[][] loginDataProvider() {
		return data;

	}
	@Test(dataProvider="loginData")
	public void loginwithbothcrt(String uname,String upassword) {

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

}
