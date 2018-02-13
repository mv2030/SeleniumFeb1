package First;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selector {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amtrak.com/home?&utm_source=google&utm_medium=cpc&utm_term=amtrak%20train&utm_campaign=Amtrak+Intl+%7CCA%7CAmtrak+Brand+Awareness%7CDFCB&utm_content=soUcQjIuS|dc_pcrid_|74138253722&WT.mc_t=Amtrak+Intl+%7CCA%7CAmtrak+Brand+Awareness%7CDFCB&WT.mc_n=google|amtrak%20train&WT.mc_r=365&buf=999&WT.srch=1&CMP=search_international");
		
		driver.findElement(By.cssSelector("#page-content > section:nth-child(2) > div.carousel-feature-area.basecomponent.parbase > section > div.carousel-feature-area__dropdown-content > div.carousel-feature-area__carousel > div > div > article:nth-child(1) > div > div > div > div.feature-area__content_text-area > a")).click();
		
		System.out.println("the next pge");
	}

}
