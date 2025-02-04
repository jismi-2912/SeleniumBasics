package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Base {
	//declare a WebDriver variable to control the browser
		public WebDriver driver;
		//method initialize the browser
		public void initializeBrowser()
		{
		driver=new ChromeDriver();
			//driver=new EdgeDriver();
			//open the specific url in minimize screen
			driver.get("https://selenium.qabible.in/");
			driver.manage().window().maximize();//initizlize maximize the screen
			
		}
		public void driverCloseAndQuit()
		{
			//driver.close();
		//driver.quit();//to close all window in current session
		}
		

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Base base=new Base();
			//calls the initializeBrowser()method to launch chrome
			base.initializeBrowser();
			base.driverCloseAndQuit();

		}


}
