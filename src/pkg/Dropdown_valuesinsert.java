package pkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_valuesinsert {
ChromeDriver driver;
@Before
public void setup()
{
 driver=new ChromeDriver();
 driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
 driver.manage().window().maximize();
}
@Test
public void test()
{
WebElement day=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
Select ob=new Select(day);
ob.selectByIndex(2);
List<WebElement> list =ob.getOptions();
System.out.println(list.size());

WebElement month=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]"));
Select oc=new Select(month);
oc.selectByVisibleText("JAN");
List<WebElement> crt = oc.getOptions();
System.out.println(crt.size());

WebElement year=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[3]"));
Select od=new Select(year);  
od.selectByValue("2022");
List<WebElement> gkj = od.getOptions();
System.out.println(gkj.size());
}
}