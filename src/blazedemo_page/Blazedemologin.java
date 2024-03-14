package blazedemo_page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Blazedemologin {
WebDriver driver;
By blemail=By.id("email");
By blpass=By.id("password");
By bllogin=By.xpath("//*[@id=\"app\"]/div/div/div/div/div[2]/form/div[4]/div/button");
}
public Blazedemologin(WebDriver driver)
{
 this.driver=driver;
}
public void setvalues(String email,String password)
{
driver.findElement(blemail).sendKeys(email);
driver.findElement(blpass).sendKeys(password);
}
public void login()
{
driver.findElement(bllogin).click();
}
}