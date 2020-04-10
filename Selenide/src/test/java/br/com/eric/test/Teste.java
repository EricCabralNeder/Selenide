package br.com.eric.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import br.com.eric.common.TestePage;



public class Teste extends BaseTestCase{
	
	@Before
	public void before() throws Exception {  
	}

	
	@Test
	public void assertHomeScreenTitle() {

		TestePage.clickHomeMenuItem();
	}

	
//	/**
//	 * Objetivo: Navegar para a pagina Curso Selenium e verificar o titulo exibido
//	 * 
//	 * Passos: Navegar para a pagina Curso Selenium, em seguida verificar o titulo exibido
//	 * 
//	 * Resultado Esperado:Titulo da p�gina est� correto
//	 */
//	@Test
//	public void navigateToCursoSeleniumPage() {
////		HomePage.clickSeleniumMenuItem();
////		HomePage.clicksubMenuItem("Curso Selenium");
////		HomePage.isHeaderTitleCorrect("Curso Selenium");
//	}
//	
//	
//	/**
//	 * Objetivo: Navegar para a pagina Formulario Simples e verificar o titulo
//	 * 
//	 * Passos: Navegar para a pagina Formulario Simples e verificar o titulo exibido
//	 * 
//	 * Resultado Esperado:Titulo da p�gina est� correto
//	 */
//	@Test
//	public void navigateToFormularioSimplesPage() {
////		HomePage.clickSeleniumMenuItem();
////		HomePage.clicksubMenuItem("Formulário Simples");
////		HomePage.isHeaderTitleCorrect("Formulário Simples");
//	}
//	
//	
//	/**
//	 * Objetivo: P�gina de resultados da busca � exibida corretamente
//	 * 
//	 * Passos: Realiza busca com texto fixo e verifica o t�tulo da p�gina de resultados
//	 * 
//	 * Resultado Esperado: T�tulo da p�gina de resultados est� correto
//	 */
//	@Test
//	public void performSimpleSearch() {
////		HomePage.showHiddenOptions();
////		HomePage.performSearch("teste");
////		HomePage.clickSearchButton();
////		HomePage.isSearchResultCorrect("Resultados da pesquisa por: teste");
//	}

	
	@After
	public void after() throws Exception {
	}

}
