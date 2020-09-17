package First1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day1 {
	@BeforeTest
	public void MobileLogin()
	{
		System.out.println("Belong to day1 Method Name Is:MobileLogin");
                System.out.println("Git hub cloning");
	}
	@AfterTest
	public void MobileLogout()
	{
		System.out.println("Belong to day1 Method Name Is:MobileLogout");
	}
	@Test(dependsOnGroups={"socialsite"})
	public void MobileSendingMessage()
	{
		System.out.println("Belong to day1 Method Name Is: MobileSendingMessage");
	}
	@Test(groups= {"socialsite"})
	public void WhatsupChecking()
	{
		System.out.println("Belong to day1 Method Name Is:WhatsupChecking");
	}
	@Test(groups= {"socialsite"})
	public void Instagram()
	{
		System.out.println("Belong to day1 Method Name Is: Instagram");
	}
	@Test(groups= {"socialsite"})
	public void Facebook()
	{
		System.out.println("Belong to day1 Method Name Is: Facebook");
	}
	@BeforeMethod
	public void Start()
	{
		System.out.println("...................Start....................");
	}
	@AfterMethod
	public void End()
	{
		System.out.println("...............End................");
	}



}
