package stepDefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstLogin {

	WebDriver driver;
	@Given("User is on home page")
	public void user_is_on_home_page() {
		WebDriverManager.chromedriver().setup();
	   driver=new ChromeDriver();
	   driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	}

	@When("User enter username and password")
	public void user_enter_username_and_password() {
	   driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("Selenium");
	   driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Selenium321");
	}

	@When("click on login button")
	public void click_on_login_button() {
		driver.findElement(By.xpath("//input[@name='proceed']")).click();
	    
	}

	@Then("message is displayed")
	public void message_is_displayed() {
	    
		if(driver.findElement(By.xpath("//b[contains(text(),'Wrong username and password combination.')]")).isDisplayed()) {
			System.out.println("Login failed");
		}
		else {
			System.out.println("Login passed");
		}
	}

}
