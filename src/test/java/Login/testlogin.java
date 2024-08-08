package Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class testlogin {
	WebDriver driver;

	nopcommercelogin np;
	@BeforeClass
    public void setup() throws InterruptedException {
		Thread.sleep(3000);
		driver=new ChromeDriver();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(6000);
    	driver.get("https://demo.nopcommerce.com/login?returnUrl=%2Fgift-cards");
    	Thread.sleep(3000);
	} 
	@Test(priority=2)
    public void login() throws InterruptedException {
		Thread.sleep(3000);
	np.setemail("akritibakshi234@gmail.com");
	 Thread.sleep(3000);
	np.setpassword("pinkbun@123");
	 Thread.sleep(3000);
	np.click();
	
	
}
	@Test(priority=3)
	
	public void logo() {
		
		np = new nopcommercelogin(driver);
	}
	@AfterClass

	public void logout() {
		driver.close();
	}

}