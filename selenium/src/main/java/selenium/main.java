package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class main {
	public static void main(String[] args) {
	

	
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.google.co.jp");
	// TODO 自動生成されたコンストラクター・スタブ
}
}
