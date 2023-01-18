package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import myPackage.Compte_epargne;

public class TestCompteEpargne {

	@Test
	public void test_constructeur() {
		Compte_epargne ce = new Compte_epargne();
		assertEquals(0, ce.get_solde(),0);
	}
	@Test
	public void test_depot() {
		Compte_epargne ce = new Compte_epargne();
		ce.add_solde(20);
		assertEquals(20, ce.get_solde(),0);
	}
	
}
