package br.com.eric.common;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.eric.common.Selenium;
import br.com.eric.util.Utils;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;


import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.executeJavaScript;

public class TestePage {
	
	/**
	 * Instancia privada do webDriver que vira da suite de teste
	 */
	private static final WebDriver driver;
	private static final WebDriverWait wait;

	/**
	 * Construtor que ira adicionar a instancia do WebDriver para utilizacao dos metodos
	 */
	static {
		driver = Selenium.getDriver();
		wait = new WebDriverWait(driver, 10);
	}
	
	/**
	 * Definiï¿½ï¿½o ï¿½nica dos locators utilizados na pï¿½gina
	 */
//	static By homeMenuItem = By.id("menu-item-103"); //O item de menu pode ser acessado por id ou pelo texto exibido no link
	static By homeMenuItem = By.linkText("HOME");
	static By seleniumMenuItem = By.linkText("SELENIUM");
	static By cursoSeleniumSubMenuItem = By.linkText("CURSO SELENIUM");
	static By formularioSimplesMenuItem = By.linkText("FORMULÃ�RIO SIMPLES");	
	
	public static void teste(){
		wait.until(ExpectedConditions.visibilityOfElementLocated(homeMenuItem));
		driver.findElement(homeMenuItem).click();
	}	
	
    public TestePage open() {
        Selenide.open("/login");
        return this;
    }

    public TestePage with(String email, String pass) {
        $("input[name=email]").setValue(email);
        $("input[type=password]").setValue(pass);
        $(byText("Entrar")).click();
        return this;
    }
    
    public TestePage close() {
        Selenide.closeWindow();
        return this;
    }

    public SelenideElement alert() {
        return $(".alert span");
    }

    
    public void clearSession(){
        executeJavaScript("localStorage.clear();"); // limpa a cessao do navegador
    }

	/**
	 * Clicar no link HOME do menu
	 */
	public static void clickHomeMenuItem(){
		wait.until(ExpectedConditions.visibilityOfElementLocated(homeMenuItem));
		driver.findElement(homeMenuItem).click();
	}	
	
	/**
	 * Clicar no link SELENIUM do menu
	 */
	public static void clickSeleniumMenuItem(){
//		wait.until(ExpectedConditions.elementToBeClickable(seleniumMenuItem));
		Utils.isClickable(seleniumMenuItem);
		driver.findElement(seleniumMenuItem).click();
	}	
	
	/**
	 * Clicar no item de subMenu indicado
	 */


}
