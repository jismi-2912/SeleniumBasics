package seleniumBasics;

public class BrowserCommands extends Base
{
public void browserCommands()
{
	String url=driver.getCurrentUrl();
	System.out.println(url);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
BrowserCommands browser=new BrowserCommands();
browser.initializeBrowser();
browser.browserCommands();
browser.driverCloseAndQuit();
	}

}
