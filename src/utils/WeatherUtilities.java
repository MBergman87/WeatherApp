package utils;

public class WeatherUtilities {

	public static boolean tempCheck(int tempHigh, int tempLow) {

		if (tempHigh > 20 && tempHigh < 120) {
			return true;
		}
		return false;

	}
}
