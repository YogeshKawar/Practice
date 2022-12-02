package ScreenShot_Demo;

import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PerticularElement {
public static void main(String[] args) throws Throwable {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
    driver.get("https://www.google.com/");
    //i want to take screenshot of particular element(inspect element store in ref variable)
    WebElement gTitle = driver.findElement(By.xpath("//img[@class='lawsonCta']"));
    File src = gTitle.getScreenshotAs(OutputType.FILE);
    //store at destination
    File dest=new File("C:\\Eclipse Workspace\\StartToEnd\\src\\main\\resources\\Screenshots\\Googletitle.jpg");
    //source to destination
    FileHandler.copy(src, dest);

}
}
