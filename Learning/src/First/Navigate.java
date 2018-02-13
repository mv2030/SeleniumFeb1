package First;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.gmail.com");
		
		
		driver.navigate().to("https://www.facebook.com");
		
		Thread.sleep(2000);
		driver.navigate().back();
		//driver.navigate().forward();
		
	}

}
