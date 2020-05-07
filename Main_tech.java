package tech;

public class Main_tech {	
	public static void main(String[] args) {
		
		Smartphone Jasmine = new Smartphone(55, 7, 8, 2, 100, 100);
		Jasmine.pressVolumeDown();
		Jasmine.pressVolumeUp();
		Jasmine.setPixel(2, "red");
		Jasmine.colorScreen("yellow");
		Jasmine.increaseMicrophoneVolume();
		Jasmine.decreaseMicrophoneVolume();
		Jasmine.setSilenceMode();
		Jasmine.muteMicrophone();
		
		Smartphone Jason = new Smartphone(62, 6, 9, 3, 100, 28, 100, 61);
		
		Jason.pressVolumeUp();
		Jason.pressVolumeDown();
		Jason.setPixel(5, "white");
		Jason.colorScreen("orange");
		Jason.increaseMicrophoneVolume();
		Jason.decreaseMicrophoneVolume();
		Jason.setSilenceMode();
		Jason.muteMicrophone();
	}
}
