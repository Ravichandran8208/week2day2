package week2day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Createcontact {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText( "CRM/SFA")).click();
		driver.findElement(By.xpath("//a[text()='Create Contact']")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Ravichandran");
		driver.findElement(By.id("lastNameField")).sendKeys("Pasupathi");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Rv");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("frd");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Quality");
		driver.findElement(By.id("createContactForm_description")).sendKeys("Rv is my best frd");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("ravipasupathi1997@gmail.com");
		WebElement element = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select select=new Select( element)	;
		select.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Rv  is my best frd");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		driver.getTitle();
		System.out.println(driver.getTitle());
		
		

	}

}
