package week2day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebooklogin{

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" https://en-gb.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Ravina");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("sabapathi");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("63543102678");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("ravi8208");
		WebElement element = driver.findElement(By.id("day"));
		Select select = new Select(element);
		select.selectByValue("2");
		WebElement element2 = driver.findElement(By.id("month"));
		Select dd= new Select(element2);
		dd.selectByValue("3");
		WebElement element3 = driver.findElement(By.id("year"));
		Select ff=new Select(element3);
		ff.selectByValue("1996");
		driver.findElement(By.xpath("//input[@name='sex']")).click();
		
		
				
		
	
		
	
		//driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("pasupathi");
		//driver.findElement(By.xpath(xpathExpression))
		//driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//input[@id='search']")).sendKeys("parithabangal");
		//driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		//driver.findElement(By.xpath("//div[@id='dismissible']/p")).click();
		
	
		

	}

}
