package models;
import java.util.*;

/**
 * 
 */
public class Role {
	
	private String roleCode;
    private Set<Participant> participants;

    /**
     * Default constructor
     */
    public Role() {
    }

    /**
     * 
     */
    

    /**
     * @return
     */
    public String getRoleCode() {
        return this.roleCode;
    }

    /**
     * @param roleCode 
     * @return
     */
    public void setRoleCode(String roleCode) {
       this.roleCode = roleCode;
    }

    /**
     * @return
     */
    public Set<Participant> getParticipants() {
        return this.participants;
    }

    /**
     * @param users 
     * @return
     */
    public void setParticipants(Set<Participant> participants) {
        this.participants = participants;
    }

}