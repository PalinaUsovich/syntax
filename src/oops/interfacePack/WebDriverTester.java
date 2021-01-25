package oops.interfacePack;

public class WebDriverTester {
    public static void main(String[] args) {
       WebDriver[] driver = {new ChromeDriver(), new FireFoxDriver()};
       for(WebDriver dr: driver){
           dr.closeBrowser();
           dr.findElement();
           dr.maximizeWindow();
           dr.openBrowser();
       }
    }
}
