package TestNG;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fileupload_nexttab {
ChromeDriver driver;
@BeforeTest
public void setup()
{
driver=new ChromeDriver();
driver.get("https://www.ilovepdf.com/pdf_to_word");
}
@BeforeMethod
public void fileupload()
{
driver.manage().window().maximize();
}
@Test
public void fileupload(String p) throws Exception
{
//to copy path to ClipBoard
StringSelection strselection=new StringSelection(p);
Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strselection, null);
//to paste into system window
Robot rob=new Robot();
rob.delay(3000);
 
rob.keyPress(KeyEvent.VK_CONTROL);
rob.keyPress(KeyEvent.VK_V);
rob.keyPress(KeyEvent.VK_V);
rob.keyPress(KeyEvent.VK_ENTER);
}
}
