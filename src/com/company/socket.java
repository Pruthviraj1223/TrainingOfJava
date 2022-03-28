package com.company;


import java.io.*;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.SocketHandler;

public class socket {
    public static void main(String[] args) throws IOException {


        Socket socket = new Socket("localhost",6666);
        System.out.println("sending");


        InputStreamReader inputStreamReader = new InputStreamReader(socket.getInputStream());
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(socket.getOutputStream());

        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);


        while (true) {
            String output = bufferedReader.readLine();
            System.out.println("msg = " + output);

            Scanner scanner = new Scanner(System.in);

            if(output.equalsIgnoreCase("Bye")){
                bufferedWriter.write(scanner.nextLine());
                bufferedWriter.newLine();
                bufferedWriter.flush();
                socket.close();
                break;
            }

            bufferedWriter.write(scanner.nextLine());
            bufferedWriter.newLine();
            bufferedWriter.flush();


        }

    }
}
