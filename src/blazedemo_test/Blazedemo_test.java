package blazedemo_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import blazedemo_page.Blazedemopage;

public class Blazedemo_test {
WebDriver driver;
@BeforeTest
public void setup()
{
driver=new ChromeDriver();
}
@BeforeMethod
public void urlloading()
{
driver.get("https://blazedemo.com/register");
}
@Test
public void blazeregister()
{
Blazedemopage oe=new Blazedemopage(driver);
oe.setvalues("Archana","ABC","archana@gmail.com","archanaarchu","archanaarchu");
oe.register();
}
}


