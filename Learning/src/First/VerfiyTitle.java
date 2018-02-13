package First;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerfiyTitle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://gmail.com");
		driver.navigate().to.
		String expectedTitle = "Facebook - Log In or Sign Up";
		String actualTitle = driver.getTitle();
		
		//if (expectedTitle.equals(actualTitle)) {
			//System.out.println("Test case passed");
		//}
		//else
			//{
				//System.out.println("Test Case Failed");
		//}
		driver.navigate().back();
	
	}
}
