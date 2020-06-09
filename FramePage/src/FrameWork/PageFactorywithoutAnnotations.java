package FrameWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class PageFactorywithoutAnnotations {
	public static WebElement txtUsername;
	public static WebElement txtPassword;
	public static WebElement btnlogin;
	
	public void login() {
		
		System.setProperty("Webdriver.chrome.driver","D:\\79\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		PageFactory.initElements(driver, PageFactorywithoutAnnotations.class);
		txtUsername.sendKeys("admin");
		txtPassword.sendKeys("admin123");
		btnlogin.click();
		
		
	}
	
	

}
