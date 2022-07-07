package org.test.parallel.execution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class OpenParallelBrowser {
	@Parameters({"Browser"})
	@Test
	public void test1(String browser) {
		WebDriver driver=null;
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHAMBHU\\eclipse-workspace\\SeleniumPractice\\TeshNGClass\\driver\\chromedriver1.exe");
			driver=new ChromeDriver();
		}
		else if(browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\SHAMBHU\\eclipse-workspace\\SeleniumPractice\\TeshNGClass\\driver\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else if(browser.equals("ie")) {
			System.setProperty("webdriver.ie.driver", "C:\\Users\\SHAMBHU\\eclipse-workspace\\SeleniumPractice\\TeshNGClass\\driver\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}
		else {
			System.out.println("Nothing Matched......");
		}
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.quit();

	}

}
