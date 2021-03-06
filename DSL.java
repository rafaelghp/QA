import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DSL {

	private WebDriver driver;
	
	public DSL(WebDriver driver2) {
		this.driver = driver2;
	}

	public void escreveId(String id_campo, String texto) {
		driver.findElement(By.id(id_campo)).sendKeys(texto);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public void clicId(String campo) throws InterruptedException {
		driver.findElement(By.id(campo)).click();
		Thread.sleep(3000);
	}

	public void espera() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(5000);
	}

	public void clickXpath(String endereco) {
		driver.findElement(By.xpath(endereco)).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public void escreveEnterId(String campo, String texto) throws InterruptedException {
		driver.findElement(By.id(campo)).sendKeys(texto);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.findElement(By.id(campo)).sendKeys(Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public void clicaId(String id_campo) {
		driver.findElement(By.id(id_campo)).click();

	}

	public String pegaValor(String campo) {
		return driver.findElement(By.id(campo)).getText();
		

	}
	
	public void clicaSidebar(String menu) {
		driver.findElement(By.linkText(menu)).click();
	}
	

	

}
