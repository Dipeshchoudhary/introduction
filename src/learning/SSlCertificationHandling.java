package learning;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSlCertificationHandling {
//rahulshetty academy= section 104
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//to set the proxy
		
		Proxy proxy=new Proxy();
		
		
		ChromeOptions options=new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		
		proxy.setHttpProxy("ipaddress:4444");
		options.setCapability("proxy", proxy);
		
		System.setProperty("webDriver.chrome.driver", "C:/Users/User/Downloads/chromedriver-win64/chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());
		
		
	}

}
