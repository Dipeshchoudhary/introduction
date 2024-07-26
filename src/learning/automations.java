package learning;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class automations {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webDriver.chrome.driver", "C:/Users/User/Downloads/chromedriver-win64/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//System.setProperty("WebDriver.gecko.driver", "C://Users//User//Downloads//geckodriver//geckodriver.exe");
		//WebDriver driver=new FirefoxDriver();
		
		//System.setProperty("WebDriver.edge.driver", "C://Users//User//Downloads//edge//msedgedriver.exe");
		//WebDriver driver=new EdgeDriver();
		
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		//System.out.println("title:"+driver.getTitle());
		//System.out.println("url:"+driver.getCurrentUrl());
		
		driver.findElement(By.id("inputUsername")).sendKeys("dipesh");
		driver.findElement(By.name("inputPassword")).sendKeys("Pass@123");
		
		driver.findElement(By.className("signInBtn")).click();
		
		//css selector for class name=taggname.classname
		//css selector for id= taggnameid
		//generic tagname[attribute='value']
		
		
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder=\"Name\"]")).sendKeys("john");
		driver.findElement(By.xpath("//input[@placeholder=\"Email\"]")).sendKeys("knedy@gmail.con");
		driver.findElement(By.xpath("//input[@placeholder=\"Phone Number\"]")).sendKeys("9876543210");
		driver.findElement(By.xpath("//button[contains(text(),\"Reset Login\")]")).click();
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		
		driver.findElement(By.xpath("//div/button[1]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("dipesh");
		//when dynamic locator are there that time we use* in css ex. in password locator only "pass" is remain constant and "word" is dynamic that time we use this type of css selecor
	
		driver.findElement(By.cssSelector("input[type*=\"pass\"]")).sendKeys("rahulshettyacademy");
		
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.name("chkboxTwo")).click();
		
		//when dynamic locator are there that time we use* in css ex. in password locator only "pass" is remain constant and "word" is dynamic that time we use this type of css selecor
		driver.findElement(By.cssSelector("button[class*=\"signIn\"]")).click(); 
		
	}

}
