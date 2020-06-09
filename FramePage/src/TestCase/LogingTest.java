package TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import FrameWork.LoginpageOpject;

public class LogingTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\79\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.phptravels.net/admin");
		
		PageFactory.initElements(driver, LoginpageOpject.class);
		LoginpageOpject.userName.sendKeys("dddd");
		LoginpageOpject.password.sendKeys("dddd");
		LoginpageOpject.login.sendKeys("dddd");
		
		
		/*LoginpageOpject pageopject=new LoginpageOpject();
		pageopject.userName(driver).sendKeys("purusothaman@gmail.com");
		pageopject.password(driver).sendKeys("9566178455");
		pageopject.login(driver).click();
		UpdateProfile.Myprofile(driver).click();
		
		
		
		
		
		
		
		
		/*WebElement username=driver.findElement(By.name("email"));
		username.sendKeys("user@phptravels.com");
		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys("demousername");

		WebElement login=driver.findElement(By.xpath("/html/body/div[2]/form[1]/button"));
		login.click();*/




	}

}
