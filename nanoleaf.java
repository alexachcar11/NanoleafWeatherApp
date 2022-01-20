// using https://github.com/rowak/nanoleaf-api#manual for quick usage

import io.github.rowak.nanoleafapi.*;

public class nanoleaf { 

    public static void main(String[] args) throws Exception { 

        String ip = "{specify ip address}";
        int port = 16021; // will always be 16021
        String accessToken = "{specify access token}";

        // create an aurora variable which locates the reference to your aurora object
        Aurora aurora = new Aurora(ip, port, accessToken);

        // get the temperature from the openweathermap api
        Double temp = Weather.getTemp();

        // set the color of the lights to blue
        aurora.setColor(Color.BLUE);
        
        // change the brightness of the lights according to the temperature outside
        if(temp>=20) { 
            aurora.setBrightness(100);
        } else if(temp>=15 && temp<20) { 
            aurora.setBrightness(90);
        } else if(temp>=10 && temp<15) { 
            aurora.setBrightness(80);
        } else if(temp>=5 && temp<10) { 
            aurora.setBrightness(70);
        } else if(temp>=0 && temp<5) { 
            aurora.setBrightness(60);
        } else if(temp>=-5 && temp<0) { 
            aurora.setBrightness(50);
        } else if(temp>=-10 && temp<-5) { 
            aurora.setBrightness(40);
        } else if(temp>=-15 && temp<-10) { 
            aurora.setBrightness(30);
        } else if(temp>=-20 && temp<-15) { 
            aurora.setBrightness(20);
        } else if(temp<-20) { 
            aurora.setBrightness(10);
        }
    }

}