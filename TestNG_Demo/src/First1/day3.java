package First1;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class day3 {
	@BeforeSuite
	public void ApiLogin()
	{
		System.out.println("Belong to day3 Method Name Is:ApiLogin");
	}
	@AfterSuite
	public void ApiLogout()
	{
		System.out.println("Belong to day3 Method Name Is:ApiLogout");
	}
	@Test
	public void Data()
	{
		System.out.println("Belong to day3 Method Name Is:Data");
	}
	@Test(enabled=false)
	public void Excel()
	{
		System.out.println("Belong to day3 Method Name Is:Excel");
	}
	@Test
	public void World()
	{
		System.out.println("Belong to day3 Method Name Is:World");
	}
	@Test(groups= {"socialsite"})
	public void Hike()
	{
		System.out.println("Belong to day3 Method Name Is:Hike");
	}


}
