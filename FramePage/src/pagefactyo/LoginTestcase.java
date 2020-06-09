import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginTestcase {
	
	public static void main (String args[]) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","D:\\81\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.gmail.com");
			
			PageFactory.initElements(driver, LoginpageOpject.class);
			Loginpage.username.sendKeys("purusothaman9799@gmail.com");
			Loginpage.next.click();
			Loginpage.passwrd.sendKeys("9566178455");
			Loginpage.submit.click();
			
			PageFactory.initElements(driver,Updateprofile.class);
			Updateprofile.compose.click();
			Updateprofile.cc.sendKeys("purusothaman95@gmail.com");
			Updateprofile.send.click();
			
//			Loginpage.username(driver).sendKeys("purusothaman9799@gmail.com");
//			Loginpage.next(driver).click();
//			Loginpage.passwrd(driver).sendKeys("9566178455");
//			Loginpage.submit(driver).click();
//			Thread.sleep(3000);
//			Updateprofile.compose(driver).click();
//			Updateprofile.cc(driver).sendKeys("purusothaman95@gmail.com");
//			Updateprofile.send(driver).click();
			
		
	}
	}
	


