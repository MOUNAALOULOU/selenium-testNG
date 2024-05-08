package com.todos.page;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.todos.utils.BasePage;

public class TodoPage extends BasePage {

	public TodoPage() throws IOException {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//input[@placeholder='What needs to be done?']")
	public static WebElement inputText;

	@FindBy(how = How.XPATH, using = "//label[normalize-space()='Adopter de bonnes pratiques de test']")
	public static WebElement textTodo;
	
	@FindBy(how = How.XPATH, using = "//input[@class='toggle']")
	public static WebElement checkBoxTodo;

	public void submitTodo(String todo) {
		inputText.sendKeys(todo);
		inputText.sendKeys(Keys.ENTER);

	}

	public Boolean isElementDisplayed(WebElement element) {
		Boolean isElementDisplayed = element.isDisplayed();
		return isElementDisplayed;
	}

	public String checkElementContain(WebElement element) {
		String fieldTodo = element.getText();
		return fieldTodo;
	}
	public Boolean isCheckBoxSelected(WebElement element) {
		Boolean isCheckBoxSelected = element.isSelected();
		return isCheckBoxSelected;
	}

}
