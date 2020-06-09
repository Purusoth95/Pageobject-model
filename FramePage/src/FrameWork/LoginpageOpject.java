package FrameWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginpageOpject {
	
	@FindBy(name="email")
	public static WebElement userName;
	
	
	@FindBy(name="password")
	public static WebElement password;
	
	
	@FindBy(xpath="/html/body/div[2]/form[1]/button")
	public static WebElement login;
	
	
}	
	
	/*public static WebElement userName(WebDriver driver) {
		return driver.findElement(By.name("email"));
		
		
	}
	
	public static WebElement password(WebDriver driver) {
		return driver.findElement(By.name("password"));
	}
	
	public static WebElement login(WebDriver driver) {
		return driver.findElement(By.xpath("/html/body/div[2]/form[1]/button"));
		
	}*/


