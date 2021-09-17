package assessment20;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webTable {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		List<WebElement> findElements = driver.findElements(By.xpath("//table//tbody//th"));
		for (int i = 0; i <3; i++) {
			System.out.println(findElements.get(i).getText()+" ");
		}
		
		
		List<WebElement> allcells = driver.findElements(By.xpath("//table//tbody//td"));
		for (int i = 0; i < 18; i++) {
			System.out.println(allcells.get(i).getText()+" ");

		}
		
			
		}
	}


