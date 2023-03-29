package OrangeHRM;

import org.testng.annotations.Test;

public class Ex4testng {
	@Test(priority=1)
	public void one()
	{
		System.out.println("cloudy");
	}
	@Test(priority=4,enabled=true)
	public void two()
	{
		System.out.println("drizzling");
	}
	@Test(dependsOnMethods = "two")
	public void three()
	{
		System.out.println("thundering");
	}
	@Test(dependsOnMethods = "three")
	public void four()
	{
		System.out.println("heavy rain");
	}
	@Test(dependsOnMethods = "four")
	public void five()
	{
		System.out.println("rain stopped");
	}

}
