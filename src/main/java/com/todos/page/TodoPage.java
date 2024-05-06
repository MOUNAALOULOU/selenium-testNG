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
	private static WebElement inputText;

	public void submitTodo(String todo) {
		inputText.sendKeys(todo);
		inputText.sendKeys(Keys.ENTER);

	}

}
