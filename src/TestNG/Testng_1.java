package TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testng_1 {

@BeforeTest
public void setup()
{
 System.out.println("browser open");
}
@BeforeMethod
public void urlopen()
{
 System.out.println("url open");
}
@Test(priority=3)
public void test1()
{
System.out.println("test1");
}
@Test(priority=2,invocationCount=2,dependsOnMethods= {"test1"})
public void test2()
{
System.out.println("test2");
}
@Test
public void test3()
{
System.out.println("test3");
}
@AfterMethod
public void report()
{
 System.out.println("report");
}
@AfterTest
public void close()
{
System.out.println("browserclose");
}
}
