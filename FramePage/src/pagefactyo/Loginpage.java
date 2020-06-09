package pagefactyo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage {
	@FindBy(id="identifierId")
	public static WebElement username;
	
	@FindBy(xpath="//*[@id=\\'identifierNext\\']/span/span")
	public static WebElement next;
	
	@FindBy(xpath="//*[@id=\\'passwordNext\\']/span")
	public static WebElement passwrd;
	
	@FindBy(xpath="//*[@id=\\'passwordNext\\']/span")
	public static WebElement submit;
	
	
//	public static WebElement username(WebDriver driver) {
//		return driver.findElement(By.id("identifierId"));
//	}
//	public static WebElement next(WebDriver driver) {
//		return driver.findElement(By.xpath("//*[@id=\'identifierNext\']/span/span"));
//	}
//	public static WebElement passwrd(WebDriver driver) {
//		return driver.findElement(By.name("password"));
//	}
//	public static WebElement submit(WebDriver driver) {
//		return driver.findElement(By.xpath("//*[@id=\'passwordNext\']/span"));
//	}

}
