package inheritance;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity(name = "pemp_tbcc")

public class PermanentEmployeeTPCC extends EmployeeTPCC {
	
	private String designation;

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
}
