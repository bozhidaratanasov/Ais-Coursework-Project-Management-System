package taskmanagement.service;

import models.Participant;
import models.Project;
import models.Status;
import models.Task;

public class TaskManagementService {

	public static String createTask(String name, String description, Project project) {
		
		if (name == null || description == null || project == null)
			return "Непълни данни!";
		
		Task task = new Task(name, description, project);
		task.setStatus(new Status("Нова"));
		return "Задачата е успешно създадена! Статус: " + task.getStatus().getStatusCode();
	}
}
