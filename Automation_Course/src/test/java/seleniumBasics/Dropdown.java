package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Dropdown extends Base{

	public void handlingDropdown() {
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement dropdown_1=driver.findElement(By.xpath("//select[@id='dropdowm-menu-1']"));
		Select select=new Select(dropdown_1);
		select.selectByIndex(2);
		
		WebElement dropdown_2=driver.findElement(By.xpath("//select[@id='dropdowm-menu-2']"));
		Select select_2=new Select(dropdown_2);
		select_2.selectByVisibleText("TestNG");
		
		WebElement dropdown_3=driver.findElement(By.xpath("//select[@id='dropdowm-menu-3']"));
		Select select_3=new Select(dropdown_3);
		select_3.selectByValue("jquery");
		
	}
	public static void main(String[] args) {
		
		Dropdown dropdown=new Dropdown();
		dropdown.initializeBrowser();
		dropdown.handlingDropdown();
		//dropdown.driverCloseAndQuit();
		
		// TODO Auto-generated method stub

	}

}
