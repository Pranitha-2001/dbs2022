package assn;

import org.springframework.stereotype.Component;

@Component
public class Violin implements Instrument {
	public Violin() {
		
	}
	public void play() {
		System.out.println("Violin is playing");
	}

}
