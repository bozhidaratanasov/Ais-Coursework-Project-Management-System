package taskmanagement.service;

import java.util.ArrayList;

import models.Participant;
import models.Project;
import models.Status;
import models.Task;

public class TaskManagementService {
	
	private static ArrayList<Task> taskDb = new ArrayList<Task>();

	public static String createTask(String name, String description, Project project) {
		
		if (name == null || description == null || project == null)
			return "Непълни данни!";
		
		Task task = new Task(name, description, project);
		task.setStatus(new Status("Нова"));
		taskDb.add(task);
		return "Задачата е успешно създадена! Статус: " + task.getStatus().getStatusCode();
	}
	
	public static void assignParticipant(Participant participant) {
		taskDb.get(0).setParticipant(participant);
	}
	
	public static boolean checkTaskExists() {
		if (taskDb.size() > 0)
			return true;
		
		return false;
	}
	
	public static boolean checkParticipantIsAssigned() {
		if (!(taskDb.get(0).getParticipant() instanceof Participant))
			return false;
		
		return true;
	}
	
	public static boolean checkTaskIsFinished() {
		if (taskDb.get(0).getStatus().getStatusCode() == "Завършена")
			return true;
		
		return false;
	}
	
	public static String changeTaskStatus(String clickedButton) {
		
		Task task = taskDb.get(0);
		
		if (checkTaskIsFinished())
			return "Задачата е завършена и нейният статус не може да бъде променян!";
		
		if (clickedButton == "StartDevelopingButton") {
			if (checkParticipantIsAssigned()) {
				task.setStatus(new Status("В процес на разработка"));
				return "Задачата е успешно пусната в процес на разработка! Статус: " + task.getStatus().getStatusCode();
			}
			
			return "Задачата не е пусната в процес на разработка, защото не е назначен работник към нея!";
		}
		
		else if (clickedButton == "DeclineTaskButton") {
			task.setStatus(new Status("Отказана"));
			return "Задачата е успешно отказана! Статус: " + task.getStatus().getStatusCode();
		}
		
		else if (clickedButton == "FinishTaskButton") {
			task.setStatus(new Status("Завършена"));
			return "Задачата е успешно завършена! Статус: " + task.getStatus().getStatusCode();
		}
		
		return "";
	}
}
