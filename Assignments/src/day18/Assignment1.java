package day18;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {
	
	//Some Logic
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.amazon.com/");
		
		//Close the modal-dialog box
		driver.findElement(By.cssSelector("body > div.mCRfo9 > div > div > button")).click();
		
		//Click on Login or signup link
		driver.findElement(By.linkText("Login & Signup")).click();
		
		//Enter the email id and password
		driver.findElement(By.cssSelector("body > div.mCRfo9 > div > div > div > div > div.Km0IJL.col.col-3-5 > div > form > div:nth-child(1) > input")).sendKeys("abc@gmail.com");
		driver.findElement(By.cssSelector("body > div.mCRfo9 > div > div > div > div > div.Km0IJL.col.col-3-5 > div > form > div:nth-child(2) > input")).sendKeys("password");

		

		//Learning Git is easier after learning gitbash

	}

}
