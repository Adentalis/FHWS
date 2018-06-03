package Prog2.Exercise17;

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class Client{

        public static void main(String[] args) throws IOException {
                // wenn ich statt localhost die ip des Servers nehme, kann ich übers wlan mit der Person schreiben
            while(true) {
                final BufferedReader inFromUser = new BufferedReader( new InputStreamReader( System.in ) );
                final Socket clientSocket = new Socket( "localhost", 6789 );
                final DataOutputStream outToServer = new DataOutputStream( clientSocket.getOutputStream( ) );
                final BufferedReader inFromServer = new BufferedReader( new InputStreamReader( clientSocket.getInputStream( ) ) );


                System.out.println("INPUT: ");
                final String input = inFromUser.readLine();

                outToServer.writeBytes(input + "\n");
                final String output = inFromServer.readLine();

                System.out.println("RESPONSE FROM SERVER: " + output);

                clientSocket.close();
            }
        }
}
