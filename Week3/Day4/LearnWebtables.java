package week3.day4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebtables {

	public static void main(String[] args) {
		 ChromeDriver driver=new ChromeDriver();
			
			driver.get("https://leafground.com/table.xhtml");
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

			//Locate table
			WebElement table = driver.findElement(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody"));
	
			//To count the number of rows
			List<WebElement> allRows = table.findElements(By.tagName("tr"));
			int rowCount = allRows.size();
			System.out.println("Row count is: "+rowCount);
			
			//To count the number of columns
			List<WebElement> allColumns = driver.findElements(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]//th"));
			
			int columnCount = allColumns.size();
			System.out.println("Column count is: "+columnCount);
			
			//To retrieve a particular value in a table
			WebElement row1Col1Data = driver.findElement(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody/tr[1]/td[1]"));
			
			System.out.println(row1Col1Data.getText());
			
			//To retrieve 1 entire row or 1 entire col data
			List<WebElement> entireRow1Data = driver.findElements(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody/tr[1]/td"));
			
			for (int i = 0; i < entireRow1Data.size(); i++) {
				String text = entireRow1Data.get(i).getText();
				System.out.println(text);
				
			}
			
			//To retrieve entire table data:
		for (int i = 1; i <= rowCount; i++) {
				WebElement row = table.findElement(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody/tr["+i+"]/td"));
			//row1 col1 col2 col3 col4 col5 col6
				//i=1 j=1   tr[1]/td[2]
				for (int j = 1; j <= columnCount; j++) {
				WebElement allData = row.findElement(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody/tr["+i+"]/td["+j+"]"));
				String allDataText = allData.getText();
				System.out.println(allDataText);
			}
			}
			
	}

}
