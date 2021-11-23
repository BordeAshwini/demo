package stepDefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class RediffHooks {

	WebDriver driver;
	
	@Before
	public void  setup() {
		WebDriverManager.chromedriver().setup();
		   driver=new ChromeDriver();
		   
	}
	@After
	public void  terminate() {
		driver.close();
	}
	
	@Given("open  application")
	public void open_application() {
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	}

	@Given("try  to login")
	public void try_to_login() {
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("Selenium");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Selenium321");
		driver.findElement(By.xpath("//input[@name='proceed']")).click();
	}

	@Then("vaildate outcome")
	public void vaildate_outcome() {
		if(driver.findElement(By.xpath("//b[contains(text(),'Wrong username and password combination.')]")).isDisplayed()) {
			System.out.println("Login failed");
		}
		else {
			System.out.println("Login passed");
		}
	      
	}

	@Given("rediffmail is open")
	public void rediffmail_is_open() {
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	}

	@Given("click on forgot password")
	public void click_on_forgot_password() {
		driver.findElement(By.partialLinkText("Forgot")).click();
	}

	@Then("validate title of webpage")
	public void validate_title_of_webpage() {
		  if(driver.getTitle().equals("Password help assistance"))
		    {
		    	System.out.println("Title matches");
		    }
	}
}
