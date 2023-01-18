package myPackage;

public class DossierBancaire {
	
	//Constructeur
	private Compte_courant cc;
	private Compte_epargne ce;
    public DossierBancaire()
    {
    	cc = new Compte_courant();
    	ce = new Compte_epargne();
    }

    public void deposer(double value) 
    {
    	cc.add_solde(value*0.4);
    	ce.add_solde(value*0.6);
    }
    public double get_solde() 
    {
    	double total = 0;
    	total += cc.get_solde();
    	total += ce.get_solde();
    	return total;
    }
    public void remunerer() {ce.add_solde(ce.get_solde()*0.032);}

}
