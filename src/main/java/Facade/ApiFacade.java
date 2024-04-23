package Facade;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ApiFacade {
    public String getAttributeValueFromJson(String urlString, String attributeName) throws IOException, IllegalArgumentException {
        String jsonResult = getJsonFromApi(urlString);
        return extractAttributeFromJson(jsonResult, attributeName);
    }

    private String getJsonFromApi(String apiUrl) throws IOException {
        URL url = new URL(apiUrl);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");

        try (BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()))) {
            String inputLine;
            StringBuilder content = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            return content.toString();
        } finally {
            con.disconnect();
        }
    }

    private String extractAttributeFromJson(String json, String attributeName) throws IllegalArgumentException {
        JSONParser parser = new JSONParser();
        try {
            JSONObject jsonObject = (JSONObject) parser.parse(json);
            if (jsonObject.containsKey(attributeName)) {
                return (String) jsonObject.get(attributeName);
            } else {
                throw new IllegalArgumentException("Attribute not found in JSON");
            }
        } catch (ParseException e) {
            throw new IllegalArgumentException("Error parsing JSON", e);
        }
    }
}