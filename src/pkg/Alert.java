package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
ChromeDriver driver;
@Before
public void setup()
{
driver=new ChromeDriver();
driver.get("file:///C:/Users/User/Desktop/alert.html");
}
@Test
public void Buttonverify()
{
driver.findElement(By.xpath("/html/body/input[1]")).click();
//driver.switchTo().alert().accept();

//multiple activities
Alert a=driver.switchTo().alert();
String text=a.gettext();
if(text.equals("hello i am alert box"))
{
System.out.println("pass");
}
else
{
System.out.println("fail");
}
}
a.accept();
driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("lucky");
driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("one");
}

