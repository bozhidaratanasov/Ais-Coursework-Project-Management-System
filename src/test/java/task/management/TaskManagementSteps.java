package task.management;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import models.Project;
import task.management.model.TaskManagementScreenModel;

public class TaskManagementSteps {

	private TaskManagementScreenModel taskManagementScreenModel;

	@Given("^Разработчикът отваря екран за управление на задачите$")
	public void openTaskManagementScreen() throws Throwable {
	    taskManagementScreenModel = new TaskManagementScreenModel();
	}

	@When("^Въвежда име на задачата$")
	public void enterTaskName() throws Throwable {
	    taskManagementScreenModel.setName("ExampleName");
	}

	@When("^Въвежда описание на задачата$")
	public void enterTaskDescription() throws Throwable {
	    taskManagementScreenModel.setDescription("ExampleDescription");
	}

	@When("^Назначава задачата към даден проект$")
	public void assignTaskToProject() throws Throwable {
	    taskManagementScreenModel.setProject(new Project());
	}

	@When("^Натисне бутона за създаване на нова задача$")
	public void createTaskButton() throws Throwable {
	    taskManagementScreenModel.clickCreateTaskButton();
	}

	@Then("^Вижда съобщение за успешно създадена нова задача$")
	public void receiveSuccessMessage() throws Throwable {
	    assertEquals("Задачата е успешно създадена! Статус: Нова", taskManagementScreenModel.getMessage());
	}
	
	@Then("^Вижда съобщение за непълни данни$")
	public void receiveMissingDataMessage() throws Throwable {
	    assertEquals("Непълни данни!", taskManagementScreenModel.getMessage());
	}

}
