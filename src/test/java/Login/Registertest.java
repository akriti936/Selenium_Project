package Login;


	

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Assert;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Test;

	public class Registertest {
	WebDriver driver;
		
		//login lp;
		Register lp;
		@BeforeClass
	    public void setup() throws InterruptedException {
			Thread.sleep(3000);
			driver=new ChromeDriver();
			Thread.sleep(3000);
			driver.manage().window().maximize();
			Thread.sleep(6000);
	    	driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
	    	Thread.sleep(3000);
	    }
		@Test(priority=2)
	    public void register() throws InterruptedException {
		Thread.sleep(6000);
		
		//Assert.assertEquals(driver.getTitle(), true);
		lp.Femalebuttonclick();
		lp.setFirstname("akriti");
		Thread.sleep(3000);
		lp.setLastname("bakshi");
		Thread.sleep(3000);
		lp.setdateofbirthday("23");
		Thread.sleep(3000);
		lp.setdateofbirthmonth(1);
		Thread.sleep(9000);
		lp.setdateofbirthyear(1914);
		Thread.sleep(3000);
		lp.setcompanyname("bebo technologies");
		Thread.sleep(3000);
			lp.setemail("akritibakshi234@gmail.com");
			Thread.sleep(3000);
		lp.setPass_word("pinkbun@123");
		Thread.sleep(3000);
		lp.setConfirmPass_word("pinkbun@123");
		Thread.sleep(3000);
		lp.Register_buttonclick();
		Thread.sleep(3000);
		lp.News_letterenabled();
		Thread.sleep(3000);
		
	}
		@Test(priority=1)
		public void header() {
			lp=new Register(driver);}
		
		public void teardown() {
			driver.close();
		}
		
		
		
		
	}
