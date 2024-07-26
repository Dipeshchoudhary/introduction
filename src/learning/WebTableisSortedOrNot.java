package learning;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class WebTableisSortedOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//rahulshettyacademy- section116 and 117 important
		
		System.setProperty("webDriver.chrome.driver", "C:/Users/User/Downloads/chromedriver-win64/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		//click on the column
		//capture all the webelement in list
		//capture text of all webelement into new list(original lsit)
		//sort the original list(sorted list)
		//compare original list vs sorted list
		//scan the name column with getText() -> rice and print the price of rice
		
		
		//click on the column
		driver.findElement(By.xpath("(//th[@role=\"columnheader\"])[1]")).click();
		
		//capture all the webelement in list
		List<WebElement>elementlist=driver.findElements(By.xpath("//tbody/tr/td[1]"));
		
		
		//capture text of all webelement into new list(original list)
		List<String>originalList=elementlist.stream().map(s->s.getText()).collect(Collectors.toList());
		
		//sort the original list(sorted list)
		
		List<String>sortedList=originalList.stream().sorted().collect(Collectors.toList());
		
		Assert.assertTrue(originalList.equals(sortedList));
		
		List<String>price;
		
		//scan the name column with getText() -> beans and print the price of beans
		
		do
		{
			List<WebElement>rows=driver.findElements(By.xpath("//tbody/tr/td[1]"));
		price=rows.stream().filter(s->s.getText().contains("rice")).map(s->getPriceVeggie(s)).collect(Collectors.toList());
		
		price.forEach(a->System.out.println(a));
		if(price.size()<1)
		{
			driver.findElement(By.xpath("//a[@aria-label=\"Next\"]")).click();
		}
		}while(price.size()<1);
	}

	private static String getPriceVeggie(WebElement s) {
		// TODO Auto-generated method stub
		
		String pricevalue=s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return pricevalue;
	}

}
