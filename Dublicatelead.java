package week2day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dublicatelead {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText( "CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		//driver.findElement(By.className("x-tab-strip-text ")).click();
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("ravi1997@gmail.com");
		Thread.sleep(2000);
		 driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		    Thread.sleep(6000);
		    String text = driver.findElement(By.xpath("//a[text()='ravi']")).getText();
		    System.out.println(text);
		    driver.findElement(By.xpath("//a[text()='ravi']")).click();
		    driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
		    String text1= driver.getTitle();
		    System.out.println(text1);
		    driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		    String text2 = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		    System.out.println(text2);
		    if(text.equalsIgnoreCase(text2)) {
		    	System.out.println("lead duplicate");
			    driver.close();
		
		 
		
		

	}

	}
}
