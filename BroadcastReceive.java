import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class BroadcastReceive extends Thread {
	private DatagramSocket socket;
	private DatagramPacket paquet;
	private String messageReçu ;
	private User user;

	public BroadcastReceive(User u) throws IOException {
		user=u;
		start();
			
	}

	public void run() {
		paquet=new DatagramPacket(messageReçu.getBytes(),messageReçu.length());
		//réception des paquets
		user.getBroadcastSend().getDatagramSocket().receive(paquet);
		messageReçu=paquet.getData().toString();
		user.getAnnuaire().
			
	}

}
