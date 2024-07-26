package learning;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class BrokenLinksHandlingAndSoftAssert {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		
		//rahulshettyacademy - section 109,110
		
		System.setProperty("webDriver.chrome.driver", "C:/Users/User/Downloads/chromedriver-win64/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//in devloper tools->network tab -> click all -> you will find the status code if u find any status code which is greater than or equal to 400 it means its broken
		//java methods will help to call url's and get the status code
		
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		List<WebElement> links=driver.findElements(By.xpath("//li[@class=\"gf-li\"]/a"));
		SoftAssert a=new SoftAssert();
		
		for(WebElement link:links)
		{
			//link.getAttribute("href");
			
			String url=link.getAttribute("href");
			HttpURLConnection conn=(HttpURLConnection)new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int respCode=conn.getResponseCode();
			System.out.println(respCode);
			
			a.assertTrue(respCode<400, "broken link: "+link.getText()+"with status code: "+respCode);
			/*if(respCode>400)
			{
				System.out.println("broken link: "+link.getText()+"with status code: "+respCode);
				Assert.assertTrue(false);
			}*/
		}
		
		a.assertAll();
		/*
		String url=driver.findElement(By.cssSelector("a[href*=\"soapui\"]")).getAttribute("href");
		
		HttpURLConnection conn=(HttpURLConnection)new URL(url).openConnection();
		conn.setRequestMethod("HEAD");
		conn.connect();
		int respCode=conn.getResponseCode();
		System.out.println(respCode);*/
	}

}
