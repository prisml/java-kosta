package step4;

public class PlayerService {
	int count;
	Player[] list;

	public PlayerService(int i) {
		list = new Player[i];
	}

	public void addPlayer(Player p) {
		list[count++] = p;

	}

	public void executeAll() {
		for (int i = 0; i < count; i++){
			if(list[i] instanceof CDPlayer)
				((CDPlayer)list[i]).insertCD();
			list[i].play();
		}
	}

}
