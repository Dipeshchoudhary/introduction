package learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webDriver.chrome.driver", "C:/Users/User/Downloads/chromedriver-win64/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		
		//System.out.println(driver.findElements(By.tagName("iframe")).size());  //to know how many frames present on webpage
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class=\"demo-frame\"]")));
		driver.findElement(By.id("draggable")).click();
		
		Actions a=new Actions(driver);
		WebElement Source=driver.findElement(By.id("draggable"));
		WebElement destination=driver.findElement(By.id("droppable"));
		a.dragAndDrop(Source, destination).build().perform();
		
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[@href=\"/resources/demos/droppable/accepted-elements.html\"]")).click();
		
		
		
	}

}
