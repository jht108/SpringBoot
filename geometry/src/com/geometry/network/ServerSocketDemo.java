package com.geometry.network;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;
import java.util.Scanner;

public class ServerSocketDemo {
    private static final  String ENCODDING = "UTF-8";

    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(8888);
        Socket socket = serverSocket.accept();
        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String str;
        while ((str = reader.readLine()) != null){
            System.out.println( new Date() + ":\n客户端说："+reader.readLine());
        }

    }
}
