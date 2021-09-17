package assessment20;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class flipkart {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[text()='Login']/preceding::button[1]")).click();
		WebElement eleFashion = driver.findElement(By.xpath("//div[text()='Fashion']"));
		
       Actions builder = new Actions(driver);
     
       builder.moveToElement(eleFashion).perform();
       WebElement eleBottom = driver.findElement(By.xpath("//a[@class='_6WOcW9']/following-sibling::a"));
       builder.moveToElement(eleBottom).click().perform();
       WebElement eleContainer = driver.findElement(By.xpath("(//span[text()='Price']//following::div)[3]"));
       WebElement eleTarget = driver.findElement(By.xpath("(//span[text()='Price']//following::div)[7]"));       
       builder.clickAndHold(eleContainer).moveToElement(eleTarget).perform();
       driver.findElement(By.xpath("(//span[text()='Ad']/following::img)[1]")).click();
       String text = driver.findElement(By.xpath("(//div[@class='Bv11UC'])[3]/preceding::div[text()[Contains('Days Return Policy')]]")).getText();
       System.out.println(text.subSequence(0, 2));
		
		
	}

}
