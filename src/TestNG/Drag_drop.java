package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Drag_drop {
WebDriver driver;
@BeforeTest
public void setup()
{
driver=new ChromeDriver();
}
@BeforeMethod
public void urlloading()
{
driver.get("https://demoqa.com/droppable");
driver.manage().window().maximize();
}
@Test
public void test1()
{
WebElement drag=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
WebElement drop=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
Actions ob=new Actions(driver);
ob.dragAndDrop(drag, drop);
ob.perform();
//text verification of drop
String text=drop.getText();
if(text.equalsIgnoreCase("dropped!"))
{
System.out.println("dropped");
}
else
{
System.out.println("not expected");
}
}
}