package homework4;

import java.io.*;
import java.net.*;
import java.util.*;

public class TimeClient {
    public static void main(String[] args) throws IOException {
        try {
            Socket socket = new Socket("127.0.0.1", 10000);
            System.out.println("Client Socket Created");

            BufferedReader inFromServer = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            String currentDate = inFromServer.readLine();
            System.out.println("From TimeServer: " + currentDate);
            socket.close();
            System.out.println("Socket Closed! Bye! :)");
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
