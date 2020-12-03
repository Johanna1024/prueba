


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;





public class SearchByFilter {

	WebDriver driver;
	
	
	@Test
	
	
	
		public void Buscar() {
			System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
			driver = new ChromeDriver();
			driver.navigate().to("https://www.arboladourbano.com/");
			driver.findElement(By.id("rdonde-ciudad")).click();
			driver.findElement(By.xpath("//*[@id=\"mas-filtros-btn-container\"]/a")).click();
			driver.findElement(By.id("user_sabores")).click();
			driver.findElement(By.name("Buscar")).click();
		
			
		}
		
}
		
	

