package com.todos.tests;

import static org.testng.Assert.assertFalse;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.todos.page.TodoPage;
import com.todos.utils.Setup;

public class AddTodoTest extends Setup {

	public AddTodoTest() throws IOException {
		super();
	}

	TodoPage todoPage;

	@Test
	public void iCanAddTodo() throws IOException {
		todoPage = new TodoPage();
		boolean fieldTodo = todoPage.isElementDisplayed(TodoPage.inputText);
		Assert.assertTrue(fieldTodo);
		
		todoPage.submitTodo(prop.getProperty("todo1"));
		
		String textTodo = todoPage.checkElementContain(TodoPage.textTodo);
		Assert.assertTrue(textTodo.contains(prop.getProperty("todo1")));
		
		boolean checkbox = todoPage.isCheckBoxSelected(TodoPage.checkBoxTodo);
		assertFalse(checkbox);

	}
}
