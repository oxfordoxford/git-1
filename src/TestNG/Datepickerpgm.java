package TestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datepickerpgm {
WebDriver driver;
String baseurl="https://www.trivago.com";
@BeforeTest
public void setup()
{
driver=new ChromeDriver();
}
@BeforeMethod
public void urlloading()
{
driver.get(baseurl);
driver.manage().window().maximize();
}
@Test
public void testlogin()
{
driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section[1]/div[2]/div[3]/div/div/button[2]/span/span[2]/span[1]")).click();

while(true)
{
WebElement month=driver.findElement(By.xpath("//*[@id=\"overlay-root\"]/div/section/main/div/div/div/div[2]/div[1]/div/button/time"));
String month1=month.getText();
if(month1.equals("march 2024"))
{
System.out.println(month1);
break;
}
else
{
driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section[1]/div[2]/div[4]/div/div[2]/div/div/div/div[2]/button"));
}
}
List<WebElement>alldates1=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section[1]/div[2]/div[4]/div/div[2]/div/div/div/div[2]/div/div[1]/div[2]/button]"));
for(WebElement dateelement:alldates1)
{
String date=dateelement.getText();
System.out.println(date);
if(date.equals("6"))
{
System.out.println("date selected");
break;
}
}
}
}