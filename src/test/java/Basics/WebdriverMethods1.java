package Basics;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebdriverMethods1 {
public static void main(String[] args) throws Throwable {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	//to get url
	driver.get("https://www.google.com/");
	//to maximize window
	driver.manage().window().maximize();
	//get dimension
	Dimension d1 = driver.manage().window().getSize();
	System.out.println(d1);
	//navigate
	driver.navigate().to("https://www.amazon.in/");
	//getTitle
	System.out.println(driver.getTitle());
	//get current url
	System.out.println(driver.getCurrentUrl());
	//set dimensions
	Dimension d = new Dimension(600, 500);
	driver.manage().window().setSize(d);
	//set position
	Point p = new Point(100, 50);
	driver.manage().window().setPosition(p);
	System.out.println(driver.manage().window().getPosition());
	
	//sleep
	Thread.sleep(2000);
	//to close current window
	driver.quit();
}
}
