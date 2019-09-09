package com.geometry.network;

import java.io.StringWriter;
import java.net.Socket;

public class SocketDemo {
    public static void main(String[] args) throws  Exception{

        Socket socket = new Socket("127.0.0.1",8888);
    }
}
