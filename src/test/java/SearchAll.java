


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;





public class SearchAll {

	WebDriver driver;
	
	@Test
	
	public void Buscarpornombre() {
		
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.arboladourbano.com/");
		driver.findElement(By.id("rdonde-ciudad")).click();
		driver.findElement(By.name("Buscar")).click();
		

	}
	
	
}