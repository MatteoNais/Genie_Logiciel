package myPackage;

public class Compte {
	private double _solde;
	
	public Compte() // Création du constructeur
	{
		_solde = 0; // initialisation du solde à 0
	}
	public void add_solde(double montant) // méthode ajoute au solde
	{
		_solde += montant; // On ajoute le montant au solde
	}
	public double get_solde() // méthode qui renvoie le solde
	{
		return _solde; 
	}
}
