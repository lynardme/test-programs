package biomatters;

import java.util.ArrayList;
import java.util.List;

class ThreeFive {

	static List<String> doThreeFive(int max) {
		List<String> retString = new ArrayList<>();

		for (int i = 1; i <= max; i++) {
			if ((i % 3 == 0) && (i % 5 == 0)) {
				retString.add("threefive" + " ");
			} else {
				if (i % 3 == 0) {
					retString.add("three" + " ");
				} else if (i % 5 == 0) {
					retString.add("five" + " ");
				} else {
					retString.add(Integer.toString(i) + " ");
				}
			}

		}

		return retString;
	}

	public static void main(String[] args) {
		System.out.println(ThreeFive.doThreeFive(16));
	}
}