package pkg;

import java.net.HttpURLConnection;
import java.net.URL;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiplelinks_response {
ChromeDriver driver;
String Baseurl="https://www.google.com";
@Before
public void setup()
{
driver=new ChromeDriver();
driver.get(Baseurl);
}
@Test
public void linkcount()
{
driver.get(Baseurl);
li  = driver.findElement(By.tagName("a"));
for(WebElement s:li)
{
String links=s.getAttribute("href");
verify(links);
}
}
public void verify(String links) {
try
{
URL ob=new URL(links);
HttpURLConnection con=(httpURLconnection)ob.openConnection();
con.connect();
if(con.getResponseCode()==200)
{
System.out.println("valid"+links);
}
else
{
System.out.println("brokenlink"+links);
}
catch(Exception e)
{
System.out.println(e.getMessage());
}
}
