package Project;

import java.util.*;

public class Position {
	
	List<String> positions = new ArrayList<String>();
	
	public void createPos() {
		for (int i = 1; i <= 100; i++) {
			switch(i % 10) {
			case 1:
				positions.add("" + i + "st");
				break;
			case 2:
				positions.add("" + i + "nd");
				break;
			case 3:
				positions.add("" + i + "rd");
				break;
			default:
				positions.add("" + i + "th");
				break;
			}
		}
	}
	
	public String getPos(int index) {
		return positions.get(index - 1);
	}
	
	public void printOtherPlaces(int index) {
		List<String> temp = positions;
		temp.remove(index - 1);
		for (String s: temp) {
			System.out.println(s);
		}
	}

}
