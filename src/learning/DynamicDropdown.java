package learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webDriver.chrome.driver", "C:/Users/User/Downloads/chromedriver-win64/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//chennai- //a[@value="MAA"]
		//banglore- //a[@value="BLR"]
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@value=\"MAA\"]")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("(//a[@value=\"BLR\"])[2]")).click();
		//below xpath is parent child relationship xpath
		driver.findElement(By.xpath("//div[@id=\"glsctl00_mainContent_ddl_destinationStation1_CTNR\"] //a[@value=\"BLR\"]")).click();
		
		//in css selector with class name while we are using if u found space in locator insted of space use "."
		//ex: ui-state-default ui-state-highlight  --> css -> .ui-state-default.ui-state-highlight.ui-state-hover
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-hover")).click();
		

	}

}
