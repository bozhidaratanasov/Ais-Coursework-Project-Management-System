package models;
import java.util.*;

/**
 * 
 */
public class Status {
	
	 private String statusCode;
	 private Set<Task> tasks;

    /**
     * Default constructor
     */
    public Status() {
    }

    /**
     * 
     */
   

    /**
     * @return
     */
    public String getStatusCode() {
        return this.statusCode;
    }

    /**
     * @param statusCode 
     * @return
     */
    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
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