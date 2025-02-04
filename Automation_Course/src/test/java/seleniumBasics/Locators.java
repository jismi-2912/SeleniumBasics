package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base {
	
	public void locators() {
		driver.get("https://selenium.qabible.in/");
		WebElement message=driver.findElement(By.id("single-input-field"));
		WebElement message1=driver.findElement(By.className("form-control"));
		WebElement showMessageButton=driver.findElement(By.tagName("button"));
		WebElement nameLocator=driver.findElement(By.name("keywords"));
		WebElement linktext=driver.findElement(By.linkText("Checkbox Demo"));
		WebElement partialText=driver.findElement(By.partialLinkText("Checkbox"));
		
		//css selector tagname[attribute=’value’]
		WebElement cssLocator= driver.findElement(By.cssSelector("button[id='button-one']"));
		//xpath //tagname[@attribute=’value’]
		
		
}

	public static void main(String[] args) {
		// TODO Auto-generated method 
		Locators loc=new Locators();
		loc.initializeBrowser();
		loc.driverCloseAndQuit();
		loc.locators();

	}

}
