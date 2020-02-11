import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class busca_filtroPorCidade_teste {
	FirefoxDriver driver =  new FirefoxDriver();
	private DSL dsl;
	@Before
	public void inicializa() throws InterruptedException{
		driver.get("https://hmlplat.econodata.com.br/#/login");
		dsl = new DSL(driver);
		driver.manage().window().maximize();
		dsl.escreveId("plat-login-email","rafael.s.lima92@hotmail.com");
		dsl.escreveId("plat-login-senha","frango");
		dsl.clicId("plat-login-botao-entrar");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Empresas")).click();
		dsl.clicaId("filtro-regiao");
		Thread.sleep(1000);
		
	}
	
	@After	public void finaliza() throws InterruptedException {
		driver.quit();
		Thread.sleep(2000);
		}
	
	@Test
	public  void testeCidadesAcRio() throws InterruptedException {
		dsl.escreveEnterId("busca-filtro-estados","AC-ACRE");
		dsl.escreveEnterId("busca-filtro-cidade", "RIO BRANCO - AC");
		dsl.clicaId("btn-filtrar");
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "0");
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "19.538.383");
		Assert.assertEquals(dsl.pegaValor("qtd-registros"), "25.629");
	}
	@Test
	public void testeCidadeAcBras() throws InterruptedException {
		dsl.escreveEnterId("busca-filtro-estados","AC-ACRE");
		dsl.escreveEnterId("busca-filtro-cidade", "BRASILÉIA - AC");
		dsl.clicaId("btn-filtrar");
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "0");
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "19.538.383");
		Assert.assertEquals(dsl.pegaValor("qtd-registros"), "1.414");
	}
	
	@Test
	public  void testeCidadesAlMace() throws InterruptedException {
		dsl.escreveEnterId("busca-filtro-estados","AL-ALAGOAS");
		dsl.escreveEnterId("busca-filtro-cidade", "MACEIÓ - AL");
		dsl.clicaId("btn-filtrar");
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "0");
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "19.538.383");
		Assert.assertEquals(dsl.pegaValor("qtd-registros"), "77.446");
	}
	
	@Test
	public  void testeCidadesAlJara() throws InterruptedException {
		dsl.escreveEnterId("busca-filtro-estados","AL-ALAGOAS");
		dsl.escreveEnterId("busca-filtro-cidade", "JARAMATAIA - AL");
		dsl.clicaId("btn-filtrar");
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "0");
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "19.538.383");
		Assert.assertEquals(dsl.pegaValor("qtd-registros"), "154");
	}
	
	@Test
	public  void testeCidadesApPorto() throws InterruptedException {
		dsl.escreveEnterId("busca-filtro-estados","AP-AMAPÁ");
		dsl.escreveEnterId("busca-filtro-cidade", "PORTO GRANDE - AP");
		dsl.clicaId("btn-filtrar");
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "0");
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "19.538.383");
		Assert.assertEquals(dsl.pegaValor("qtd-registros"), "805");
	}
	
	
	@Test
	public  void testeCidadesApMacapa() throws InterruptedException {
		dsl.escreveEnterId("busca-filtro-estados","AP-AMAPÁ");
		dsl.escreveEnterId("busca-filtro-cidade", "MACAPÁ - AP");
		dsl.clicaId("btn-filtrar");
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "0");
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "19.538.383");
		Assert.assertEquals(dsl.pegaValor("qtd-registros"), "28.091");
	}
	
	@Test
	public  void testeCidadesAmManaus() throws InterruptedException {
		dsl.escreveEnterId("busca-filtro-estados","AM-AMAZONAS");
		dsl.escreveEnterId("busca-filtro-cidade", "MANAUS - AM");
		dsl.clicaId("btn-filtrar");
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "0");
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "19.538.383");
		Assert.assertEquals(dsl.pegaValor("qtd-registros"), "124.224");
	}
	
	@Test
	public  void testeCidadesAmMaues() throws InterruptedException {
		dsl.escreveEnterId("busca-filtro-estados","AM-AMAZONAS");
		dsl.escreveEnterId("busca-filtro-cidade", "MAUÉS - AM");
		dsl.clicaId("btn-filtrar");
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "0");
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "19.538.383");
		Assert.assertEquals(dsl.pegaValor("qtd-registros"), "2.020");
	}
	
	@Test
	public  void testeCidadesBaSalve() throws InterruptedException {
		dsl.escreveEnterId("busca-filtro-estados","BA-BAHIA");
		dsl.escreveEnterId("busca-filtro-cidade", "SALVADOR - BA");
		dsl.clicaId("btn-filtrar");
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "0");
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "19.538.383");
		Assert.assertEquals(dsl.pegaValor("qtd-registros"), "275.316");
	}
	
	@Test
	public  void testeCidadesBaSaude() throws InterruptedException {
		dsl.escreveEnterId("busca-filtro-estados","BA-BAHIA");
		dsl.escreveEnterId("busca-filtro-cidade", "SAÚDE - BA");
		dsl.clicaId("btn-filtrar");
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "0");
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "19.538.383");
		Assert.assertEquals(dsl.pegaValor("qtd-registros"), "595");
	}
	
	@Test
	public  void testeCidadesCeForte() throws InterruptedException {
		dsl.escreveEnterId("busca-filtro-estados","	CE-CEARÁ");
		dsl.escreveEnterId("busca-filtro-cidade", "FORTALEZA - CE");
		dsl.clicaId("btn-filtrar");
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "0");
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "19.538.383");
		Assert.assertEquals(dsl.pegaValor("qtd-registros"), "275.316");
	}
	
	@Test
	public  void testeCidadesCeEuse() throws InterruptedException {
		dsl.escreveEnterId("busca-filtro-estados","	CE-CEARÁ");
		dsl.escreveEnterId("busca-filtro-cidade", "EUSÉBIO - CE");
		dsl.clicaId("btn-filtrar");
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "0");
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "19.538.383");
		Assert.assertEquals(dsl.pegaValor("qtd-registros"), "7.573");
	}
	
	@Test
	public  void testeCidadesEsVito() throws InterruptedException {
		dsl.escreveEnterId("busca-filtro-estados","	ES-ESPÍRITO SANTO");
		dsl.espera();
		dsl.escreveEnterId("busca-filtro-cidade", "VITÓRIA - ES");
		dsl.espera();
		dsl.clicaId("btn-filtrar");
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "0");
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "19.538.383");
		Assert.assertEquals(dsl.pegaValor("qtd-registros"), "55.888");
	}
	
	@Test
	public  void testeCidadesEsViana() throws InterruptedException {
		dsl.escreveEnterId("busca-filtro-estados","	ES-ESPÍRITO SANTO");
		dsl.escreveEnterId("busca-filtro-cidade", "VIANA - ES");
		dsl.clicaId("btn-filtrar");
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "0");
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "19.538.383");
		Assert.assertEquals(dsl.pegaValor("qtd-registros"), "7.279");
	}
	
	@Test
	public  void testeCidadesGoGoiania() throws InterruptedException {
		dsl.escreveEnterId("busca-filtro-estados","	GO-GOIÁS");
		dsl.escreveEnterId("busca-filtro-cidade", "GOIÂNIA - GO");
		dsl.clicaId("btn-filtrar");
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "0");
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "19.538.383");
		Assert.assertEquals(dsl.pegaValor("qtd-registros"), "195.565");
	}
	
	@Test
	public  void testeCidadesGoItapaci() throws InterruptedException {
		dsl.escreveEnterId("busca-filtro-estados","	GO-GOIÁS");
		dsl.escreveEnterId("busca-filtro-cidade", "ITAPACI - GO");
		dsl.clicaId("btn-filtrar");
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "0");
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "19.538.383");
		Assert.assertEquals(dsl.pegaValor("qtd-registros"), "1.575");
	}
	
	@Test
	public  void testeCidadesMaRaposa() throws InterruptedException {
		dsl.escreveEnterId("busca-filtro-estados","	MA-MARANHÃO");
		dsl.escreveEnterId("busca-filtro-cidade", "RAPOSA - MA");
		dsl.clicaId("btn-filtrar");
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "0");
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "19.538.383");
		Assert.assertEquals(dsl.pegaValor("qtd-registros"), "1.252");
	}
	
	@Test
	public  void testeCidadesMaSaoluis() throws InterruptedException {
		dsl.escreveEnterId("busca-filtro-estados","MA-MARANHÃO");
		dsl.escreveEnterId("busca-filtro-cidade", "SÃO LUÍS - MA");
		dsl.clicaId("btn-filtrar");
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "0");
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "19.538.383");
		Assert.assertEquals(dsl.pegaValor("qtd-registros"), "84.041");
	}
	
	@Test
	public  void testeCidadesMtCuiaba() throws InterruptedException {
		dsl.escreveEnterId("busca-filtro-estados","MT-MATO GROSSO");
		dsl.escreveEnterId("busca-filtro-cidade", "CUIABÁ - MT");
		dsl.clicaId("btn-filtrar");
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "0");
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "19.538.383");
		Assert.assertEquals(dsl.pegaValor("qtd-registros"), "82.030");
	}
	
	@Test
	public  void testeCidadesMtDenise() throws InterruptedException {
		dsl.escreveEnterId("busca-filtro-estados","MT-MATO GROSSO");
		dsl.escreveEnterId("busca-filtro-cidade", "DENISE - MT");
		dsl.clicaId("btn-filtrar");
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "0");
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "19.538.383");
		Assert.assertEquals(dsl.pegaValor("qtd-registros"), "397");
	}
	
	@Test
	public  void testeCidadesMsCampogrande() throws InterruptedException {
		dsl.escreveEnterId("busca-filtro-estados","MS-MATO GROSSO DO SUL");
		dsl.escreveEnterId("busca-filtro-cidade", "CAMPO GRANDE - MS");
		dsl.clicaId("btn-filtrar");
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "0");
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "19.538.383");
		Assert.assertEquals(dsl.pegaValor("qtd-registros"), "102.713");
	}
	
	@Test
	public  void testeCidadesMsCaMAPUA() throws InterruptedException {
		dsl.escreveEnterId("busca-filtro-estados","MS-MATO GROSSO DO SUL");
		dsl.escreveEnterId("busca-filtro-cidade", "CAMAPUÃ - MS");
		dsl.clicaId("btn-filtrar");
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "0");
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "19.538.383");
		Assert.assertEquals(dsl.pegaValor("qtd-registros"), "1.544");
	}
	
	@Test
	public  void testeCidadesMgBelohorizonte() throws InterruptedException {
		dsl.escreveEnterId("busca-filtro-estados","MG-MINAS GERAIS");
		dsl.escreveEnterId("busca-filtro-cidade", "BELO HORIZONTE - MG");
		dsl.clicaId("btn-filtrar");
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "0");
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "19.538.383");
		Assert.assertEquals(dsl.pegaValor("qtd-registros"), "373.180");
	}
	
	@Test
	public  void testeCidadesMgAracai() throws InterruptedException {
		dsl.escreveEnterId("busca-filtro-estados","MG-MINAS GERAIS");
		dsl.escreveEnterId("busca-filtro-cidade", "ARAÇAÍ - MG");
		dsl.clicaId("btn-filtrar");
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "0");
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "19.538.383");
		Assert.assertEquals(dsl.pegaValor("qtd-registros"), "176");
	}
	
	@Test
	public  void testeCidadesPaBelem() throws InterruptedException {
		dsl.escreveEnterId("busca-filtro-estados","PA-PARÁ");
		dsl.escreveEnterId("busca-filtro-cidade", "BELÉM - PA");
		dsl.clicaId("btn-filtrar");
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "0");
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "19.538.383");
		Assert.assertEquals(dsl.pegaValor("qtd-registros"), "101.378");
	}
	
	
	@Test
	public  void testeCidadesPaBonito() throws InterruptedException {
		dsl.escreveEnterId("busca-filtro-estados","PA-PARÁ");
		dsl.escreveEnterId("busca-filtro-cidade", "BONITO - PA");
		dsl.clicaId("btn-filtrar");
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "0");
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "19.538.383");
		Assert.assertEquals(dsl.pegaValor("qtd-registros"), "303");
	}
	
	@Test
	public  void testeCidadesPbJoaopessoa() throws InterruptedException {
		dsl.escreveEnterId("busca-filtro-estados","PB-PARAÍBA");
		dsl.escreveEnterId("busca-filtro-cidade", "JOÃO PESSOA - PB");
		dsl.clicaId("btn-filtrar");
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "0");
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "19.538.383");
		Assert.assertEquals(dsl.pegaValor("qtd-registros"), "77.502");
	}
	
	@Test
	public  void testeCidadesPbJURU() throws InterruptedException {
		dsl.escreveEnterId("busca-filtro-estados","PB-PARAÍBA");
		dsl.escreveEnterId("busca-filtro-cidade", "JURU - PB");
		dsl.clicaId("btn-filtrar");
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "0");
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "19.538.383");
		Assert.assertEquals(dsl.pegaValor("qtd-registros"), "291");
	}
	
	@Test
	public  void testeCidadesPrCuritiba() throws InterruptedException {
		dsl.escreveEnterId("busca-filtro-estados","PR-PARANÁ");
		dsl.escreveEnterId("busca-filtro-cidade", "CURITIBA - PR");
		dsl.clicaId("btn-filtrar");
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "0");
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "19.538.383");
		Assert.assertEquals(dsl.pegaValor("qtd-registros"), "314.674");
	}
	
	@Test
	public  void testeCidadesPrCeuazul() throws InterruptedException {
		dsl.escreveEnterId("busca-filtro-estados","PR-PARANÁ");
		dsl.escreveEnterId("busca-filtro-cidade", "CÉU AZUL - PR");
		dsl.clicaId("btn-filtrar");
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "0");
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "19.538.383");
		Assert.assertEquals(dsl.pegaValor("qtd-registros"), "1.215");
	}
	
	@Test
	public  void testeCidadesPeRecife() throws InterruptedException {
		dsl.escreveEnterId("busca-filtro-estados","PE-PERNAMBUCO");
		dsl.escreveEnterId("busca-filtro-cidade", "RECIFE - PE");
		dsl.clicaId("btn-filtrar");
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "0");
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "19.538.383");
		Assert.assertEquals(dsl.pegaValor("qtd-registros"), "154.735");
	}
	
	@Test
	public  void testeCidadesPeXexeu() throws InterruptedException {
		dsl.escreveEnterId("busca-filtro-estados","PE-PERNAMBUCO");
		dsl.escreveEnterId("busca-filtro-cidade", "XEXÉU - PE");
		dsl.clicaId("btn-filtrar");
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "0");
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "19.538.383");
		Assert.assertEquals(dsl.pegaValor("qtd-registros"), "392");
	}
	
	@Test
	public  void testeCidadesPiTeresina() throws InterruptedException {
		dsl.escreveEnterId("busca-filtro-estados","PI-PIAUÍ");
		dsl.escreveEnterId("busca-filtro-cidade", "TERESINA - PI");
		dsl.clicaId("btn-filtrar");
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "0");
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "19.538.383");
		Assert.assertEquals(dsl.pegaValor("qtd-registros"), "70.414");
	}
	
	@Test
	public  void testeCidadesPiAcaua() throws InterruptedException {
		dsl.escreveEnterId("busca-filtro-estados","PI-PIAUÍ");
		dsl.escreveEnterId("busca-filtro-cidade", "ACAUÃ - PI");
		dsl.clicaId("btn-filtrar");
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "0");
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "19.538.383");
		Assert.assertEquals(dsl.pegaValor("qtd-registros"), "150");
	}
	
	@Test
	public  void testeCidadesRnNatal() throws InterruptedException {
		dsl.escreveEnterId("busca-filtro-estados","RN-RIO GRANDE DO NORTE");
		dsl.escreveEnterId("busca-filtro-cidade", "NATAL - RN");
		dsl.clicaId("btn-filtrar");
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "0");
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "19.538.383");
		Assert.assertEquals(dsl.pegaValor("qtd-registros"), "86.179");
	}
	
	@Test
	public  void testeCidadesRnCaraubas() throws InterruptedException {
		dsl.escreveEnterId("busca-filtro-estados","RN-RIO GRANDE DO NORTE");
		dsl.escreveEnterId("busca-filtro-cidade", "CARAÚBAS - RN");
		dsl.clicaId("btn-filtrar");
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "0");
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "19.538.383");
		Assert.assertEquals(dsl.pegaValor("qtd-registros"), "930");
	}
	
	@Test
	public  void testeCidadesRjRiodejaneiro() throws InterruptedException {
		dsl.escreveEnterId("busca-filtro-estados","RJ-RIO DE JANEIRO");
		dsl.escreveEnterId("busca-filtro-cidade", "RIO DE JANEIRO - RJ");
		dsl.clicaId("btn-filtrar");
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "0");
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "19.538.383");
		Assert.assertEquals(dsl.pegaValor("qtd-registros"), "826.572");
	}
	
	@Test
	public  void testeCidadesRjItaguai() throws InterruptedException {
		dsl.escreveEnterId("busca-filtro-estados","RJ-RIO DE JANEIRO");
		dsl.escreveEnterId("busca-filtro-cidade", "ITAGUAÍ - RJ");
		dsl.clicaId("btn-filtrar");
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "0");
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "19.538.383");
		Assert.assertEquals(dsl.pegaValor("qtd-registros"), "11.403");
	}
	
	@Test
	public  void testeCidadesRsPortoalegre() throws InterruptedException {
		dsl.escreveEnterId("busca-filtro-estados","RS-RIO GRANDE DO SUL");
		dsl.escreveEnterId("busca-filtro-cidade", "PORTO ALEGRE - RS");
		dsl.clicaId("btn-filtrar");
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "0");
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "19.538.383");
		Assert.assertEquals(dsl.pegaValor("qtd-registros"), "231.599");
	}
	
	@Test
	public  void testeCidadesRsViamao() throws InterruptedException {
		dsl.escreveEnterId("busca-filtro-estados","RS-RIO GRANDE DO SUL");
		dsl.escreveEnterId("busca-filtro-cidade", "VIAMÃO - RS");
		dsl.clicaId("btn-filtrar");
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "0");
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "19.538.383");
		Assert.assertEquals(dsl.pegaValor("qtd-registros"), "22.591");
	}
	
	@Test
	public  void testeCidadesRoPortovelho() throws InterruptedException {
		dsl.escreveEnterId("busca-filtro-estados","RO-RONDÔNIA");
		dsl.escreveEnterId("busca-filtro-cidade", "PORTO VELHO - RO");
		dsl.clicaId("btn-filtrar");
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "0");
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "19.538.383");
		Assert.assertEquals(dsl.pegaValor("qtd-registros"), "38.943");
	}
	
	@Test
	public  void testeCidadesRoJiparana() throws InterruptedException {
		dsl.escreveEnterId("busca-filtro-estados","RO-RONDÔNIA");
		dsl.escreveEnterId("busca-filtro-cidade", "JI-PARANÁ - RO");
		dsl.clicaId("btn-filtrar");
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "0");
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "19.538.383");
		Assert.assertEquals(dsl.pegaValor("qtd-registros"), "11.386");
	}
	
	@Test
	public  void testeCidadesRrBoavista() throws InterruptedException {
		dsl.escreveEnterId("busca-filtro-estados","RR-RORAIMA");
		dsl.escreveEnterId("busca-filtro-cidade", "BOA VISTA- RR");
		dsl.clicaId("btn-filtrar");
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "0");
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "19.538.383");
		Assert.assertEquals(dsl.pegaValor("qtd-registros"), "24.705");
	}
	
	@Test
	public  void testeCidadesRrCanta() throws InterruptedException {
		dsl.escreveEnterId("busca-filtro-estados","RR-RORAIMA");
		dsl.escreveEnterId("busca-filtro-cidade", "CANTÁ- RR");
		dsl.clicaId("btn-filtrar");
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "0");
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "19.538.383");
		Assert.assertEquals(dsl.pegaValor("qtd-registros"), "421");
	}
	
	
	@Test
	public  void testeCidadesScFloripa() throws InterruptedException {
		dsl.escreveEnterId("busca-filtro-estados","SC-SANTA CATARINA");
		dsl.escreveEnterId("busca-filtro-cidade", "FLORIANÓPOLIS - SC");
		dsl.clicaId("btn-filtrar");
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "0");
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "19.538.383");
		Assert.assertEquals(dsl.pegaValor("qtd-registros"), "89.567");
	}
	
	@Test
	public  void testeCidadesScIlhota() throws InterruptedException {
		dsl.escreveEnterId("busca-filtro-estados","SC-SANTA CATARINA");
		dsl.escreveEnterId("busca-filtro-cidade", "ILHOTA - SC");
		dsl.clicaId("btn-filtrar");
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "0");
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "19.538.383");
		Assert.assertEquals(dsl.pegaValor("qtd-registros"), "1.742");
	}
	
	@Test
	public  void testeCidadesSpSaopaulo() throws InterruptedException {
		dsl.escreveEnterId("busca-filtro-estados","SP-SÃO PAULO");
		dsl.escreveEnterId("busca-filtro-cidade", "SÃO PAULO - SP");
		dsl.clicaId("btn-filtrar");
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "0");
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "19.538.383");
		Assert.assertEquals(dsl.pegaValor("qtd-registros"), "1.789.827");
	}
	
	@Test
	public  void testeCidadesSpSantos() throws InterruptedException {
		dsl.escreveEnterId("busca-filtro-estados","SP-SÃO PAULO");
		dsl.escreveEnterId("busca-filtro-cidade", "SANTOS - SP");
		dsl.clicaId("btn-filtrar");
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "0");
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "19.538.383");
		Assert.assertEquals(dsl.pegaValor("qtd-registros"), "61.639");
	}
	
	
	@Test
	public  void testeCidadesSeAracaju() throws InterruptedException {
		dsl.escreveEnterId("busca-filtro-estados","SE-SERGIPE");
		dsl.escreveEnterId("busca-filtro-cidade", "ARACAJU - SE");
		dsl.clicaId("btn-filtrar");
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "0");
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "19.538.383");
		Assert.assertEquals(dsl.pegaValor("qtd-registros"), "54.875");
	}
	
	@Test
	public  void testeCidadesSeAraua() throws InterruptedException {
		dsl.escreveEnterId("busca-filtro-estados","SE-SERGIPE");
		dsl.escreveEnterId("busca-filtro-cidade", "ARAUÁ - SE");
		dsl.clicaId("btn-filtrar");
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "0");
		Assert.assertNotEquals(dsl.pegaValor("qtd-registros"), "19.538.383");
		Assert.assertEquals(dsl.pegaValor("qtd-registros"), "287");
	}
}


