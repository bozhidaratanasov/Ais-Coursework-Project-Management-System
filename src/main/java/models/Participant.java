package models;

import java.util.*;

/**
 * 
 */
public class Participant {
	
	private String firstName;
    private String lastName;
    private String email;
    private Set<Role> roles;
    private Set<Project> projects;
    private Set<Task> tasks;

    /**
     * Default constructor
     */
    public Participant() {
    }

    

    /**
     * @return
     */
    public String getFirstName() {
       return this.firstName;
    }

    /**
     * @param firstName 
     * @return
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return
     */
    public String getLastName() {
        return this.lastName;
    }

    /**
     * @param lastName 
     * @return
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * @param email 
     * @return
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return
     */
    public Set<Role> getRoles() {
        return this.roles;
    }

    /**
     * @param roles 
     * @return
     */
    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    /**
     * @return
     */
    public Set<Project> getProjects() {
        return this.projects;
    }

    /**
     * @param projects 
     * @return
     */
    public void setProjects(Set<Project> projects) {
        this.projects = projects;
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

}