package First1;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class Priority {
	@Test(priority=1)
	public void ApiLogin()
	{
		System.out.println("Belong to day3 Method Name Is:ApiLogin");
	}
	@Test
	public void ApiLogout()
	{
		System.out.println("Belong to day3 Method Name Is:ApiLogout");
	}
	@Test(priority=0)
	public void Data()
	{
		System.out.println("Belong to day3 Method Name Is:Data");
	}
	@Test
	public void Excel()
	{
		System.out.println("Belong to day3 Method Name Is:Excel");
	}
	@Test(priority=-1)
	public void World()
	{
		System.out.println("Belong to day3 Method Name Is:World");
	}
	@Test
	public void Hike()
	{
		System.out.println("Belong to day3 Method Name Is:Hike");
	}



}
