package org.testng.dataprovider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DPParallel {
	@Test(dataProvider="res")
	public void loginFb(String userName,String pass) {
		System.out.println(userName);
		System.out.println(pass);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHAMBHU\\eclipse-workspace\\SeleniumPractice\\TeshNGClass\\driver\\chromedriver2.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys(userName);
		driver.findElement(By.id("pass")).sendKeys(pass);
		driver.quit();
	}
	@DataProvider (name ="res",parallel=true)
	public Object[][] data() {
		return new Object[][] {{"vel","Java"},{"greens","sql"},{"shambhu","selenium"},{"cts","job"}};

	}

}
