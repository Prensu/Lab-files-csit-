//Java's url class provides methods to 
// 1)Parse and access the components of a URL.
// 2)Open a connection to a remote server 
// 3)Read data from a URL stream

import java.net.URL;
import java.net.URLConnection;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class URLReaderExample {
    public static void main(String[] args) {
        try {
            // Create a URL object pointing to a web resource
            URL url = new URL("https://prensu.com.np");

            // Open a connection to the URL
            URLConnection connection = url.openConnection();

            // Open a BufferedReader to read data from the input stream
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(connection.getInputStream()));

            String inputLine;

            // Read and print each line from the webpage
            while ((inputLine = in.readLine()) != null) {
                System.out.println(inputLine);
            }

            // Close the stream
            in.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
