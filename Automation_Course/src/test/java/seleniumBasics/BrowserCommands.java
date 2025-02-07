package seleniumBasics;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class BrowserCommands extends Base
{
public void browserCommands()
{
	String url=driver.getCurrentUrl();
	System.out.println("Url of the page is : "+url);
	String title=driver.getTitle();
	System.out.println("Title of the page is : "+title);
	String handleId=driver.getWindowHandle();
	System.out.println("Handle id of the page is : "+handleId);
	String pageSource=driver.getPageSource();
	System.out.println("Source Page is : " +pageSource);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
BrowserCommands browser=new BrowserCommands();
browser.initializeBrowser();
browser.browserCommands();
browser.driverCloseAndQuit();
	}

}
