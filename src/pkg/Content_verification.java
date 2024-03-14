package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Content_verification {

	public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
    driver.get("https://www.google.com");
    
    String src=driver.getPageSource();
    if(src.contains("gmail"))
    {
    	System.out.println("pass");
    }
    else
    {
    System.out.println("fail");
    }
	}

}
