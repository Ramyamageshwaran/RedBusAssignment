package marathonSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RedBusTestScript {

	public static void main(String[] args) {
		//ChromeDriver driver=new ChromeDriver();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);
		//Load the URL 
		driver.get("https://www.redbus.in/");
		//maximize the browser
		driver.manage().window().maximize();
		//Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofDays(30));
		
		driver.findElement(By.xpath("//input[@id='src'][1]")).sendKeys("Chennai");
		driver.findElement(By.xpath("//li[text()='Chennai']")).click();
		
		driver.findElement(By.xpath("//input[@id='dest'][1]")).sendKeys("Bangalore");
		
		driver.findElement(By.xpath("//li[text()='Bangalore']")).click();
		
		
		driver.findElement(By.xpath("//input[@id='onward_cal']")).click();
		
		driver.findElement(By.xpath("(//table//tr//td[@class='we day'])[1]")).click();
		
		driver.findElement(By.xpath("//button[@id='search_btn']")).click();
		
		String Result=driver.findElement(By.xpath("//span[@class='f-bold busFound']")).getText();
		System.out.println(Result);
		
		driver.findElement(By.xpath("//label[text()='SLEEPER']")).click();
		
		String newResult=driver.findElement(By.xpath("//span[@class='f-bold busFound']")).getText();
		System.out.println(newResult);
		String currentTitle = driver.getTitle();  
		System.out.println(currentTitle);
		
				
		
		

	}

}
