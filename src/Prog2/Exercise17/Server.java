package Prog2.Exercise17;


import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {

        final ServerSocket serverSocket = new ServerSocket(6789);


        while (true) {

            Socket socket = serverSocket.accept();
            InputStreamReader inputStreamReader = new InputStreamReader(socket.getInputStream());
            BufferedReader inFromClient = new BufferedReader(inputStreamReader);

            String input = inFromClient.readLine();

            System.out.println("Ali: " + input);
            final BufferedReader inFromUser = new BufferedReader( new InputStreamReader( System.in ) );
            String output = inFromUser.readLine();

            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(socket.getOutputStream());
            BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
            bufferedWriter.append(output).append("\n");
            bufferedWriter.flush();
            bufferedWriter.close();
        }

    }

}