package pkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Junitpgm {
@Before
public void bwropn()
{
	System.out.println("urlload");
}
@Test
public void test()
{
	System.out.println("test1");
}
@After
public void bwrcls()
{
System.out.println("browserclose");	
}
}