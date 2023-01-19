package myPackage;

public class Compte_courant extends Compte{ // Création de la classe compte courant 
											//par héritage de la classe Compte
		public void retirer(double montant) // création d'une méthode retirer
		{
			super.add_solde(-montant);
		}
}
