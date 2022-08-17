package inheritance;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity(name = "temp_tbc")
@DiscriminatorValue("TEMP")
public class TemporaryEmployeeTPC extends EmployeeTPC {

	private int workingdays;

	public int getWorkingdays() {
		return workingdays;
	}

	public void setWorkingdays(int workingdays) {
		this.workingdays = workingdays;
	}
	
}
