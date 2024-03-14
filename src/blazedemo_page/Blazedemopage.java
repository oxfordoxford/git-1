package blazedemo_page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Blazedemopage {
	WebDriver driver;
By blname=By.id("name");
By blcompany=By.id("company");
By blemail=By.id("email");
By blpassword=By.id("password");
By blconfirmpass=By.id("password-confirm");
By blregister=By.xpath("//*[@id=\"app\"]/div/div/div/div/div[2]/form/div[6]/div/button");

public Blazedemopage(WebDriver driver)
{
 this.driver=driver;
}
public void setvalues(String name,String company,String email,String password,String confirm) 
{
driver.findElement(blname).sendKeys(name);
driver.findElement(blcompany).sendKeys(company);
driver.findElement(blemail).sendKeys(email);
driver.findElement(blpassword).sendKeys(password);
driver.findElement(blconfirmpass).sendKeys(confirm);;
}
public void register()
{
 driver.findElement(blregister).click();
}
}