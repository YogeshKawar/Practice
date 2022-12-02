package ScreenShot_Demo;

import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class C_PerticularElemnt {
public static void main(String[] args) throws Throwable {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	WebElement img = driver.findElement(By.xpath("//img[@alt='Start Selling']"));
	String RS = RandomString.make(4);
	File src = img.getScreenshotAs(OutputType.FILE);
	File dest = new File("C:\\Eclipse Workspace\\StartToEnd\\src\\main\\resources\\Screenshots\\"+RS+".jpg");
	
	FileHandler.copy(src, dest);
}

}
