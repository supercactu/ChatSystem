
public class User {
	private String pseudo;
	public static  int id=0;
	private int  numPort;
	private Boolean connect;
	private BroadcastSend broad;
	private Annuaire annuaire;
	
	public User() {
		//l'utilisateur choisit un pseudo
		choosePseudo();
		//un broadcast est effectué pour signaler l'arrivée de ce user
		broad=new BroadcastSend(this);

	}
	public Annuaire getAnnuaire() {
		return this.annuaire;
	}

}
