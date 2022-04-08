package lights;

import java.awt.Color;

import org.junit.Assert;
import org.junit.Test;

public class MyHolidayLightsTest {
//ffsfsefhbh
	@Test public void checkNext() {
		MyHolidayLights testLight = new MyHolidayLights(12);
		testLight.myLights = testLight.next();
		Assert.assertTrue(testLight.myLights.get(testLight.indexOfLight-1).isOn()==true);
		testLight.myLights = testLight.next();
		Assert.assertTrue(testLight.myLights.get(testLight.indexOfLight-1).isOn()==true);
	}
	
}
