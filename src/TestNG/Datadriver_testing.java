package TestNG;

import java.io.File;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datadriver_testing {
WebDriver driver;
String baseurl="https://www.facebook.com/";
@BeforeTest
public void setup()
{
//ChromeOptions options=new ChromeOptions();
//options.addArguments("--remote--allow--origin=*");
driver=new ChromeDriver();
}
@BeforeMethod
public void urlloading()
{
driver.get("baseurl");
}
@Test
public void main()
{
File f=new File("Desktop/sele");
FileInputStream fi=new FileInputStream(f);
XSSFWorkbook wb=new XSSFWorkbook(fi);
XSSFSheet sh=wb.getSheet("sheet1");
System.out.println(sh.getLastRowNum());



for(int i=1;i<=)
{
 String username=sh.
}