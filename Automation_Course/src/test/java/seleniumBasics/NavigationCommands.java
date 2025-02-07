package seleniumBasics;

public class NavigationCommands extends Base {

	public void navigationCommands() {
		driver.navigate().to("https://selenium.qabible.in/");	
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NavigationCommands commands=new NavigationCommands();
		commands.initializeBrowser();
		commands.navigationCommands();
		commands.driverCloseAndQuit();
	}

}
