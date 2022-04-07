package lights;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

public class RunningHolidayLights implements HolidayLights {
	
	int length;
	List<Light> myLights;
	int indexOfLight = 0;
	
	/**
	 * Creates new running holiday lights.
	 * @param length - length of this set of lights.
	 */
	public RunningHolidayLights(int length) {
		
		this.length = length;
		
		// TODO
		//throw new RuntimeException("RunningHolidayLights(length) not yet implemented!");
	}
	
	public List<Light> next() {
		// TODO
		myLights = new ArrayList<Light>();
		for(int i=0; i<length; i++) {
			Light light = new Light();
			myLights.add(light);
		}
		myLights.get(indexOfLight).setOn(true);
		indexOfLight++;
		if(indexOfLight >= length)
			indexOfLight = 0;
		return myLights;
		//throw new RuntimeException("RunningHolidayLights.next() not yet implemented!");
	}
	
	/**
	 * Returns the length of this
	 * @return length of this
	 */
	public int getLength() {
		return length;
		// TODO
		//throw new RuntimeException("RunningHolidayLights.getLength() not yet implemented!");
	}

	@Override
	public float randomIntervalSecond() {
		// TODO Auto-generated method stub
		return 1;
	}
						
}