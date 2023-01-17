package myPackage;

public class Compte {
	private double _solde;
	
	public Compte()
	{
		_solde = 0;
	}
	public void add_solde(double montant)
	{
		_solde += montant;
	}
	public double get_solde()
	{
		return _solde;
	}
}
