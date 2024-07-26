package learning;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

//rahul shetty academy - 125,126,127 section

public class InvokingMultipleWindowOrTabsUsingOneDriverInstance {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//scenario- navigate to- https://rahulshettyacademy.com/angularpractice/
		//2. fill the "name" field with the first course name available at "https://rahulshettyacademy.com/"
		
		System.setProperty("webDriver.chrome.driver", "C:/Users/User/Downloads/chromedriver-win64/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		Set<String>handles=driver.getWindowHandles();
		
		Iterator<String>it=handles.iterator();
		String parentwindow=it.next();
		String childwindow=it.next();
		
		driver.switchTo().window(childwindow);
		
		driver.get("https://rahulshettyacademy.com/");
		String CourseName=driver.findElements(By.cssSelector("a[href*=\'https://courses.rahulshettyacademy.com/p\']")).get(1).getText();
		
		driver.switchTo().window(parentwindow);
		WebElement name=driver.findElement(By.xpath("//input[@name=\"name\"]"));
		name.sendKeys(CourseName);
		
		//partial screenshot
		File file=name.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("logo.png"));
		
		//get height and width
		
		System.out.println(name.getRect().getDimension().getHeight());
		System.out.println(name.getRect().getDimension().getWidth());
		
		driver.quit();
		
	}

}
