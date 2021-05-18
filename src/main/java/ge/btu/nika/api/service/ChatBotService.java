package ge.btu.nika.api.service;


import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class ChatBotService {


    public static void main(String[] args) throws Exception {
        get();
    }


    public static String get() throws Exception {

        URL url = new URL("http://localhost:8080/RestFullWeb_war_exploded/api/weather/");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Accept", "application/json");

        BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));

        String output ;

        String asd = "";
        while ((output = br.readLine()) != null) {
            asd += output;


        }
        conn.disconnect();
        return asd;

    }
    public static String getCity(String City) throws Exception {

        URL url = new URL("http://localhost:8080/RestFullWeb_war_exploded/api/weather/"+City);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Accept", "application/json");

        BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));

        String output ;

        String asd = "";
        while ((output = br.readLine()) != null) {
            asd += output;


        }


        conn.disconnect();
        return asd;
    }

    public static String answer(String question) throws Exception {
        String result;

        switch (question) {
            case "all":
                result = get();
                break;
            default:
                result = getCity(question.toLowerCase());
        }

        return result;
    }
}

