package pkg;

import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class important_notificationhandle {
@Before
public void setup()
{
//chrome browser issue handle command
ChromeOptions options=new ChromeOptions();
options.addArguments("--disable-notification");
driver=new ChromeDriver(options);

//notification handle through selenium
ChromeOptions option=new ChromeOptions();
option.addArguments("--disable-notification");
driver=new ChromeDriver(options)
}
}
