package Basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class workingWithElement {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Samsung");
	List<WebElement> allEle = driver.findElements(By.xpath("//div[@class='s-suggestion s-suggestion-ellipsis-direction']/span"));
	
	for(WebElement oneEle: allEle) {
		String text = oneEle.getText();
		System.out.println(text);
		if(text.contains("samsung mobile")) {
			oneEle.click();
			break;
		}
	}
}
}
