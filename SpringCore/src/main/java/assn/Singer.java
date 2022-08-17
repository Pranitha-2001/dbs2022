package assn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Singer {
	@Value ("SRM")
	private String name;
	@Autowired
	@Qualifier("guitar")
	private Instrument instrument;
	public Singer() {
		
	}
	public Singer(String name, Instrument instrument) {
		super();
		this.name = name;
		this.instrument = instrument;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Instrument getInstrument() {
		return instrument;
	}
	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}
	@Override
	public String toString() {
		return "Singer [name=" + name + ", instrument=" + instrument + "]";
	}
	
	public void display() {
		System.out.println("singer name - "+this.name+" instrument used is ");
		this.instrument.play();
	}
	
		

	

}
