package service;

import java.io.IOException;

import businessObjects.Weather;
import dao.MockWeatherDAO;

public class WeatherService {

	public String saveWeather(Weather weather) throws IOException {

		MockWeatherDAO mockDAO = new MockWeatherDAO();

		if (weather.getHigh() > 180 && weather.getLow() < -30) {
			return "The weather cannot be greater than 180 or less than -30";
		}

		else {

			mockDAO.createFileAndSaveWeather(weather);

			return "The weather has been successfully saved in folder";
		}
	}

}
