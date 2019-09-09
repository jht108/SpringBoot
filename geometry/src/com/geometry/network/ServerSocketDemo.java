package com.geometry.network;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;
import java.util.Scanner;

public class ServerSocketDemo {
    private static final  String ENCODDING = "UTF-8";

    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(8888);
        Socket socket = serverSocket.accept();
        InputStream inputStream = socket.getInputStream();
        OutputStream outputStream = socket.getOutputStream();
        PrintWriter writer = new PrintWriter(new OutputStreamWriter(outputStream,ENCODDING));
        writer.println("服务端发送响应消息，当前时间为：" + new Date() + "\n输入!退出！");
        boolean done = false;
        Scanner in = new Scanner(inputStream,ENCODDING);
        String line = in.nextLine();
        writer.println("打印：" + line);
//        if(!done && in.hasNextLine()){
//            String line = in.nextLine();
//            writer.println("打印：" + line);
////            if(line.trim().equals("!")){
//////                done = true;
//////            }
//        }
    }
}
