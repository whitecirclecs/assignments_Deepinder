package day17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1 {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://whitecircleschool.com/dropdowndemo/");
		
		WebElement countries = driver.findElement(By.name("country"));
		
		Select drpDown = new Select(countries);
		//drpDown.selectByVisibleText("MALDIVES");
		drpDown.selectByIndex(2);
		drpDown.selectByValue("68");
		
	}

}
