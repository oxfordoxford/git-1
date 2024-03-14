package TestNG;

import org.testng.annotations.Test;

public class Testng_grouping {
@Test(groups= {"sanity"})
public void main1()
{
System.out.println("this is main1");
}
@Test(groups= {"sanitry","smoke"})
public void main2()
{
System.out.println("this is main2");
}
@Test(groups= {"regression"})
public void main3()
{
System.out.println("this is main3");
}
@Test(groups= {"sanitry","regression"})
public void main4()
{
System.out.println("this is main4");
}
@Test(groups= {"regression"})
public void main5()
{
System.out.println("this is main5");
}
}
