package First1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DependOnMethod {
	WebDriver driver;
	@Test
	public void openbrowser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\seleniumfile\\chrdri\\chromedriver.exe");
		 driver=new  ChromeDriver();
	}
	@Test(dependsOnMethods={"openbrowser"})
	public void Enterurl()
	{
		driver.get("https://demoqa.com/droppable");
	}
	@Test(dependsOnMethods={"openbrowser","Enterurl"})
	public void Title()
	{
		System.out.println(driver.getTitle());
	}

}
