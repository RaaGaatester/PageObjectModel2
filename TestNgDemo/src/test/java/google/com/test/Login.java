package google.com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	
	@Test
	public void verifyLoginWithValidCredentials () {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(); //chromebrowser launch
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo/index.php?route=product/category&path=52");
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[1]")).click();
		driver.findElement(By.linkText("Login")).click();
		
	}

}
