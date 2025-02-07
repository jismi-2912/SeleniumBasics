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
		
		WebElement xpath=driver.findElement(By.xpath("//button[@id='button-one']"));
		WebElement xpath1=driver.findElement(By.xpath("//input[@id='value-a']"));
		WebElement xpath2=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		
		
		
		WebElement xpath3=driver.findElement(By.xpath("//input[@id='value-a']"));
		
		driver.findElement(By.xpath("//input[contains(@id,'-a')]")); // for lengthy xpath
		driver.findElement(By.xpath("//button[text()='Show Message']")); // xpath using text
		driver.findElement(By.xpath("//button[starts-with(text(),'Show')]")); // xpath using partial text
		driver.findElement(By.xpath("//button[@type='button' and @id='button-one'] ")); //using and keyword
		driver.findElement(By.xpath("//button[@id='button-one' or @id='button-one-electroncis'] ")); //using or keyword)
		
		//revision
		
		driver.findElement(By.xpath("//a[@id='others']"));
		driver.findElement(By.xpath("//a[contains(@id,'alert-modal')]"));
		
		//xpath access methods
		
		//tagname[@attribute=’value’]//axesMethodName::tagname ->parent
		driver.findElement(By.xpath("//div[contains(text(),'Single Input Field')]//parent::div[@class='card']"));
		
		//child node->//div[@class='card']//child::button[@id='button-one']
		driver.findElement(By.xpath("//div[@class='card']//child::button[@id='button-one']"));
		//following
		driver.findElement(By.xpath("//button[@id='button-one']//following::div[@class='card']"));
		//preceding
		driver.findElement(By.xpath("//button[@id='button-one']//preceding::div[@class='card']"));
		
		//ancestor
		driver.findElement(By.xpath("//button[@id='button-one']//ancestor::div"));
		
		
}

	public static void main(String[] args) {
		// TODO Auto-generated method 
		Locators loc=new Locators();
		loc.initializeBrowser();
		loc.driverCloseAndQuit();
		loc.locators();

	}

}
