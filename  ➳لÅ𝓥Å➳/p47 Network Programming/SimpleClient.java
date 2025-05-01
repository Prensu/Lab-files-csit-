import java.net.*;  // For networking
import java.io.*;   // For I/O operations

public class SimpleClient {
    public static void main(String[] args) {
        try {
            // Step 1: Create a socket and connect it to the server's IP and port
            Socket socket = new Socket("localhost", 5000);  // localhost = same machine

            // Step 2: Create an output stream to send data to the server
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            out.println("Hello Server, this is the Client!");  // Send message

            // Step 3: Create an input stream to receive data from the server
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String response = in.readLine();  // Read the response from server
            System.out.println("Server says: " + response);

            // Step 4: Close all resources
            out.close();     // Close output stream
            in.close();      // Close input stream
            socket.close();  // Close the connection to server
        } catch (IOException e) {
            e.printStackTrace(); // Handle I/O errors
        }
    }
}
