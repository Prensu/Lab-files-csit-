//Network Programming in java allows two devices to communicate over a network..jAVA provides a .net package for this . 


// Core Concepts 
// 1)Ip address and port - used to identify a device on a network.
// 2)Socket - Endpoint for sending and receiving data.
// 3)ServerSocket - Listens for incoming connections on a specific port.
// 4)Input/output streams - Used to read and write data to/from the socket.

import java.net.*;  // For networking classes like ServerSocket and Socket
import java.io.*;   // For input/output streams

public class SimpleServer {
    public static void main(String[] args) {
        try {
            // Step 1: Create a ServerSocket that listens on port 5000
            ServerSocket serverSocket = new ServerSocket(5000);
            System.out.println("Server is listening on port 5000...");

            // Step 2: Wait for a client to connect (blocking call)
            Socket socket = serverSocket.accept();
            System.out.println("Client connected!");

            // Step 3: Create an input stream to receive data from the client
            BufferedReader in = new BufferedReader(new (socket.getInputStream()));
            String message = in.readLine();  // Read a line of text from the client
            System.out.println("Message from client: " + message);

            // Step 4: Create an output stream to send data back to the client
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            out.println("Hello from Server!");  // Send a response

            // Step 5: Close all resources (best practice)
            in.close();           // Close input stream
            out.close();          // Close output stream
            socket.close();       // Close socket connection
            serverSocket.close(); // Stop listening for new connections
        } catch (IOException e) {
            e.printStackTrace(); // Print error if any I/O exception occurs
        }
    }
}



// Process 
// 1)create a server socket on a specific port eg(5000)
// 2)wait for a client to connect using the accept() method.
// 3)Once a client connects, create input and output streams to communicate with the client.
// 4)Send a message to the client and read a message from the client.