package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ww {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/ja/documentation/");
		// TODO 自動生成されたコンストラクター・スタブ

//		WebElement element =driver.findElement(By.cssSelector("body > div.L3eUgb > div.o3j99.ikrT4e.om7nvf"));}	WebElement element =driver.findElement(By.cssSelector("body > div > div.td-main > div > main > div > h1"));
	System.out.println(driver.getTitle());
	}
}

