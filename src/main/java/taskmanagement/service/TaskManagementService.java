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
	
	public static String changeTaskStatus() {
		if (taskDb.get(0).getParticipant() != null) {
			taskDb.get(0).setStatus(new Status("В процес на разработка"));
			return "Задачата е успешно пусната в процес на разработка! Статус: " + taskDb.get(0).getStatus().getStatusCode();
		}
		
		return "Задачата не е пусната в процес на разработка, защото не е назначен работник към нея!";
	}
}
