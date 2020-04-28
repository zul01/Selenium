package test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
//import org.testng.annotations.Test; 
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//import org.testng.Assert;
//import org.testng.annotations.Test;

public class TestCase {

//@Test(priority=2,enabled=false)
	@Test(priority=2)
public void Login() {
	WebDriver driver =new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("http://google.com");
	driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("Selenium");
	driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[2]/div[2]/ul/li[1]/div/div[2]/div/span")).click();
	//driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div[1]/a/h3")).click();
	//driver.findElement()
	//String url=driver.getCurrentUrl();
	//System.out.println(url);

	String title=driver.getTitle();
	System.out.println(title);
	driver.findElement((By.partialLinkText("www.selenium.dev"))).click();;
	AssertJUnit.assertEquals(driver.getTitle(),"SeleniumHQ Browser Automation");
	driver.close();
}



@Test(priority=1)
public void register() {

	
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://magento.com");
		//driver.findElement(By.xpath("//*[@id=\"block-header\"]/ul/li[9]/a/span[1]/div")).click();
	    driver.findElement(By.className("account-icon")).click();
		driver.findElement(By.xpath("//*[@id=\"register\"]")).click();
		//driver.findElement(By.className("account-icon")).click();
	    driver.findElement(By.id("firstname")).sendKeys("Haider");
	    //driver.findElement(By.id("lastname")).clear();
	    driver.findElement(By.id("lastname")).sendKeys("Muhammad");
	    driver.findElement(By.id("email_address")).sendKeys("zulqernain.haider@hotmail.com");
	    //drop down selections  code
	    
	    Select cp = new Select(driver.findElement(By.id("company_type")));
	    cp.selectByValue("deployment");
	    
	    Select role =new Select(driver.findElement(By.id("individual_role")));
	     //role.selectByValue("technical/developer");
	        role.selectByIndex(2);
	     Select country=new Select(driver.findElement(By.id("country")));
	     //country.selectByValue("AL");
	     country.selectByVisibleText("India");
	    driver.findElement(By.id("password")).sendKeys("abc@123");
	    driver.findElement(By.id("password-confirmation")).sendKeys("abc@123");
	    if(driver.findElement(By.id("agree_terms")).isSelected()) {
	    driver.findElement(By.id("agree_terms")).click();
	}
	    }
}