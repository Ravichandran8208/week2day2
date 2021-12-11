package week2day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.beust.jcommander.internal.Lists;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundDropDownAssignment {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get("http://leafground.com/pages/Dropdown.html");
		WebElement element = driver.findElement(By.id("dropdown1"));
		Select select=new Select (element);
		select.selectByIndex(2);;
		WebElement element2 = driver.findElement(By.name("dropdown2"));
		Select select1= new Select( element2);
		select1.selectByVisibleText("Appium");
		WebElement element3 = driver.findElement(By.id("dropdown3"));
		Select select2=new Select (element3);
		select2.selectByValue("1");
		    WebElement element4 = driver.findElement(By.className("dropdown"));
		   Select list=new Select( element4);
		   List<WebElement> options = list.getOptions();
		   int size= options.size();
		   System.out.println(size);
		   driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[5]/select")).sendKeys("Selenium");
		   WebElement element5 = driver.findElement(By.xpath("//option[text()='Select your programs']"));
		   Select dd=new Select(element5);
		   
		   
		   dd.selectByValue("4");
		   Thread.sleep(2000);
		   dd.selectByIndex(0);
		   Thread.sleep(2000);
		   dd.selectByVisibleText("UFT/QTP");
		 
		   
		   
	
		
		
		

		
		
		
		
		
		
		

	}

}
