package OrangeHRM;

import org.testng.annotations.Test;

public class Example5include {
	
	@Test(groups= {"fruits"})
	public void apple()
	{
		System.out.println("apple");
	}
	@Test(groups= {"fruits"})
	public void mango()
	{
		System.out.println("mango");
	}
	@Test(groups= {"fruits"})
	public void grapes()
	{
		System.out.println("grapes");
	}
	@Test(groups= {"vegetables"})
	public void carrot()
	{
		System.out.println("carrot");
	}
	@Test(groups= {"vegetables"})
	public void beetroot()
	{
		System.out.println("beetroot");
	}
	@Test(groups= {"vegetables"})
	public void potato()
	{
		System.out.println("potato");
	}

}
