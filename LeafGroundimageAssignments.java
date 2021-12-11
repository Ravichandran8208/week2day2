package week2day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundimageAssignments {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get("http://leafground.com/pages/Image.html");
		driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/img")).click();
		driver.getTitle();
		System.out.println(driver.getTitle());
		String title= "TestLeaf - Selenium Playground";
		if(title.equals(driver.getTitle())) {
			System.out.println("page is working");
		}
		else {
			System.out.println("page is not working");
		}
		driver.navigate().back();
		driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/img")).click();
		driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("//img[@src='../images/abcd.jpg']")).click();
		driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		String url="http://leafground.com/images/abcd.jpg";
		if(url.equals(driver.getCurrentUrl())){
			System.out.println("image is not broken");
			
		}
		else {
			System.out.println("image is  broken");
		}
		
		driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/img")).click();
		driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
        driver.navigate().back();
        //driver.close();
        
        
	}

}
