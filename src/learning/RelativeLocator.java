package learning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

import org.openqa.selenium.By;

public class RelativeLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webDriver.chrome.driver", "C:/Users/User/Downloads/chromedriver-win64/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		WebElement nameEditbox=driver.findElement(By.xpath("//input[@name=\"name\"]"));
		
		System.out.println(driver.findElement(with(By.tagName("label")).above(nameEditbox)).getText());
		
		//above locator
		WebElement dob=driver.findElement(By.xpath("//label[@for=\"dateofBirth\"]"));
		
		driver.findElement(with(By.tagName("input")).below(dob)).click();
		
		//left locator
		
		WebElement icecreamlabel=driver.findElement(By.xpath("//label[text()=\"Check me out if you Love IceCreams!\"]"));
		driver.findElement(with(By.tagName("input")).toLeftOf(icecreamlabel)).click();
		
		//rightof locator
		
		WebElement radiobtn=driver.findElement(By.id("inlineRadio1"));
		System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(radiobtn)).getText());
		
	}

}
