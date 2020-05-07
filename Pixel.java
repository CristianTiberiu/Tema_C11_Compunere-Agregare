package tech;

public class Pixel {
	
	private String color;
	
	public Pixel() {
		this.color = "#FFFFF";
	}
	
	public Pixel(String color) {
		this.color = color;
		System.out.println(color);
	}
	
	public void setPixel(String color) {
		this.color = color;
		System.out.println(color + " ");
	}
	
}
