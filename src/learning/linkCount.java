package learning;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkCount {

	//rahul shetty academy section 93 and 94
	//req 1 - count the links on the page
	//req 2 - count the links on the footer page
	//req 3 - count the links form the first column of the footer
	//req 4 - click on each link and check if the link is working or not
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webDriver.chrome.driver", "C:/Users/User/Downloads/chromedriver-win64/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		WebElement footerDriver=driver.findElement(By.id("gf-BIG")); //limiting webDriver scope only for footer section
		
		System.out.println(footerDriver.findElements(By.tagName("a")).size());
		
		//req 3 - count the links form the first column of the footer
		WebElement columnDriver=driver.findElement(By.xpath("//div[@id=\"gf-BIG\"]/table/tbody/tr/td[1]/ul"));
		
		System.out.println(columnDriver.findElements(By.tagName("a")).size());
		
		
		//req 4 - click on each link and check if the link is working or not
		
		for(int i=1;i<columnDriver.findElements(By.tagName("a")).size();i++)
		{
			String clickOnLinkTab=Keys.chord(Keys.CONTROL,Keys.ENTER);
			
			columnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinkTab);
			Thread.sleep(9000);
		}
			
			Set<String> abc=driver.getWindowHandles();
			Iterator<String> it=abc.iterator();
			
			while(it.hasNext())
			{
				driver.switchTo().window(it.next()); //to get window id
				System.out.println(driver.getTitle());
			}
			
			
		
	}

}
