package lights;

import java.awt.Color;

import org.junit.Assert;
import org.junit.Test;

public class ColorLightTest {

	@Test public void changeColorByConstructer() {
		ColoredLight coloredLight = new ColoredLight(Color.red);
		//yellow bol default color ni
		Assert.assertTrue(coloredLight.getColor() != Color.yellow);
	}
	
	@Test public void changeColorBySet() {
		ColoredLight coloredLight = new ColoredLight(Color.red);
		coloredLight.setColor(Color.green);
		Assert.assertTrue(coloredLight.getColor() != Color.red);
	}

	@Test public void testRandomChange() {
		ColoredLight coloredLight = new ColoredLight(Color.red);
		coloredLight.randomChange();
		Assert.assertTrue(coloredLight.getColor() != Color.red);
	}
	
}