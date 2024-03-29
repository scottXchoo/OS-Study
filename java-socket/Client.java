import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        try {
            /* make connection to server socket */
            Socket socket = new Socket("127.0.0.1", 6666);

            InputStream in = socket.getInputStream();
            BufferedReader bin = new BufferedReader(new InputStreamReader(in));

            /* read the date from the socket */
            String line;
            while ((line = bin.readLine()) != null) {
                System.out.println(line);
            }

            /* close the socket communication */
            socket.close();
        } catch (IOException ioe) {
            System.err.println(ioe);
        }
    }
}