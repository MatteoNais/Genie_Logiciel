package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import myPackage.DossierBancaire;

public class TestDossierBancaire {

	@Test
	public void test_constructeur() {
		DossierBancaire db = new DossierBancaire();
		
		assertEquals(0, db.get_solde(),0);
	}
	@Test
	public void test_depot() {
		DossierBancaire db = new DossierBancaire();
		db.deposer(20);
		assertEquals(20, db.get_solde(),0);
	}

}
