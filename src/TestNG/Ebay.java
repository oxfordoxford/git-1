package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ebay {
ChromeDriver driver;
@BeforeTest
public void setup()
{
driver=new ChromeDriver();
}
@BeforeMethod
public void urlloading()
{
driver.get("https://www.ebay.com/");
}
@Test
public void test()
{
	//implicity wait
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

WebElement mouse=driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[3]/a"));
Actions act=new Actions(driver);
act.moveToElement(mouse);
act.perform();
driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[3]/div[2]/div[1]/nav[1]/ul/li[1]/a")).click();
//explicity wait


}

}
