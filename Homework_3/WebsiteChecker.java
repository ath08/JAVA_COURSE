import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class WebsiteChecker {
    public static void main(String[] args) {
        String[] websites = {"https://www.google.com", "https://www.facebook.com", "https://www.youtube.com", "https://www.imdb.com"};

        for (String website : websites) {
            try {
                URL url = new URL(website);
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                connection.setRequestMethod("GET");

                int responseCode = connection.getResponseCode();
                if (responseCode == HttpURLConnection.HTTP_OK) {
                    System.out.println(website + " is accessible from your device.");
                } else {
                    System.out.println(website + " is not accessible from your device.");
                }
            } catch (IOException e) {
                System.out.println(website + " check your network connection.");
                break;
            }
        }
    }
}