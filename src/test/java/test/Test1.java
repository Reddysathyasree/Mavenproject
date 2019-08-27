package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Test1 {

	static
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jashu\\Desktop\\Latestchrome\\chromedriver.exe");
	}
	@Test
	public void testm()
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://www.google.com");
	System.out.println(driver.getTitle());
	System.out.println("demo");

	}

}
