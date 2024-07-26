package learning;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {
	//rahul shetty = 88

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webDriver.chrome.driver", "C:/Users/User/Downloads/chromedriver-win64/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.xpath("//a[@class=\"blinkingText\"]")).click();
		
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> it=windows.iterator();
		String parentWidow=it.next();
		String childWindow=it.next();
		
		driver.switchTo().window(childWindow);
		
		System.out.println(driver.findElement(By.cssSelector("p.im-para.red")).getText());
		String emailId=driver.findElement(By.cssSelector("p.im-para.red")).getText().split("at")[1].trim().split(" ")[0];
		
		driver.switchTo().window(parentWidow);
		driver.findElement(By.id("username")).sendKeys(emailId);
	}

}
