import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

public class busca_filtroPorRegiao_teste {
	FirefoxDriver driver =  new FirefoxDriver();
	private DSL dsl;
	private buscaEmpresaPage page;
	private hmlLogin login;
	@Before
	public void inicializa() throws InterruptedException{
		driver.get("https://hmlplat.econodata.com.br/#/login");
		dsl = new DSL(driver);
		page = new buscaEmpresaPage(driver);
		driver.manage().window().maximize();
		login.preecheEmail("rafael.s.lima92@hotmail.com");
		login.preencheSenha("frango");
		login.entrar();
		dsl.clicaSidebar("Empresas");
		Thread.sleep(1000);
		page.regiao();
		Thread.sleep(1000);
		
		
	}
	
	@After	public void finaliza() throws InterruptedException {
		driver.quit();
		Thread.sleep(1000);}
	

	@Test
	public  void testeRegiaoAc() throws InterruptedException {	
		page.setEstado("AC-ACRE");
		page.atualizarPesquisa();
		dsl.espera();
		Assert.assertNotEquals(page.resultado(), "0");
		Assert.assertNotEquals(page.resultado(), "19.538.383");
		Assert.assertEquals(page.resultado(), "43.059");
		
}
	@Test
	public  void testeRegiaoAl() throws InterruptedException {
		page.setEstado("AL-ALAGOAS");
		page.atualizarPesquisa();
		dsl.espera();
		Assert.assertNotEquals(page.resultado(), "0");
		Assert.assertNotEquals(page.resultado(), "19.538.383");
		Assert.assertEquals(page.resultado(), "171.026");		
}
	@Test
	public  void testeRegiaoAp() throws InterruptedException {
		page.setEstado("AL-ALAGOAS");
		dsl.clicaId("btn-filtrar");
		dsl.espera();
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "0");
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "19.538.383");
		Assert.assertEquals(dsl.pegaValor("qtd-registros"), "40.630");		
}
	@Test
	public  void testeRegiaoAm() throws InterruptedException {
		dsl.escreveEnterId("busca-filtro-estados","AM-AMAZONAS");
		dsl.clicaId("btn-filtrar");
		dsl.espera();
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "0");
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "19.538.383");
		Assert.assertEquals(dsl.pegaValor("qtd-registros"), "180.059");		
}
	@Test
	public  void testeRegiaoBa() throws InterruptedException {
		dsl.escreveEnterId("busca-filtro-estados","BA-BAHIA");
		dsl.clicaId("btn-filtrar");
		dsl.espera();
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "0");
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "19.538.383");
		Assert.assertEquals(dsl.pegaValor("qtd-registros"), "996.266");		
}
	@Test
	public  void testeRegiaoCe() throws InterruptedException {
		dsl.escreveEnterId("busca-filtro-estados","CE-CEAR�");
		dsl.clicaId("btn-filtrar");
		dsl.espera();
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "0");
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "19.538.383");
		Assert.assertEquals(dsl.pegaValor("qtd-registros"), "575.554");		
}
	@Test
	public  void testeRegiaoDf() throws InterruptedException {
		dsl.escreveEnterId("busca-filtro-estados","DF-DISTRITO FEDERAL");
		dsl.clicaId("btn-filtrar");
		dsl.espera();
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "0");
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "19.538.383");
		Assert.assertEquals(dsl.pegaValor("qtd-registros"), "338.530");		
}
	@Test
	public  void testeRegiaoEs() throws InterruptedException {
		dsl.escreveEnterId("busca-filtro-estados","ES-ESP�RITO SANTO");
		dsl.clicaId("btn-filtrar");
		dsl.espera();
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "0");
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "19.538.383");
		Assert.assertEquals(dsl.pegaValor("qtd-registros"), "423.120");		
}
	@Test
	public  void testeRegiaoGo() throws InterruptedException {
		dsl.escreveEnterId("busca-filtro-estados","GO-GO�AS");
		dsl.clicaId("btn-filtrar");
		dsl.espera();
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "0");
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "19.538.383");
		Assert.assertEquals(dsl.pegaValor("qtd-registros"), "654.602");		
}
	@Test
	public  void testeRegiaoMa() throws InterruptedException {
		dsl.escreveEnterId("busca-filtro-estados","MA-MARANH�O");
		dsl.clicaId("btn-filtrar");
		dsl.espera();
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "0");
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "19.538.383");
		Assert.assertEquals(dsl.pegaValor("qtd-registros"), "274.507");		
}
	@Test
	public  void testeRegiaoMt() throws InterruptedException {
		dsl.escreveEnterId("busca-filtro-estados","MT-MATO GROSSO");
		dsl.clicaId("btn-filtrar");
		dsl.espera();
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "0");
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "19.538.383");
		Assert.assertEquals(dsl.pegaValor("qtd-registros"), "342.602");		
}
	@Test
	public  void testeRegiaoMs() throws InterruptedException {
		dsl.escreveEnterId("busca-filtro-estados","MS-MATO GROSSO DO SUL");
		dsl.clicaId("btn-filtrar");
		dsl.espera();
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "0");
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "19.538.383");
		Assert.assertEquals(dsl.pegaValor("qtd-registros"), "259.358");		
}
	@Test
	public  void testeRegiaoMg() throws InterruptedException {
		dsl.escreveEnterId("busca-filtro-estados","MG-MINAS GERAIS");
		dsl.clicaId("btn-filtrar");
		dsl.espera();
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "0");
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "19.538.383");
		Assert.assertEquals(dsl.pegaValor("qtd-registros"), "2.036.723");		
}
	@Test
	public  void testeRegiaoPa() throws InterruptedException {
		dsl.escreveEnterId("busca-filtro-estados","PA-PAR�");
		dsl.clicaId("btn-filtrar");
		dsl.espera();
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "0");
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "19.538.383");
		Assert.assertEquals(dsl.pegaValor("qtd-registros"), "370.538");		
}
	@Test
	public  void testeRegiaoPb() throws InterruptedException {
		dsl.escreveEnterId("busca-filtro-estados","PB-PARA�BA");
		dsl.clicaId("btn-filtrar");
		dsl.espera();
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "0");
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "19.538.383");
		Assert.assertEquals(dsl.pegaValor("qtd-registros"), "239.172");
}
	@Test
	public  void testeRegiaoPr() throws InterruptedException {
		dsl.escreveEnterId("busca-filtro-estados","PR-PARAN�");
		dsl.clicaId("btn-filtrar");
		dsl.espera();
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "0");
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "19.538.383");
		Assert.assertEquals(dsl.pegaValor("qtd-registros"), "1.334.241");		
}
	@Test
	public  void testeRegiaoPe() throws InterruptedException {
		dsl.escreveEnterId("busca-filtro-estados","PE-PERNANBUCO");
		dsl.clicaId("btn-filtrar");
		dsl.espera();
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "0");
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "19.538.383");
		Assert.assertEquals(dsl.pegaValor("qtd-registros"), "548.136");		
}
	@Test
	public  void testeRegiaoPi() throws InterruptedException {
		dsl.escreveEnterId("busca-filtro-estados","PI-PIAU�");
		dsl.clicaId("btn-filtrar");
		dsl.espera();
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "0");
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "19.538.383");
		Assert.assertEquals(dsl.pegaValor("qtd-registros"), "175.152");		
}
	@Test
	public  void testeRegiaoRj() throws InterruptedException {
		dsl.escreveEnterId("busca-filtro-estados","RJ-RIO DE JANEIRO");
		dsl.clicaId("btn-filtrar");
		dsl.espera();
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "0");
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "19.538.383");
		Assert.assertEquals(dsl.pegaValor("qtd-registros"), "1.801.729");		
}
	@Test
	public  void testeRegiaoRn() throws InterruptedException {
		dsl.escreveEnterId("busca-filtro-estados","RN-RIO GRANDE DO NORTE");
		dsl.clicaId("btn-filtrar");
		dsl.espera();
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "0");
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "19.538.383");
		Assert.assertEquals(dsl.pegaValor("qtd-registros"), "231.980");		
}
	@Test
	public  void testeRegiaoRo() throws InterruptedException {
		dsl.escreveEnterId("busca-filtro-estados","RO-ROND�NIA");
		dsl.clicaId("btn-filtrar");

		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "0");
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "19.538.383");
		Assert.assertEquals(dsl.pegaValor("qtd-registros"), "123.538");		
}
	@Test
	public  void testeRegiaoRr() throws InterruptedException {
		dsl.escreveEnterId("busca-filtro-estados","Rr-RORAIMA");
		dsl.clicaId("btn-filtrar");
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "0");
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "19.538.383");
		Assert.assertEquals(dsl.pegaValor("qtd-registros"), "31.522");
}
	
	@Test
	public  void testeRegiaoRs() throws InterruptedException {
		dsl.clicaId("filtro-regiao");
		dsl.escreveEnterId("busca-filtro-estados","RS-RIO GRANDE DO SUL");
		dsl.clicaId("btn-filtrar");
		dsl.espera();
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "0");
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "19.538.383");
		Assert.assertEquals(dsl.pegaValor("qtd-registros"), "1.331.716");
		
		
}
	
	@Test
	public  void testeRegiaoSc() throws InterruptedException {
		dsl.escreveEnterId("busca-filtro-estados","SC-SANTA CATARINA");
		dsl.clicaId("btn-filtrar");
		dsl.espera();
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "0");
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "19.538.383");
		Assert.assertEquals(dsl.pegaValor("qtd-registros"), "887.186");		
}
	@Test
	public  void testeRegiaoSp() throws InterruptedException {
		dsl.escreveEnterId("busca-filtro-estados","SP-S�O PAULO");
		dsl.clicaId("btn-filtrar");
		dsl.espera();
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "0");
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "19.538.383");
		Assert.assertEquals(dsl.pegaValor("qtd-registros"), "5.895.429");		
}
	@Test
	public  void testeRegiaoSe() throws InterruptedException {
		dsl.escreveEnterId("busca-filtro-estados","SE-SERGIPE");
		dsl.clicaId("btn-filtrar");
		dsl.espera();
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "0");
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "19.538.383");
		Assert.assertEquals(dsl.pegaValor("qtd-registros"), "115.749");		
	}
	
	@Test
	public  void testeRegiaoTo() throws InterruptedException {
		dsl.escreveEnterId("busca-filtro-estados","TO-TOCANTINS");
		dsl.clicaId("btn-filtrar");
		dsl.espera();
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "0");
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "19.538.383");
		Assert.assertEquals(dsl.pegaValor("qtd-registros"), "125.259");		
}
}