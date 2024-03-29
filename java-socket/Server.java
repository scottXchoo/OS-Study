import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket socket = new ServerSocket(6666);

            /* new listen for connections */
            Socket client = socket.accept();

            PrintWriter pout = new PrintWriter(client.getOutputStream(), true);

            /* write the Data to the socket */
            pout.println(new java.util.Date());

            /* close the socket and reuse */
            /* listening for connections */
            client.close();
        } catch (IOException ioe) {
            System.err.println(ioe);
        }
    }
}
