package lights;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

public class MyHolidayLights implements HolidayLights {
	
	int length;
	List<Light> myLights;
	int indexOfLight = 0;

	public MyHolidayLights(int length) {
		this.length = length;
	}
	
	public List<Light> next() {
		myLights = new ArrayList<Light>();
		for(int i=0; i<length; i++) {
			ColoredLight coloredLight = new ColoredLight(Color.red);
			myLights.add(coloredLight);
		}
		
		myLights.get(indexOfLight).setOn(true);
		((ColoredLight) myLights.get(indexOfLight)).randomChange();
		
		myLights.get(length-1-indexOfLight).setOn(true);
		((ColoredLight) myLights.get(length-1-indexOfLight)).randomChange();
		
		indexOfLight++;
		if(length % 2 == 1) {
			if(indexOfLight >= length/2+1)
				indexOfLight = 0;
		}
		else {
			if(indexOfLight >= length/2)
				indexOfLight = 0;
		}
		
		return myLights;
	}
	
	public int getLength() {
		return length;
	}
	
	//0.2-2 hoorond bna
	public float randomIntervalSecond() {
		return (float) (Math.random() * 1.8 + 0.2);
	}				
}