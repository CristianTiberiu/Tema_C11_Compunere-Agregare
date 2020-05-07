package tech;

public class Microphone {
	private int maxVolume;
	private int crtVolume;

	public Microphone(int maxVolume) {
		this.maxVolume = maxVolume;
		this.crtVolume = this.maxVolume / 4;
	}

	public Microphone(int maxVolume, int crtVolume) {
		this.maxVolume = maxVolume;
		this.crtVolume = crtVolume;
	}

	public boolean increaseVolume() {
		if (this.crtVolume < this.maxVolume) {
			this.crtVolume += 1;
			System.out.println("Volume is now " + crtVolume);
			return true;
		} else {
			return false;
		}
	}

	public boolean decreaseVolume() {
		if (crtVolume > 0) {
			crtVolume -= 1;
			System.out.println("Volume is now " + crtVolume);
			return true;
		} else {
			return false;
		}
	}

	public void muteMicrophone() {
		this.crtVolume = 0;
		System.out.println("Muted - volume is: " + crtVolume);
	}
}
