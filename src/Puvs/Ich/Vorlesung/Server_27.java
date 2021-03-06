package Puvs.Ich.Vorlesung;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server_27 {
    public static void main( String[] args ) throws Exception {
        ServerSocket serverSocket = new ServerSocket( 6789 );
        System.out.println("Server running");

         while ( true ) {
             Socket socket = serverSocket.accept( );
             InputStreamReader inputStreamReader = new InputStreamReader( socket.getInputStream( ) );
             BufferedReader inFromClient = new BufferedReader( inputStreamReader );

             String input = inFromClient.readLine( );
            System.out.println( "Received: " + input );

             String output = input.toUpperCase( );

             OutputStreamWriter outputStreamWriter = new OutputStreamWriter( socket.getOutputStream( ) );
             BufferedWriter bufferedWriter = new BufferedWriter( outputStreamWriter );
             bufferedWriter.append( output ).append( "\n" );
             bufferedWriter.flush( );
             bufferedWriter.close( );
             }
         }
}
