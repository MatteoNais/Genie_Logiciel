package myPackage;

public class DossierBancaire {
	
	
	private Compte_courant compte_c; // Création d'un objet compte courant .
	private Compte_epargne compte_e; // Création d'un objet compte épargne.
	public DossierBancaire() //Constructeur
    {
		compte_c = new Compte_courant(); //Initialisation des objets compte courant et compte épargne.
    	compte_e= new Compte_epargne();
    }

    public void deposer(double value) // méthode permettant de déposer de l'argent.
    {
    	compte_c.add_solde(value*0.4);
    	compte_e.add_solde(value*0.6);
    }
    public double get_solde() // méthode permettant de consulter le solde.
    {
    	double total = 0;
    	total += compte_c.get_solde();
    	total += compte_e.get_solde();
    	return total;
    }
    public void remunerer() {compte_e.add_solde(compte_e.get_solde()*0.032);} // méthode permettant de rémunerer le compte épargne.
    
    public void retirer(double montant) throws Exception
    {
    	if(montant > compte_c.get_solde()) throw new Exception("Solde insuffisant");
    	if(montant <= 0) throw new Exception("Le montant est inférieur à zéro");
    	else compte_c.retirer(montant);
    }
}
