package OrangeHRM;

import org.testng.annotations.Test;

public class Ex3enabledtestng {
	
	@Test(priority=1)
	public void first()
	{
		System.out.println("apple");
	}
	@Test(priority=2)
	public void second()
	{
		System.out.println("mango");
	}
	@Test(priority=3,enabled = false)
	public void third()
	{
		System.out.println("orange");
	}
	@Test(priority=4)
	public void fourth()
	{
		System.out.println("banana");
	}
	@Test(priority=5)
	public void fifth()
	{
		System.out.println("grapes");
	}

}
