package learning;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webDriver.chrome.driver", "C:/Users/User/Downloads/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		String[] iteams = { "Cucumber", "Brocolli", "Carrot" };

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		addIteams(driver, iteams);
		
		

	}

	public static void addIteams(WebDriver driver, String[] iteams)  {
		int j = 0;
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(10));

		for (int i = 0; i < products.size(); i++) {
			String[] name = products.get(i).getText().split("-");
			String formattedName = name[0].trim();
			// convert iteams array into arraylist for easyearch
			// check the name you have extracted is present in arraylist or not

			List iteamneeded = Arrays.asList(iteams);

			if (iteamneeded.contains(formattedName)) {
				j++;
				driver.findElements(By.xpath("//div[@class=\"product-action\"]")).get(i).click();

				if (j == iteams.length) {
					break;
				}
			}
		}

		driver.findElement(By.cssSelector("img[alt=\"Cart\"]")).click();

		driver.findElement(By.xpath("//button[contains(text(),\"PROCEED TO CHECKOUT\")]")).click();
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class=\"promoCode\"]")));
		driver.findElement(By.xpath("//input[@class=\"promoCode\"]")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//button[@class=\"promoBtn\"]")).click();

		//WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(10));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());

	}

}
