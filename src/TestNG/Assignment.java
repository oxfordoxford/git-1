package TestNG;

import java.io.File;
import java.net.HttpURLConnection;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assignment {
ChromeDriver driver;
String baseurl="https://rishiherbalindia.linker.store/";
@BeforeTest
public void setup()
{
driver=new ChromeDriver();
}
@BeforeMethod
public void urlloading() throws Exception
{
driver.get("https://rishiherbalindia.linker.store");
driver.manage().window().maximize();
Thread.sleep(100);
}
@Test
public void test() throws Exception
{
	Thread.sleep(200);
driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[1]/a/span")).click();
driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[1]/ul/li[1]/a")).click();

driver.findElement(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/div[1]/input")).sendKeys("oxfordoxford021@gmail.com");
driver.findElement(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/div[2]/input")).sendKeys("Lucky123");
driver.findElement(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/div[3]/label/input")).click();
driver.findElement(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/button")).click();

Thread.sleep(100);

driver.findElement(By.xpath("//*[@id=\"register-model-signin-link\"]")).click();
driver.findElement(By.xpath("//*[@id=\"cont-login-with-email\"]/form/div[2]/input")).sendKeys("Lucky123");
driver.findElement(By.xpath("//*[@id=\"cont-login-with-email\"]/form/button[1]")).click();
 Thread.sleep(500);
driver.findElement(By.xpath("//*[@id=\"search\"]/input")).sendKeys("Herbal agro Growth Booster",Keys.ENTER);
Thread.sleep(100);
driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[1]/div/div/div[1]/div/a/img")).click();
driver.findElement(By.xpath("//*[@id=\"prod_cont\"]/div/div[4]/button[1]/span")).click();
driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[4]/a")).click();
driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[1]/div/div/div[1]/div/a/img")).click();
driver.findElement(By.xpath("//*[@id=\"prod_cont\"]/div/div[4]/button[1]/span")).click();
driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[1]/a")).click();
driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[2]/a")).click();
driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[3]/a")).click();
JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript("window.scrollBy(0,5000)","");
driver.findElement(By.xpath("/html/body/div/footer/div[1]/div/div[2]/div[2]/div/ul/li[2]/a")).click();
WebElement privacy=driver.findElement(By.xpath("/html/body/div/footer/div[1]/div/div[2]/div[4]/div/ul/li[1]/a"));
File srnst=privacy.getScreenshotAs(OutputType.FILE);
FileHandler.copy(srnst,new File("./srnst//element.png"));
URL sc=new URL(baseurl);
HttpURLConnection con=(HttpURLConnection)sc.openConnection();
con.connect();
if(con.getResponseCode()==200)
{
System.out.println("valid link---"+baseurl);
}
else
{
System.out.println("invalid link---"+baseurl);
}
}
}


