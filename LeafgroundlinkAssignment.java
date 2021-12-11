package week2day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafgroundlinkAssignment {
	//TestLeaf - Selenium Playground

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get("http://leafground.com/pages/Link.html");
		driver.findElement(By.xpath("//a[@link='blue']")).click();
		String url = "TestLeaf - Selenium Playground";
		if(url.equals(driver.getTitle())) {
			System.out.println("page is working");
		}
		else {
			System.out.println("page is not working");
		}
		driver.navigate().back();
		//a[text()='Find where am supposed to go without clicking me?']
		driver.findElement(By.xpath("//a[text()='Find where am supposed to go without clicking me?']")).click();
		driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		String value="http://leafground.com/pages/Button.html";
		System.out.println(value);
		if(value.equals(driver.getCurrentUrl())) {
			System.out.println("its goes to button mode");
		}
		else {
			System.out.println("its does not go to the button mode");
		}
		driver.navigate().back();
		driver.findElement(By.xpath("//a[text()='Verify am I broken?']")).click();
		driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		String link ="http://leafground.com/pages/error.html";
		if(link.equals(driver.getCurrentUrl())) {
			System.out.println("its broken");
			
		}
		else {
			System.out.println("its not broken");
		}
		driver.navigate().back();
		driver.findElement(By.xpath("(//a[text()='Go to Home Page'])[2]")).click();
		driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		String newLink="http://leafground.com/home.html";
		System.out.println(newLink);
			
		if(newLink.equals(driver.getCurrentUrl())) {
			System.out.println("The link are same");
			
		}
		else {
			System.out.println("The link are not same");
			
		}
		driver.navigate().back();
		
		List<WebElement> list = driver.findElements(By.xpath("//a[text()='How many links are available in this page?']"));
		System.out.println(list.size());
		

		
		
		
		
		
			
		}
		
		
		}


	


