package homework4;

import java.net.*;
import java.io.*;
import java.util.*;
import java.text.DateFormat;  
import java.text.SimpleDateFormat;  



public class TimeServer {
    public static void main(String[] args) throws IOException {
    	Socket connectionSocket = null;
    	
        try {
            ServerSocket serverSocket = new ServerSocket(10000);
            System.out.println("Connection Socket Created");
            
            while (connectionSocket == null) {
            	System.out.println("Waiting for Connection");
                connectionSocket = serverSocket.accept();	
            }
            
            System.out.println("Client connected");
            OutputStream os = connectionSocket.getOutputStream();
            PrintWriter out = new PrintWriter(os, true);
            Date currentDate = new Date();
            out.println(currentDate);
            connectionSocket.close();
            System.out.println("Socket Closed! Bye! :)");
            
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}

