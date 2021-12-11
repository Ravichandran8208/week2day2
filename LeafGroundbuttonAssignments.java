package week2day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundbuttonAssignments {

	public static void main(String[] args) {
		//http://leafground.com/pages/Button.html
			WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	driver.get("http://leafground.com/pages/Button.html");
	System.out.println("title is "+driver.getTitle());
	if(driver.getTitle().contains("TestLeaf")) {
		System.out.println("I conform the title");
		
	}
	else {
		System.out.println("It is not a title");
	}
	 
	
	driver.findElement(By.id("home")).click();
	 String url = "TestLeaf - Selenium Playground";
	 System.out.println(url);
	
	//String value = driver.getTitle();
	//System.out.println(driver.getTitle());
	
	 if(url.equals(driver.getTitle())) {
		 System.out.println("its working");
	 }
	 else {
		 System.out.println("its not working");
	 }
	 driver.navigate().back();
	
	System.out.println(driver.findElement(By.id("position")).getLocation());
	System.out.println(driver.findElement(By.id("color")).getCssValue("background-color"));
	System.out.println(driver.findElement(By.id("size")).getSize());
	
	

	}

}
