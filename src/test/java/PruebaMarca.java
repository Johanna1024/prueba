






import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;





public class PruebaMarca {

	WebDriver driver;
	
	
	@Test
	
	
	public void Buscar() {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.arboladourbano.com/");
		driver.findElement(By.id("rdonde-mapa")).click();
		driver.findElement(By.xpath("//*[@id=\"mapa\"]/div[2]/div[2]/div[2]/form/input")).sendKeys("Buenos Aries");
		driver.findElement(By.className("leaflet-control-geocoder-icon")).click();
		driver.findElement(By.xpath("//*[@id=\"mapa\"]/div[2]/div[2]/div[2]/ul/li[1]")).click();
		
	
	}}
	

	

