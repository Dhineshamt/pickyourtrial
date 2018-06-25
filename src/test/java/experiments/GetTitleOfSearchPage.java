package experiments;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleOfSearchPage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://pickyourtrail.com");
		Thread.sleep(10000);
		System.out.println(driver.getTitle());

	}

}
