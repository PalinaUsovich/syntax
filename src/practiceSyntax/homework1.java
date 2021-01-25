package practiceSyntax;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class homework1 {
    public static String url = "https://www.demoqa.com/browser-windows";
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/palina/Documents/ChromeDriver/chromedriver.exe");

        WebDriver driver =  new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get(url);
        driver.findElement(By.id("tabButton")).click();

    }
}
