package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import myPackage.Compte_courant;

public class TestCompteCourant {
	public void test_constructeur() {
		Compte_courant cc = new Compte_courant();
		assertEquals(0, cc.get_solde(),0);
	}
	@Test
	public void test_depot() {
		Compte_courant cc = new Compte_courant();
		cc.add_solde(20);
		assertEquals(20, cc.get_solde(),0);
	}
}
