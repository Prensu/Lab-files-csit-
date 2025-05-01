import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPClient {
    public static void main(String[] args) {
        try {
            // Step 1: Create a UDP socket
            DatagramSocket socket = new DatagramSocket();

            // Step 2: Prepare the message to send
            String message = "Hello Server, this is the UDP Client!";
            byte[] data = message.getBytes();

            // Step 3: Create a packet to send to the server at localhost:5000
            InetAddress serverAddress = InetAddress.getByName("localhost");
            DatagramPacket packet = new DatagramPacket(data, data.length, serverAddress, 5000);
            socket.send(packet);  // Send packet to server

            // Step 4: Prepare to receive server's response
            byte[] buffer = new byte[1024];
            DatagramPacket response = new DatagramPacket(buffer, buffer.length);
            socket.receive(response);  // Wait for reply

            // Step 5: Display the server's reply
            String serverReply = new String(response.getData(), 0, response.getLength());
            System.out.println("Server says: " + serverReply);

            // Step 6: Close the socket
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
