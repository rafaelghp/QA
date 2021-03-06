import org.openqa.selenium.WebDriver;

public class buscaEmpresaPage {
	
	private DSL dsl;
	
	public buscaEmpresaPage(WebDriver driver) {
		dsl= new DSL(driver);
	}
	
	public void setEstado(String Estado) throws InterruptedException {
		dsl.escreveEnterId("busca-filtro-estados", Estado);
		
	}
	public void atualizarPesquisa() {
		dsl.clicaId("btn-filtrar");
	}
	
	public void regiao() {
		dsl.clicaId("filtro-regiao");
	}
	
	public String resultado() {
		return dsl.pegaValor("qtd-registros");
	}
}
