


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;





public class SearchByspecies {

	WebDriver driver;
	
	
	@Test
	
	
	
		public void Buscar() {
			System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
			driver = new ChromeDriver();
			driver.navigate().to("https://www.arboladourbano.com/");
			driver.findElement(By.id("rdonde-ciudad")).click();
			driver.findElement(By.className("caret")).click();
			driver.findElement(By.xpath("//*[@id=\"busca_arboles\"]/div/div[2]/div/div/div/ul/li[2]/a")).click();
			driver.findElement(By.name("Buscar")).click();
		
			
		}
		
}
		
	

	
