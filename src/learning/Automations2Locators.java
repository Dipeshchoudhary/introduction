package learning;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

//rahul shetty academy party-43 important

public class Automations2Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String name="rahul";
		
		//System.setProperty("webDriver.chrome.driver", "C:/Users/User/Downloads/chromedriver-win64/chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		
		System.setProperty("WebDriver.gecko.driver", "C://Users//User//Downloads//geckodriver//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String[] password= getPassword(driver);
		
		
		
		//System.setProperty("WebDriver.edge.driver", "C://Users//User//Downloads//edge//msedgedriver.exe");
		//WebDriver driver=new EdgeDriver();
		
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
		
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		
		System.out.println(driver.findElement(By.xpath("//div[@class=\"login-container\"]/h2")).getText());
		Assert.assertEquals(driver.findElement(By.xpath("//div[@class=\"login-container\"]/h2")).getText(), "Hello "+name+",");
		
		driver.findElement(By.xpath("//button[text()=\"Log Out\"]")).click();
		driver.close();
	}
	
	public static String[] getPassword(WebDriver driver) throws InterruptedException
	{
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[contains(text(),\"Reset Login\")]")).click();
		String passwordtext=driver.findElement(By.cssSelector("form p")).getText();
		
		//Please use temporary password 'rahulshettyacademy' to Login.
		
		passwordtext.split("'");  //splitting above sentence with " ' "
		
		//when we will split it will store it in 2 array 
		//1st array password[0]="Please use temporary password "
		//2nd array password[1]="rahulshettyacademy' to Login."
		//we want to extract only rahulshettyacademy thats why we will split it again to password[1]
		
		
		String[] passwordarray=passwordtext.split("'");  //storing the words in array 
		
		passwordarray[1].split("'");  //splitting " rahulshettyacademy' to Login. "
		String [] password=passwordarray[1].split("'"); //stroing it in passwordarray[2]
		
		return password;
		//password[1] will split into 2 different values 
		//0th index=rahulshettyacademy
		//1st index= to Login.
		
		
	}

}
