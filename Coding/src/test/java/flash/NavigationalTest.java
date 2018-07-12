package flash;

import org.testng.annotations.Test;

import java.awt.SystemColor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;

public class NavigationalTest {
	WebDriver driver;
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");
	 ChromeOptions options=new ChromeOptions();
	 options.addArguments("window_size=1400,800");
	 options.addArguments("headless");
	 driver=new ChromeDriver(options);
	  driver.get("http://demo.elixiraid.com/index.php");
	  driver.findElement(By.xpath("//input[@id='UserLogin_username']")).sendKeys("admin");
	  driver.findElement(By.xpath("//input[@id='UserLogin_password']")).sendKeys("admin");
	  driver.findElement(By.xpath("//input[contains(@class,'btn bg-teal btn-block')]")).click();
	  driver.findElement(By.xpath("//span[contains(text(),'Settings')]")).click();
	  System.out.println("the browser page will displayed:"+driver.getTitle());
	  driver.quit();
	  System.out.println("the browser closed");
	  //driver.navigate().forward();
  }
  @BeforeTest
  public void beforeTest() {
  }

}
