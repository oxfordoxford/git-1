package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logo_verification {
ChromeDriver driver;
@Before
public void setup()
{
 driver=new ChromeDriver();
 driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
}
@Test
public void display()
{
  WebElement li=driver.findElement(By.xpath("//*[@id=\"wrapper\"]/table[1]/tbody/tr[1]/td[1]/img"));
  Boolean oc=li.isDisplayed();
  if(oc.booleanValue())
  {
   System.out.println("displayed");
  }
  else
  {
  System.out.println("not displayed");
  }
  //radio button selected or not
  WebElement re=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[1]"));
  Boolean m=re.isSelected();
  if(m.booleanValue())
  {
	System.out.println("selected");  
  }
  else
  {
	System.out.println("not selected"); 
  }
  //tick enabled or not
  WebElement v=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[15]/td[2]/table/tbody/tr/td[1]/input"));
  Boolean i=v.isEnabled();
  if(i.booleanValue())
  {
  System.out.println("checked");
  }
  else
  {
  System.out.println("unchecked");
}
}
}
