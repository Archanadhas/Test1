package First1;

import org.testng.annotations.Test;

public class day2 {
	@Test
	public void WebLogin()
	{
		System.out.println("Belong to day2 Method Name Is:WebLogin");
	}
	@Test
	public void WebLogout()
	{
		System.out.println("Belong to day2 Method Name Is:WebLogout");
	}
	@Test(groups= {"socialsite"})
	public void WebFacebook()
	{
		System.out.println("Belong to day2 Method Name Is:WebFacebook");
	}
	@Test(groups= {"socialsite"})
	public void WebWhatsup()
	{
		System.out.println("Belong to day2 Method Name Is:WebWhatsup");
	}


}
