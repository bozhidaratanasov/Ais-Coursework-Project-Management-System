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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((roleCode == null) ? 0 : roleCode.hashCode());
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
		Role other = (Role) obj;
		if (roleCode == null) {
			if (other.roleCode != null)
				return false;
		} else if (!roleCode.equals(other.roleCode))
			return false;
		return true;
	}
    
    

}