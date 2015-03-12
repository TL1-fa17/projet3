package server;

import java.io.*;
import java.net.*;

public class Server {
 public static ServerSocket ss = null;
 public static Thread t;

 
	public static void main(String[] args) {
		
		int port = 2015;
		
		try {
			ss = new ServerSocket(port);
			System.out.println("Le serveur est à l'écoute du port "+ss.getLocalPort());
			
			t = new Thread(new Accept_connexion(ss));
			t.start();
			
		} catch (IOException e) {
			System.err.println("Le port "+ss.getLocalPort()+" est déjà utilisé !");
		}
	
	}

	
	}