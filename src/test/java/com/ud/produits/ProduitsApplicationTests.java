package com.ud.produits;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ud.produits.model.Produit;
import com.ud.produits.repository.ProduitRepository;

@SpringBootTest
class ProduitsApplicationTests {

	@Autowired
	private ProduitRepository produitRepository;
	
	@Test
	public void testCreateProduit() {
		Produit p = new Produit("PC Dell", 2200.500, new Date());
		produitRepository.save(p);
	}

	@Test
	public void testFindProduit() {
		produitRepository.findById(1L).get();
	}
	
	@Test
	public void testUpdateProduit() {
		Produit p = produitRepository.findById(1L).get();
		p.setPrix(2000.0);
		produitRepository.save(p);
	}
	
	@Test
	public void testDeleteProduit() {
		produitRepository.deleteById(1L);
	}
	
	@Test
	public void testFindAllProduit() {
		List<Produit> pList = produitRepository.findAll();
		for (Produit p : pList) {
			System.out.println(p);
		}
	}
}
