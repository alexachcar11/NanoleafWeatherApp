// insight taken from https://www.youtube.com/watch?v=og5h5ppwXgU

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.*;


// Extracting the weather using OpenWeatherMap

public class weather { 

	public static void main(String[] args) throws Exception{ 

		try{ 

			StringBuilder str = new StringBuilder();

			URL url = new URL("https://api.openweathermap.org/data/2.5/weather?q=Montreal&appid={insert-api-key}");

			HttpURLConnection connection = (HttpURLConnection)url.openConnection();

			BufferedReader reader = new BufferedReader((new InputStreamReader(connection.getInputStream())));

			String line;

			while((line = reader.readLine()) != null) {
				str.append(line);
			}

			reader.close();

			
			// System.out.println(str); // <-- prints out all of the information provided by openweathermap

			JSONObject obj = new JSONObject(str.toString());

			// stores the kelvin temperature in a String variable
			String temp = obj.getJSONObject("main").get("temp").toString();;

			Double tempInK = Double.parseDouble(temp);
		
			// stores the celsius temperature in a Double variable
			Double tempInC = tempInK - 273.15;
			
			System.out.println(tempInC);
			

		}catch (IOException e){
			System.out.println(e.getMessage());
		}
		

	}

}