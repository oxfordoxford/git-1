package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
ChromeDriver driver;
@Before
public void setup()
{
 driver=new ChromeDriver();
 driver.get("https://www.amazon.in");
 driver.manage().window().maximize();
}
@Test
public void test() throws InterruptedException
{
Thread.sleep(10);
driver.findElement(By.xpath("//*[@id='nav-search-bar-form']/div[2]/div[1]/input")).sendKeys("Mobiles",Keys.ENTER);
driver.findElement(By.xpath("//*[@id='nav-cart-count-container']/span[1]")).click();
driver.findElement(By.xpath("//*[@id='nav-tools']/a[2]/div")).click();
driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("lucky@gmail.com");
driver.findElement(By.xpath("//input[@id='continue']")).click();
driver.navigate().back();
driver.navigate().back();
driver.findElement(By.xpath("//*[@id='nav-xshop']/a[7]")).click();
driver.findElement(By.xpath("//*[@id='nav-main']/div[1]/a")).click();
}
}
