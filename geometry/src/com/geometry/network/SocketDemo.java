package com.geometry.network;

import java.io.*;
import java.net.Socket;
import java.util.Date;

public class SocketDemo {
    public static void main(String[] args) throws  Exception{

        Socket socket = new Socket("127.0.0.1",8888);

        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        //通过标准输入流获取字符流           
        BufferedReader bufferedReader =new BufferedReader(new InputStreamReader(System.in,"UTF-8"));
        Boolean end = false;
        while (!end){
            String str = bufferedReader.readLine();
            if("!".equals(str)){
                end = true;
                continue;
            }
            bufferedWriter.write(str);
            bufferedWriter.write("\n");
            bufferedWriter.flush();
        }
        socket.shutdownOutput();
        socket.close();
    }
}
