package testpkg;

import org.testng.annotations.Test;

import basepkg.Baseclass;
import pagepkg.Fbpage;
import utilities.Excelutil;

public class Fbtest extends Baseclass{
@Test
public void verifyloginwithvalidcred()
{
	Fbpage p1=new Fbpage(driver);
	
//Reading the data from excel file by the specified path
	
	String X1="D:\\sele.xlsx";
	String sheet="sheet1";
	int rowcount=Excelutil.getRowCount(X1, sheet);
	for(int i=1;i<=rowcount;i++)
	{
	String username=Excelutil.getcellvalues(X1, sheet, i, 0);
	System.out.println("username---"+username);
	String pwd=Excelutil.getcellvalues(X1, sheet, i, 1);
	System.out.println("password--"+pwd);
	
	//passing username and password as parameters
	
	//submitting the data by clicking on login button
	
	//p1.setvalues("","");
	
	p1.setvalues(username, pwd);
	p1.login();
	}
}
}
