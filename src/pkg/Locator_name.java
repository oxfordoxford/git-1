package pkg;

import org.junit.Before;
import org.junit.Test;

public class Locator_name {
	
ChromeDriver driver();
@Before
public void setup()
{
	driver=new ChromeDriver();
	driver.get("https://www.google.com");
}
@Test
public void test()
{
driver.fin