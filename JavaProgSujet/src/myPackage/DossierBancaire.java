package myPackage;

public class DossierBancaire {
	
	//Constructeur
	private Compte_courant cc;
    public DossierBancaire()
    {
    	cc = new Compte_courant();
    }

    public void deposer(double value) {cc.add_solde(value);}
    public double get_solde() {return cc.get_solde();}
    public void remunerer() {}

}
