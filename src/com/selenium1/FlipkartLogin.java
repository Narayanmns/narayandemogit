package com.selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\Desktop\\practice\\drivers\\chromedriver.exe");
		WebDriver driver=  new ChromeDriver();
		driver.manage().window().maximize();
		
		
	}

}
