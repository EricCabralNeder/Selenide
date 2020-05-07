package br.com.eric.test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebElement;

import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.Selectors.ByText;
import com.codeborne.selenide.commands.SetValue;

import static com.codeborne.selenide.WebDriverRunner.isChrome;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Condition.text;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;





public class Login{
	
	@Before
	public void before() throws Exception {  
	}

	
	@Test
	public void usuarioLogado() {
		isChrome();
		open("http://ninjaplus-web:5000/login");
		
		//$("#emailId").setValue("ericbiu@hotmail.com"); busca por id
		$("input[name=email]").setValue("ericbiu@hotmail.com"); //busca por input name
		$("#passId").setValue("99918278");
		$(byText("Entrar")).click();
		//$("#login").click();
		
		System.out.println(".." + $(".user .info .span").getText() + "..");
		
		$(".user .info .span").shouldHave(text("eric"));   //verifica se a condição foi ayendida !!
	
	}



	
	@After
	public void after() throws Exception {
	}

}
