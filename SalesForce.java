package assessment20;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce {

	public static void clickWithJS(WebElement ele) {

	}

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("username")).sendKeys("earth@testleaf.com");
		driver.findElement(By.id("password")).sendKeys("Bootcamp$123");
		WebElement loginButton = driver.findElementById("Login");
		driver.executeScript("arguments[0].click();", loginButton);
		WebElement toggleMenu = driver.findElementByClassName("slds-icon-waffle");
		driver.executeScript("arguments[0].click();", toggleMenu);
		WebElement viewAll = driver.findElementByXPath("//button[text()='View All']");
		driver.executeScript("arguments[0].click();", viewAll);
		WebElement contract = driver.findElement(By.xpath("//p[text()='Contracts']"));
		driver.executeScript("arguments[0].click();", contract);
		WebElement newButton = driver.findElement(By.className("forceActionLink"));
		driver.executeScript("arguments[0].click();", newButton);
		driver.findElement(By.xpath("//input[@title='Search Accounts']")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@title='Search Accounts']")).sendKeys(Keys.DOWN);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@title='Search Accounts']")).sendKeys(Keys.DOWN);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@title='Search Accounts']")).sendKeys(Keys.ENTER);
		WebElement datePicker = driver.findElement(By.xpath("//input[@class=' input']"));
		driver.executeScript("arguments[0].click();", datePicker);
		LocalDate currentdate = java.time.LocalDate.now();
		String valueOf = String.valueOf(currentdate);
		String today = valueOf.substring(9);
        Integer tom = Integer.valueOf(today);
		WebElement datePicker1 = driver.findElement(By.xpath("//span[text()='" + tom + "']/following::span"));
		driver.executeScript("arguments[0].click();", datePicker1);
		driver.findElement(By.xpath("//input[@step='1']")).sendKeys("6");
		driver.findElement(By.xpath("//input[@step='1']")).sendKeys(Keys.ENTER);
		WebElement save = driver.findElement(By.xpath("(//span[text()='Save'])[2]"));
		driver.executeScript("arguments[0].click();", save);
		WebElement findElement2 = driver.findElement(By.xpath("//div[text()='Contract']/following::span"));
		System.out.println("Contract creatred succesfully  - "+findElement2.getText());
		driver.close();
	}

}
