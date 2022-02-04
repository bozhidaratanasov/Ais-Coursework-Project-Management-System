package models;
import java.util.*;

/**
 * 
 */
public class Task {
	
	private String name;
    private String description;
    private Participant participant;
    private Project project;
    private Status status;
    private Set<Task> subtasks;

    /**
     * Default constructor
     */
    public Task() {
    }

    /**
     * 
     */
    

    /**
     * @return
     */
    public String getName() {
        return this.name;
    }

    /**
     * @param name 
     * @return
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return
     */
    public String getDescription() {
       return this.description;
    }

    /**
     * @param description 
     * @return
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return
     */
    public Participant getParticipant() {
        return this.participant;
    }

    /**
     * @param participant 
     * @return
     */
    public void setParticipant(Participant participant) {
        this.participant = participant;
    }

    /**
     * @return
     */
    public Project getProject() {
        return this.project;
    }

    /**
     * @param project 
     * @return
     */
    public void setProject(Project project) {
        this.project = project;
    }

    /**
     * @return
     */
    public Status getStatus() {
        return this.status;
    }

    /**
     * @param status 
     * @return
     */
    public void setStatus(Status status) {
       this.status = status;
    }

    /**
     * @return
     */
    public Set<Task> getSubtasks() {
        return this.subtasks;
    }

    /**
     * @param subtasks 
     * @return
     */
    public void setSubtasks(Set<Task> subtasks) {
        this.subtasks = subtasks;
    }

}