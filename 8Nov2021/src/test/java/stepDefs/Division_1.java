package stepDefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Division_1 {

	WebDriver driver;
	String actRes;
	
	@Given("calc  application is opened")
	public void calc_application_is_opened() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.calculator.net/");
	}

	@When("user enter {int} and {int}")
	public void user_enter_and(Integer int1, Integer int2) {
		driver.findElement(By.xpath("//span[contains(text(),'4')]")).click();
		driver.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[4]/span[1]")).click();
		driver.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[4]/span[1]")).click();
		driver.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[4]/span[1]")).click();
		
		driver.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[4]/span[4]")).click();

		
		driver.findElement(By.xpath("//span[contains(text(),'2')]")).click();
		driver.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[4]/span[1]")).click();
		driver.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[4]/span[1]")).click();
	}

	@Then("I verify the outcome {string}")
	public void i_verify_the_outcome(String string) {
		actRes = driver.findElement(By.xpath("//div[@id='sciOutPut']")).getText().trim();
		System.out.println(actRes);
		Assert.assertEquals(string, actRes);
	}

}
