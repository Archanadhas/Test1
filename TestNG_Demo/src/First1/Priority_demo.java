package First1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Priority_demo {
	@Test(priority=-1)
	public void google()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\seleniumfile\\chrdri\\chromedriver.exe");
		WebDriver driver=new  ChromeDriver();
		driver.get("https://www.google.com");
	}
	@Test(priority=0)
	public void Quickyes()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\seleniumfile\\chrdri\\chromedriver.exe");
		WebDriver driver=new  ChromeDriver();
		driver.get("https://quickyes.in/");
	}
	@Test(priority=1)
	public void facebook()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\seleniumfile\\chrdri\\chromedriver.exe");
		WebDriver driver=new  ChromeDriver();
		driver.get("https://www.facebook.com");
	}

}
