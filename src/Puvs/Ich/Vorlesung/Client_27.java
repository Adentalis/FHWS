package Puvs.Ich.Vorlesung;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client_27 {
    public static void main( String argv[] ) throws Exception {
        System.out.println("Client running");

        Socket clientSocket = new Socket( "localhost", 6789 );

        DataOutputStream outToServer = new DataOutputStream( clientSocket.getOutputStream( ) );

         BufferedReader inFromUser = new BufferedReader( new InputStreamReader( System.in ) );

         BufferedReader inFromServer = new BufferedReader( new InputStreamReader( clientSocket.getInputStream( ) ) );

         //hier ist erst die Usereingabe
         String input = inFromUser.readLine( );

         outToServer.writeBytes( input + "\n" );
         String output = inFromServer.readLine( );

         System.out.println( "FROM SERVER: " + output );
         clientSocket.close( );
         }
}
