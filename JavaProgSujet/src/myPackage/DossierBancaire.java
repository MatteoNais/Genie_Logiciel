package myPackage;

public class DossierBancaire {
	
	
	private Compte_courant cc; // Création d'un objet compte courant .
	private Compte_epargne ce; // Création d'un objet compte épargne.
	public DossierBancaire() //Constructeur
    {
    	cc = new Compte_courant(); //Initialisation des objets compte courant et compte épargne.
    	ce = new Compte_epargne();
    }

    public void deposer(double value) // méthode permettant de déposer de l'argent.
    {
    	cc.add_solde(value*0.4);
    	ce.add_solde(value*0.6);
    }
    public double get_solde() // méthode permettant de consulter le solde.
    {
    	double total = 0;
    	total += cc.get_solde();
    	total += ce.get_solde();
    	return total;
    }
    public void remunerer() {ce.add_solde(ce.get_solde()*0.032);} // méthode permettant de rémunerer le compte épargne.

}
