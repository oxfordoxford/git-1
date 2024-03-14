package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediffparent {
ChromeDriver driver;
@Before
public void setup()
{
 driver=new ChromeDriver();
 driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
}
@Test
public void test()
{
 driver.findElement(By.xpath("//*[@id='tb1crtac']/tbody/tr[3]/input")).sendKeys("archana");
 driver.findelement(By.xpath(""))
 
}
}
