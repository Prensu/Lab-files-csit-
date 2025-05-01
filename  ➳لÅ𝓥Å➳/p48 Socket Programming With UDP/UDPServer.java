import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPServer {
    public static void main(String[] args) {
        try {
            // Step 1: Create a socket to listen on port 5000
            DatagramSocket socket = new DatagramSocket(5000);
            System.out.println("UDP Server is running...");

            // Step 2: Prepare a buffer to receive incoming data
            byte[] buffer = new byte[1024];
            DatagramPacket request = new DatagramPacket(buffer, buffer.length);

            // Step 3: Receive data from client
            socket.receive(request);
            String clientMessage = new String(request.getData(), 0, request.getLength());
            System.out.println("Client says: " + clientMessage);

            // Step 4: Prepare response message
            String responseMessage = "Hello from UDP Server!";
            byte[] responseData = responseMessage.getBytes();

            // Step 5: Send response to the client
            InetAddress clientAddress = request.getAddress();
            int clientPort = request.getPort();
            DatagramPacket response = new DatagramPacket(responseData, responseData.length, clientAddress, clientPort);
            socket.send(response);

            // Step 6: Close the socket
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
