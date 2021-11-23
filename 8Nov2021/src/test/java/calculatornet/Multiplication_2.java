package calculatornet;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

public class Multiplication_2 {
	
	WebDriver driver;
	String expRes;
	String actRes;
	
  @Test
  public void f() {
	  
	  driver.get("https://www.calculator.net/");
	  
	    driver.findElement(By.xpath("//span[contains(text(),'4')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'2')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'3')]")).click();

		driver.findElement(By.xpath("//span[contains(text(),'×')]")).click();

		driver.findElement(By.xpath("//span[contains(text(),'5')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'2')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'5')]")).click();
		expRes = "222075";
		actRes = driver.findElement(By.xpath("//div[@id='sciOutPut']")).getText().trim();
		System.out.println(actRes);
		Assert.assertEquals(expRes, actRes);
  }
  
  @BeforeTest
  public void beforeTest() {
	  
	  WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
  }

}
