package models;
import java.util.*;

/**
 * 
 */
public class Project {
	
	private String name;
	private String description;
	private Set<Participant> participants;
	private Set<Task> tasks;
	private Set<Project> subprojects;

    /**
     * Default constructor
     */
    public Project() {
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
    public Set<Participant> getParticipants() {
        return this.participants;
    }

    /**
     * @param participants 
     * @return
     */
    public void setParticipants(Set<Participant> participants) {
        this.participants = participants;
    }

    /**
     * @return
     */
    public Set<Task> getTasks() {
        return this.tasks;
    }

    /**
     * @param tasks 
     * @return
     */
    public void setTasks(Set<Task> tasks) {
        this.tasks = tasks;
    }

    /**
     * @return
     */
    public Set<Project> getSubprojects() {
    	return this.subprojects;
    }

    /**
     * @param subprojects 
     * @return
     */
    public void setSubprojects(Set<Project> subprojects) {
        this.subprojects = subprojects;
    }

}