package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Correctpassword {
	@Test
	@Parameters({"username","password"})
	public void Loginusrpas(String uname,String upassword) {
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
