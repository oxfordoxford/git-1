package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parentamazon {
ChromeDriver driver;
@Before
public void setup()
{
 driver=new ChromeDriver();
 driver.get("https://www.amazon.in");
 driver.manage().window().maximize();
}
@Test
public void test()
{
driver.findElement(By.xpath("//*[@id='nav-xshop']/a[2]")).click();
}
}

