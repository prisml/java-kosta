package step3;

import step2.Fighter;
import step2.Flyer;

public class FlyerService {

	int count;
	Flyer[] flyer;
	public FlyerService(int i) {
		flyer = new Flyer[i];
	}
	public void addFlyer(Flyer f) {
		if(count < flyer.length)
			flyer[count++] = f;
		else
			System.out.println("ÃÊ°ú");
	}
	public void executeFlyerAll() {
		for(int i=0;i<count;i++)
			flyer[i].fly();
		
	}
	public void executeFighterAll() {
		for(int i=0;i<count;i++){
			if(flyer[i] instanceof Fighter)
				((Fighter)flyer[i]).fight();
		}
	}

}
