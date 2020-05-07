package tech;

import java.util.ArrayList;

public class Screen {

	private ArrayList<Pixel> pixels;
	private Dimensions dimensions;

	public Screen(int noOfPixels, int width, int length, int depth) {
		this.pixels = new ArrayList<Pixel>(noOfPixels);
		this.dimensions = new Dimensions(width, length, depth);
		for (int i = 0; i < noOfPixels; i++) {
			pixels.add(new Pixel());
		}
	}

	public void setPixel(int pixelIndex, String color) {
		System.out.println("Pixel " + pixelIndex + " has color: ");
		this.pixels.get(pixelIndex).setPixel(color);
	}

	public void colorScreen(String color) {
		for (int i = 0; i < pixels.size(); i++) {
			this.pixels.get(i).setPixel(color);
		}
		System.out.println("The screen was colored with " + color);
	}

}
