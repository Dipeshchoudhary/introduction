package learning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webDriver.chrome.driver", "C:/Users/User/Downloads/chromedriver-win64/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.xpath("//input[@id=\"autosuggest\"]")).sendKeys("ind");
		Thread.sleep(2000);
		List<WebElement> options= driver.findElements(By.xpath("//li[@class=\"ui-menu-item\"]/a"));
		
		for(WebElement option:options)
		{
			if(option.getText().equalsIgnoreCase("India"))
			{
				option.click();
				break;
			}
		}
		driver.findElement(By.xpath("//input[@id=\"autosuggest\"]")).clear();
		
		
		driver.findElement(By.xpath("//input[@id=\"autosuggest\"]")).sendKeys("bel");
		Thread.sleep(2000);
		List<WebElement> op=driver.findElements(By.xpath("//li[@class=\"ui-menu-item\"]/a"));
		
		for(WebElement op1:op)
		{
			if(op1.getText().equalsIgnoreCase("Belize"))
			{
				op1.click();
				
			}
		}
		
	}

}
