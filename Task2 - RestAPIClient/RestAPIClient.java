
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class RestAPIClient {

    public static void main(String[] args) {

        try {

            String apiUrl = "https://jsonplaceholder.typicode.com/posts/1";

            URL url = new URL(apiUrl);

            HttpURLConnection connection =
                    (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("GET");

            int responseCode = connection.getResponseCode();

            System.out.println("Response Code: " + responseCode);

            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(connection.getInputStream()));

            String inputLine;
            StringBuilder response = new StringBuilder();

            while ((inputLine = reader.readLine()) != null) {
                response.append(inputLine);
            }

            reader.close();

            System.out.println("\nAPI Response:");
            System.out.println(response.toString());

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());
        }
    }
}
