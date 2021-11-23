package calculatornet;

import org.testng.annotations.Test;

import util.HelperMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;

public class Multiplication_1 {
	
	WebDriver driver;
	HelperMethod hm;
	String expRes;
	
	
  @Test
  public void f() {
	  
	  hm.launchBrowser("chrome");
	  hm.openApp("https://www.calculator.net/");
	  
	  hm.waitforPage(10);
	  
	  hm.clickBtn(By.xpath("//span[contains(text(),'4')]"));
	  hm.clickBtn(By.xpath("//span[contains(text(),'2')]"));
	  hm.clickBtn(By.xpath("//span[contains(text(),'3')]"));

	  hm.clickBtn(By.xpath("//span[contains(text(),'×')]"));

	  hm.clickBtn(By.xpath("//span[contains(text(),'5')]"));
	  hm.clickBtn(By.xpath("//span[contains(text(),'2')]"));
	  hm.clickBtn(By.xpath("//span[contains(text(),'5')]"));
	expRes = "222075";
	boolean flag = hm.verifyElement(By.xpath("//div[@id='sciOutPut']"), expRes);
	System.out.println(flag);

  }
  @BeforeTest
  public void beforeTest() {
	  
	  hm = new HelperMethod(driver);
  }

}
