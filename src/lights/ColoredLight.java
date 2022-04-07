package lights;

import java.awt.Color;

public class ColoredLight extends Light{
	
	Color lightColor;
	
	/**
	 * Creates a new colored light.
	 * @param color - color of this light.
	 */
	public ColoredLight(Color color) {
		// TODO
		lightColor = color;
		//throw new RuntimeException("ColoredLight(Color) not yet implemented!");
	}
	
	/**
	 * Returns the color of this light.
	 * @return color of this light.
	 */
	public Color getColor() {
		// TODO
		return lightColor;
		//throw new RuntimeException("ColoredLight.getColor() not yet implemented!");
	}
	
	/**
	 * Changes the color of this light to be c.
	 */
	public void setColor(Color c) {
		// TODO
		lightColor = c;
		//throw new RuntimeException("ColoredLight.setColor() not yet implemented!");
	}
	
	/**
	 * Randomly changes this light to be on or off and its color.
	 */
	@Override
	public void randomChange() {
		// TODO. 
		lightColor = new Color((int) (Math.random()*255), (int) (Math.random()*255), (int) (Math.random()*255));
		// Take advantage of Light.randomChange
		//throw new RuntimeException("ColoredLight.randomChange() not yet implemented!");
	}
	
}