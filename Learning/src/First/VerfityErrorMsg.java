package First;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerfityErrorMsg {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://facebook.com");
		driver.findElement(By.id("email")).sendKeys("superman@gmail.com");
		
		driver.findElement(By.id("pass")).sendKeys("password");
		
		driver.findElement(By.id("loginbutton")).click();
		
		String expectedMessage = "The password you’ve entered is incorrect. Forgot Password?";
		
		String actualMessage = driver.findElement(By.cssSelector("#globalContainer > div.uiContextualLayerPositioner._572t.uiLayer > div > div > div")).getText();
				if (expectedMessage.equals(actualMessage)) {
					System.out.println("Text Matches");
				}
				else
				{
					System.out.println("Text not matched");
				}
						
			driver.close();			
	}
	}


