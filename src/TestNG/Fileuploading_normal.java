package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fileuploading_normal {
ChromeDriver driver;
@BeforeTest
public void setup()
{
driver=new ChromeDriver();
driver.get("https://demo.guru99.com/test/upload/");
}
@BeforeMethod
public void urlloading()
{
driver.manage().window().maximize();
}
@Test
public void test()
{
driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]")).sendKeys("C:\\Users\\User\\Pictures\\Screenshots");
driver.findElement(By.xpath("//*[@id=\"terms\"]")).click();
driver.findElement(By.xpath("//*[@id=\"submitbutton\"]")).click();
}
}
