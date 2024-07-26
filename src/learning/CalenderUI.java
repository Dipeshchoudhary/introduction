package learning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CalenderUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//rahulshettyacademy - section 98,99
		
		String monthNumber="6";
		String date="15";
		String year="2027";
		String expectedlist[]= {monthNumber,date,year};
		System.setProperty("webDriver.chrome.driver", "C:/Users/User/Downloads/chromedriver-win64/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		driver.findElement(By.xpath("//div[@class=\"react-date-picker__inputGroup\"]")).click();
		
		driver.findElement(By.cssSelector(".react-calendar__navigation__label__labelText")).click();
		driver.findElement(By.cssSelector(".react-calendar__navigation__label__labelText")).click();
		driver.findElement(By.xpath("//button[text()='"+year+"']")).click();
		
		driver.findElements(By.cssSelector(".react-calendar__year-view__months__month")).get(Integer.parseInt(monthNumber)-1).click();
		driver.findElement(By.xpath("//abbr[text()='"+date+"']")).click();
		
		
		
		List<WebElement>actuallist=driver.findElements(By.cssSelector(".react-date-picker__inputGroup__input"));
		
		
		for(int i=0;i<actuallist.size();i++)
		{
			System.out.println(actuallist.get(i).getAttribute("value"));
			Assert.assertEquals(actuallist.get(i).getAttribute("value"), expectedlist[i]);
		}
		

	}

}
