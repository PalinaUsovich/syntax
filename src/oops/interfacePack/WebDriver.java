package oops.interfacePack;

public interface WebDriver {
    void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElement();

}
class ChromeDriver implements WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("Open browse in Chrome ");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Close browser in Chrome");

    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximize window in Chrome");

    }

    @Override
    public void findElement() {
        System.out.println("Find element in Chrome");

    }
}
class FireFoxDriver implements WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("Open browser in fireFow");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Close browser in FireFox");

    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximize window in FireFox");
    }

    @Override
    public void findElement() {
        System.out.println("Find element in FireFox");
    }
}