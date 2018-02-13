package First;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class path {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.orbitz.com/Flights-Search?trip=roundtrip&leg1=from:Toronto%2C%20ON%2C%20Canada%20(YYZ-Pearson%20Intl.),to:New%20York%2C%20New%20York,departure:02/14/2018TANYT&leg2=from:New%20York%2C%20New%20York,to:Toronto%2C%20ON%2C%20Canada%20(YYZ-Pearson%20Intl.),departure:02/15/2018TANYT&passengers=children:0,adults:2,seniors:0,infantinlap:Y&mode=search");
		
		System.out.println(driver.findElement(By.xpath("(//span[contains(@class,'dollar')])[1]")).getText());
				
	}

}
