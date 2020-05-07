package tech;

public class Speaker {
	private int maxVolume;
	private int crtVolume;

	public Speaker(int maxVolume) {
		this.maxVolume = maxVolume;
		this.crtVolume = this.maxVolume / 4;
	}

	public Speaker(int maxVolume, int crtVolume) {
		this.maxVolume = maxVolume;
		this.crtVolume = crtVolume;
	}

	public Speaker() {
	}

	public boolean increaseVolume() {
		if (crtVolume < maxVolume) {
			crtVolume += 1;
			System.out.println("The volume was increased and now is: " + crtVolume);
			return true;
		} else {
			return false;
		}
	}

	public boolean decreaseVolume() {
		if (crtVolume > 0) {
			crtVolume -= 1;
			System.out.println("The volume was decreased and now is: " + crtVolume);
			return true;
		} else {
			return false;
		}
	}

	public void setSilenceMode() {
		this.crtVolume = 0;
		System.out.println("Muted - volume is now: " + crtVolume);
	}
}
