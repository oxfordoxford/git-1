package blazedemo_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import blazedemo_page.Blazedemologin;

public class Blazedemologintest {
WebDriver driver;
@BeforeTest
public void setup()
{
driver=new ChromeDriver();
}
@BeforeMethod
public void urlloading()
{
driver.get("https://blazedemo.com/login");
}
@Test
public void blazeregister()
{
Blazedemologin oe=new Blazedemologin(driver);
oe.setvalues("archana@gmail.com","archanaarchu");
oe.login();
}
}

