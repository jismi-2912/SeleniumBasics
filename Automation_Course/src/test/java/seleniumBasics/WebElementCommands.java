package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementCommands extends Base {
	public void webElementCommands() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement message=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		message.sendKeys("Test");
		WebElement showMessageButton=driver.findElement(By.xpath("//button[@id='button-one']"));
		showMessageButton.click();
		//message.clear();// to clear the values in the field
		WebElement yourMessage=driver.findElement(By.xpath("//div[@id='message-one']"));
		String message1=yourMessage.getText(); // to get the text in console
		System.out.println(message1);
		WebElement buttonShowMessage=driver.findElement(By.xpath("//button[@id='button-one']"));
		System.out.println(buttonShowMessage.getCssValue("background-color"));//to get background color
		System.out.println(buttonShowMessage.getSize());//to get size of the button
		System.out.println(buttonShowMessage.getTagName());
		
		
		
	}

	public static void main(String[] args) {
		
		WebElementCommands element=new WebElementCommands();
		element.initializeBrowser();
		element.webElementCommands();
		element.driverCloseAndQuit();
		// TODO Auto-generated method stub

	}

}
