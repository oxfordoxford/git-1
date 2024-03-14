package pkg;


import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relative_xpath {
ChromeDriver driver;
@Before
public void setup()
{
driver=new ChromeDriver();
driver.get("https://www.facebook.com");
}
@Test
public void titleverification()
{
  driver.findElement(By.xpath("//input[@name='email']")).sendKeys("dhjg");
  driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("hgfyh");
  driver.findElement(By.xpath("//button[@name='login']")).click();
  }
}