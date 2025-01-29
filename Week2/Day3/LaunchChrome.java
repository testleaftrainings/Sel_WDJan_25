package week2.day3;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome extends LaunchEdge {
	
	@Override
	public void launchBrowser() {
		super.launchBrowser();
		ChromeDriver driver=new ChromeDriver();

	}
	
	public static void main(String[] args) {
		LaunchChrome browser=new LaunchChrome();
		browser.launchBrowser();
		
	}

}
