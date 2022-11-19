import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class BroadcastSend {
	private DatagramSocket socket;
	private DatagramPacket paquet;
	private String messBienvenue;
	private User user;
	public static int numPortBroadcast=1555;
	

	public BroadcastSend(User u) {
		
		//mise en place du packet à envoyer à tous les users
		InetAddress broadcastAdr=InetAddress.getByName("255.255.255.255");
		user=u;
		messBienvenue=user.getPseudo();
		paquet=new DatagramPacket(messBienvenue.getBytes(),messBienvenue.length(),
	              broadcastAdr,numPortBroadcast);
		//envoie de ce paquet
		socket=new DatagramSocket(numPortBroadcast);
		socket.send(paquet);
	}
	public DatagramSocket getDatagramSocket()
	{
		return socket;
	}
	public BroadcastSend getBroadcastSend()
	{
		return this;
	}

}
