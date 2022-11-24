package selenium;



import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class E3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.e-procurement.metro.tokyo.lg.jp/index.jsp");
		driver.findElement(By.className("msg_style")).click();
	
		 WebElement link=driver.findElement(By.tagName("button"));
		 link.click();
		 
		 WebElement link1 = driver.findElement(By.className("cat_name"));
		 //少々待機する
		    try{
		        Thread.sleep(3000);
		       }catch (InterruptedException e){
		    }
		    link1.click();
		    
		    Set<String> set = driver.getWindowHandles();
		    Iterator<String> it = set.iterator();
		    String window1 = it.next();
		    String window2 = it.next();
		    driver.switchTo().window(window2);
		    
		    
		  
		    driver.findElement(By.linkText("発注予定情報")).click();

		    driver.findElement(By.name("StartDateYY")).sendKeys("4");
		    driver.findElement(By.name("StartDateMM")).sendKeys("05");
		    driver.findElement(By.name("StartDateDD")).sendKeys("15");
		    driver.findElement(By.name("EndDateYY")).sendKeys("4");
		    driver.findElement(By.name("EndDateMM")).sendKeys("12");
		    driver.findElement(By.name("EndDateDD")).sendKeys("15");
		   
		    
		    driver.findElement(By.linkText("検索")).click();
		    try{
		        Thread.sleep(1000);
		       }catch (InterruptedException e){
		    }
		    
		    driver.findElement(By.linkText("表示")).click();
		    WebElement table=driver.findElement(By.cssSelector("table.list-data"));
		    List<WebElement> tr=table.findElements(By.tagName("tr"));
		    
		    
		  
		    for(WebElement element:tr) {
		    	List<WebElement> td=element.findElements(By.tagName("td"));
		    	
		    
		    int count=0;
		    for(WebElement elem:td) {
		    	if(count<3) {
		    		System.out.println(elem);
		    	}
		    	count++;
		    }
		    	
		    }
		    	
		    
		   
		    
//		    System.out.println(table);
//		    List<WebElement> trlist=table;
//		   ;
		    
		    
		    
		    
		    
		    
		    
//		    Set<String> set = driver.getWindowHandles();
//		    Iterator<String> it = set.iterator();
//		    String window1 = it.next();
//		    System.out.println(window1);
		    
		 
		 
		 
		 
		 
		
		 
		
		

		// TODO 自動生成されたコンストラクター・スタブ
	}
}