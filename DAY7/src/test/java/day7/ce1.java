package day7;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;



public class ce1 {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver","C:\\driver\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://demo.wpeverest.com/user-registration/guest-registration-form/");
		String str=driver.getTitle();
		System.out.println(str);
		String expected="Guest Registration Form - User Registration";
		Assert.assertEquals(str,expected);
  }
}
