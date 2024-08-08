package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Register {
	WebDriver driver;
	
	 Register(WebDriver driver) {
	this.driver=driver;
}
	//locate elements
	 By header=By.xpath("//h1[normalize-space()='Register'])");
	 //By titleofdetails=By.xpath("//strong[normalize-space()='Your Personal Details'])");
	
	 By female=By.id("gender-female");
	 
	 	 By first_name=By.id("FirstName");
	 By Last_name=By.id("LastName");
	By dateofbirth_day=By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[1]");
	By dateofbirth_month=By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[2]");
	By dateofbirth_year=By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[3]");
By Email=By.name("Email");
By Company_name=By.id("Company");
By Newsletter=By.name("Newsletter");
By Password=By.id("Password");
By Confirm_password=By.id("ConfirmPassword");
By register_button=By.name("register-button");

	 //Actions-----
public boolean  header() {

boolean boo=driver.findElement(header).isDisplayed();
return boo;
}


	


	
public void Femalebuttonclick() {
	WebElement  f=driver.findElement(female);
	
	
	f.click();


	
	
	
}
	public void setFirstname(String firstname) {
		driver.findElement(first_name).sendKeys(firstname);
	}
	
	
	public void setLastname(String lastname) {
		driver.findElement(Last_name).sendKeys(lastname);
	}
	
	public void setdateofbirthday(String dobday) {
	WebElement e=	driver.findElement(dateofbirth_day);
	e.click();
		Select s=new Select(e);
		s.selectByVisibleText("23");
	}
	
	public void setdateofbirthmonth(int m) {
	WebElement month=	driver.findElement(dateofbirth_month);
	month.click();
	Select s1=new Select(month);
	s1.selectByIndex(m);
	}
	
	public void setdateofbirthyear(int y) {
	WebElement year=	driver.findElement(dateofbirth_year);
		year.click();
		Select s2=new Select(year);
		s2.selectByIndex(y);
	}
	public void setemail(String e) {
		driver.findElement(Email).sendKeys(e);
	}
	public void setcompanyname(String c) {
		driver.findElement(Company_name).sendKeys(c);
	}
	public void News_letterenabled() {
		WebElement news=driver.findElement(Newsletter);
		news.isEnabled();
	}
	
	public void setPass_word(String p) {
		driver.findElement(Password).sendKeys(p);
	}
	public void setConfirmPass_word(String pass) {
		driver.findElement(Confirm_password).sendKeys(pass);
	}
	public void Register_buttonclick() {
		driver.findElement(register_button).click();
	}
	
	

}