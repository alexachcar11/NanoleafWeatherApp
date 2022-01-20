# NanoleafWeatherApp
Program to change the color of Nanoleaf Aurora light fixtures according to the temperature

--

I used https://www.youtube.com/watch?v=og5h5ppwXgU to learn how to use the OpenWeatherMap API to get the temperatue outside. 

In order to use the openweathermap api, you need to register for an access key on their website at https://openweathermap.org. 

I used a json java library to parse the json weather output from openweathermap.org. I elected to download the jar and include it in my referenced libraries, but you can include it as a dependency in pom.xml if you are using maven. 

--

Likewise, I used https://github.com/rowak/nanoleaf-api#manual, which is a Nanoleaf Java Library, to change the color of the Nanoleaf light fixture.

In order to use this API, you must own a Nanoleaf Aurora light fixture. In order to initialize the Aurora object, you must find the IP address of the lights through your network. The authorization token for your lights can be found by using the IP and running a post request on Postman: POST http://{YOUR LIGHT IP ADDRESS}:16021/api/v1/new after holding down on the power button for 5-7 seconds. 

Once you have obtained the authorization token, you can instantialize an aurora object on your local system by replacing my indicators in Nanoleaf.java

-------------------------------------------

I still have some work to do for this class, but it is mostly complete. 
