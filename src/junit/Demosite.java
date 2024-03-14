package junit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;



public class Demosite {
ChromeDriver driver;
@Before
public void setup()
{
driver=new ChromeDriver();
driver.get("demo.guru99.com/test/simple_context_menu.html");
driver.manage().window().maximize();
}
@Test
public void test()
{
driver.findElement(By.xpath("//*[@id=\"authentication\"]"));
driver.switchTo().alert().accept();

}
}
