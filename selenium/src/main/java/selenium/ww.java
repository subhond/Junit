package selenium;

import java.util.ArrayList;
import java.util.List;

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
		driver.get("https://rakuplus.jp");
		// TODO 自動生成されたコンストラクター・スタブ

driver.findElement(By.name("log")).sendKeys("atsushi.honda@rakus-partners.co.jp");
driver.findElement(By.name("pwd")).sendKeys("atsushi.honda@rakus-partners.co.jp");
driver.findElement(By.className("submit")).click();
driver.get("https://rakuplus.jp/archives/11203");
//リスト内にsectionタグを入れる
		List<WebElement>lis= driver.findElements(By.cssSelector("section.entry-content.cf,div"));
		//countを使ってほしい要素を抜き出す
		int count=0;
		//eleは一番外側のdiv要素 ""内の要素はeleのdivタブ直下のタグ達
		for(WebElement ele:lis) {
			if(count>0) {
				WebElement imgElem=ele.findElement(By.tagName("img"));//画像URL
				String url=imgElem.getAttribute("src");//画像URL
				System.out.println(url);
				WebElement spanElem=ele.findElement(By.tagName("span.big"));//名前
				System.out.println(spanElem);
				
				
			}
			count++;
		}
			





		//タイトルのコンソール表示
	
	
	}
}

