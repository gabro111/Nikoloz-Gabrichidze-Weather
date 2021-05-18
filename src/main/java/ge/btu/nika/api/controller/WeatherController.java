package ge.btu.nika.api.controller;


import ge.btu.nika.api.model.DirectionType;
import ge.btu.nika.api.model.Weather;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

@Path("/weather")
public class WeatherController {

    @GET
    @Path("/hi")
    public String sayHallo(){
        return "Hello !";
    }

    @GET
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Weather> getWeather() {
        List<Weather> weatherList=new ArrayList<>();
        weatherList.add(new Weather("tbilisi",12,23,22.1, DirectionType.EAST,22));
        weatherList.add(new Weather("batumi",25,11,73, DirectionType.WEST,22));
        weatherList.add(new Weather("kutaisi",32,14,71, DirectionType.EAST,20));
        return weatherList;
    }
    @GET
    @Path("/{city}")
    @Produces(MediaType.APPLICATION_JSON)
    public Weather getStudent(@PathParam("city") String name) {
        List<Weather> weatherList = getWeather();
        for(Weather weather : weatherList){
            if(weather.getName().equals(name)){
                return weather;
            }
        }
        return new Weather("No Data",0,0,0,null,0);

    }
}
