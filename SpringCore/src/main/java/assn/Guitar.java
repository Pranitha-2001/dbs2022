package assn;

import org.springframework.stereotype.Component;

@Component
public class Guitar  implements Instrument {
	public Guitar() {
		
	}
	public void play()
	{
		System.out.println("Guitar is playing");
	}

}
