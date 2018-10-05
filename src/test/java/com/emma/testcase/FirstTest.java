package com.emma.testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

/**
 * 
 * @author remya
 *
 */
public class FirstTest {
	
	WebDriver driver;
	//Adding some extra comment here.
	@BeforeTest
	public void init(){
		System.out.println("Here is my first test");
		System.out.println("os name..." + System.getProperty("os.name").toLowerCase());
		System.out.println(" user dir... " + System.getProperty("user.dir"));
		String chromeDriverPath = System.getProperty("user.dir") + "/src/main/resources/com/emma/driver/chromedriver";
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		driver = new ChromeDriver();
		driver.get("https://www.google.co.uk");
	}
	
	
}
