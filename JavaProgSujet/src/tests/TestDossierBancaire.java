package tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.internal.runners.statements.Fail;

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
	
	@Test
	public void test_remunération() {
		DossierBancaire db = new DossierBancaire();
		db.deposer(100);
		db.remunerer();
		assertEquals(101.92, db.get_solde(),0);
	}
	
	@Test
	public void test_retirer() throws Exception {
		DossierBancaire db = new DossierBancaire();
		db.deposer(100);
		db.retirer(20);
		assertEquals(80, db.get_solde(),0);	
	}
	
	@Test
	public void test_retirer_fail() throws Exception {
		DossierBancaire db = new DossierBancaire();
		db.deposer(100);
		try {
		db.retirer(600);
		fail("Exception non levée");
		}
		catch(Exception ex) {}
		try {
			db.retirer(-20);
			fail("Exception non levée");
		}
		catch(Exception ex) {}
	}
}
