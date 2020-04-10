package br.com.eric.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import br.com.eric.common.TestePage;



public class Login extends BaseTestCase{
	
	@Before
	public void before() throws Exception {  
	}

	
	@Test
	public void assertHomeScreenTitle() {

		TestePage.clickLogin();
		System.out.println("Teste Reprovado");
	}



	
	@After
	public void after() throws Exception {
	}

}
