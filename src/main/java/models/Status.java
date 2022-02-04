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
    
    public Status(String statusCode) {
    	this.statusCode = statusCode;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((statusCode == null) ? 0 : statusCode.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Status other = (Status) obj;
		if (statusCode == null) {
			if (other.statusCode != null)
				return false;
		} else if (!statusCode.equals(other.statusCode))
			return false;
		return true;
	}
    
    

}