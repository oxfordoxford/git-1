package pkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_dropdown {
ChromeDriver driver;
@Before
public void setup()
{
 driver=new ChromeDriver();
 driver.get("https://www.facebook.com/signup");
}
@Test
public void test()
{
 WebElement date=driver.findElement(By.xpath("//*[@id=\"day\"]"));
 Select oc=new Select(date);
 oc.selectByIndex(8);
 List<WebElement> li = oc.getOptions();
 System.out.println(li.size());
 
 WebElement month=driver.findElement(By.xpath("//*[@id=\"month\"]"));
 Select ob=new Select(month);
 ob.selectByVisibleText("Jan");
  List<WebElement> le = oc.getOptions();
  System.out.println(le.size());
 
 WebElement year=driver.findElement(By.xpath("//*[@id=\"year\"]"));
 Select od=new Select(year);
 od.selectByValue("2022");
 List<WebElement> m= od.getOptions();
 System.out.println(m.size());
}
}
