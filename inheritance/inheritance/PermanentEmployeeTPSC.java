package inheritance;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity(name = "pemp_tbsc")

public class PermanentEmployeeTPSC extends EmployeeTPSC {
	private String designation;

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
}
