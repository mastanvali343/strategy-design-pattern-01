package cisco;

public class WeatherInfoService {
	String weather;
	public String getWeatherInformation(int zip) {
		
		if(zip==123456) {
			weather = "cool";
		}
		else if(zip==234567) {
			weather="Hot";
		}
		else if(zip==345678) {
			weather="rainy";
		}
		return weather;
		
	}
}
