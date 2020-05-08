package br.com.eric.test;

import static com.codeborne.selenide.WebDriverRunner.isChrome;
//import static com.codeborne.selenide.Selenide.$;
//import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;



@RunWith(DataProviderRunner.class)

public class Login{
	
	@Before
	public void before() throws Exception {
		isChrome();
		open("http://ninjaplus-web:5000/login");
	}

    @DataProvider
    public static Object[][] loginData() {
        return new Object[][]{
                {"ericbiu@hotmail.com", "99", "Usu�rio e/ou senha inv�lidos"},
                {"eric@hotmail.com", "99918278", "Usu�rio e/ou senha inv�lidos"},
                {"", "99918278", "Opps. Cad� o email?"},
                {"eric@hotmail.com", "", "Opps. Cad� a senha?"},

        };
    }
	
	
	@Test
	public void usuarioLogado() {
		
		//$("#emailId").setValue("ericbiu@hotmail.com"); busca por id
		$("input[name=email]").setValue("ericbiu@hotmail.com"); //busca por input name
		$("#passId").setValue("99918278");
		$(byText("Entrar")).click();
		//$("#login").click();
		
		$(".user .info span").shouldHave(text("eric"));   //verifica se a condi��o foi ayendida !!
	
	}

	@Test
	 @UseDataProvider("loginData")
	public void provider(String email, String senha, String texto) {
		
		$("#emailId").setValue(email);
		$("#passId").setValue(senha);
		$(byText("Entrar")).click();
		
		$(".alert span").shouldHave(text(texto));   
	
	}
	
//	@Test
//	public void senhaIncorreta() {
//		
//		$("#emailId").setValue("ericbiu@hotmail.com");
//		$("#passId").setValue("99");
//		$(byText("Entrar")).click();
//		
//		$(".alert span").shouldHave(text("Usu�rio e/ou senha inv�lidos"));   
//	
//	}

//	@Test
//	public void loginIncorreto() {
//		
//		$("#emailId").setValue("eric@hotmail.com");
//		$("#passId").setValue("99918278");
//		$(byText("Entrar")).click();
//		
//		$(".alert span").shouldHave(text("Usu�rio e/ou senha inv�lidos"));   
//	
//	}
	
//	@Test
//	public void loginVazio() {
//		
//		$("#emailId").setValue("");
//		$("#passId").setValue("99918278");
//		$(byText("Entrar")).click();
//		
//		$(".alert span").shouldHave(text("Opps. Cad� o email?"));   
//	
//	}

//	@Test
//	public void senhaVazia() {
//		
//		$("#emailId").setValue("eric@hotmail.com");
//		$("#passId").setValue("");
//		$(byText("Entrar")).click();
//		
//		$(".alert span").shouldHave(text("Opps. Cad� a senha?"));   
//	
//	}
	
	@After
	public void after() throws Exception {
		executeJavaScript("localStorage.clear();");
	}

}
